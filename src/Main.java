public class Main {
    public static void main(String[] args) {
        System.out.println(FindNumber(5));
    }

    public static long FindNumber(int n) {
        int foundedNumbersCount = 0;
        long numberToCheck = 10;
        long foundNumber = 0;
        do {
            if (CheckCondition(numberToCheck)) {
                foundedNumbersCount++;
                numberToCheck++;
            } else {
                numberToCheck++;
            }
        } while (foundedNumbersCount != n);
        foundNumber = numberToCheck - 1;
        return foundNumber;
    }

    public static boolean CheckCondition(Long numberToCheck) {
        Integer sumOfDigits = 0;
        String[] numbersString = numberToCheck.toString().split("");
        Long powerOfSum = 0L;
        for (String numberString : numbersString
        ) {
            sumOfDigits += Integer.parseInt(numberString);
        }
        if (sumOfDigits > 1) {
            for (int i = 2; powerOfSum < numberToCheck; i++) {
                powerOfSum = (long) Math.pow(sumOfDigits, i);
                if (powerOfSum.equals(numberToCheck)) return true;
            }
        }
        return false;
    }
}
