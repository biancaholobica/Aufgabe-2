public class Main {
    public static void main(String[] args) {
        int[] inputNumbers = {29, 37, 38, 41, 84, 67};

        Numbers numbers = new Numbers(inputNumbers);

        System.out.println("Max number: " + numbers.getMaxNumber());
        System.out.println("Min number: " + numbers.getMinNumber());
        System.out.println("Max sum of n-1 numbers: " + numbers.getMaxSum());
        System.out.println("Min sum of n-1 numbers: " + numbers.getMinSum());
    }
}
