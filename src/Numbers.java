public class Numbers {
    private int[] numbers;

    // Constructor
    public Numbers(int[] inputNumbers) {
        this.numbers = inputNumbers;
    }

    public int getMaxNumber() {
        if (numbers.length == 0) {
            return 0;
        }
        int max = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public int getMinNumber() {
        if (numbers.length == 0) {
            return 0;
        }
        int min = numbers[0];
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    // Maximale Summe von n-1 Zahlen
    public int getMaxSum() {
        if (numbers.length <= 1) {
            return 0;
        }
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum - getMinNumber();
    }

    public int getMinSum() {
        if (numbers.length <= 1) {
            return 0;
        }
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum - getMaxNumber();
    }
}
