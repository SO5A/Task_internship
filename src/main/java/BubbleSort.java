import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;

public class BubbleSort {

    public BubbleSort() {
    }

    public ArrayList<Double> sort(@NotNull ArrayList<Double> input) throws RuntimeException {
        removingNullsFromList(input);
        return bubbleSort(input);
    }

    private ArrayList<Double> bubbleSort( ArrayList<Double> input){
        for (int i = 0; i < input.size(); i++)
            for (int j = 0; j < input.size() - 1; j++) {
                if (input.get(j).compareTo(input.get(j + 1)) > 0) {
                    Collections.swap(input, j, j + 1);
                }

            }
        return input;
    }

    private void removingNullsFromList(ArrayList<Double> input){
        input.removeAll(Collections.singleton(null));
    }
}