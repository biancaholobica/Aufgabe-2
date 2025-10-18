import java.util.ArrayList;
import java.util.List;

public class Numbers {
    private List<Integer> numbers = new ArrayList<Integer>();

    //constructor
    public Numbers(List<Integer> inputNumbers) {
        numbers = inputNumbers;
    }

    public int getMaxNumber() {
        if (numbers.isEmpty()) {
            return 0;
        }
        int max = 0;
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public int getMinNumber() {
        if (numbers.isEmpty()) {
            return 0;
        }
        int min = numbers.get(0);
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }


}
