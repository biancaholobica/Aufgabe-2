//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    List<Integer> inputNumbers = new ArrayList<>();
    inputNumbers.add(29);
    inputNumbers.add(37);
    inputNumbers.add(38);
    inputNumbers.add(41);
    inputNumbers.add(84);
    inputNumbers.add(67);

    Numbers numbers = new Numbers(inputNumbers);

    System.out.println("Max number: " + numbers.getMaxNumber());
    System.out.println("Min number: " + numbers.getMinNumber());
    System.out.println("Max sum of n-1 numbers: " + numbers.getMaxSum());
    System.out.println("Min sum of n-1 numbers: " + numbers.getMinSum());
}
