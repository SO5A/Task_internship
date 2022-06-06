import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import org.junit.jupiter.api.Assertions;


class BubbleSortTest {
    @Test
    @DisplayName("input = [1,4,5,6,8,3,8] result = [1,3,4,5,6,8,8]")
    void Test(){
        BubbleSort bubbleSort = new BubbleSort();
        ArrayList<Double> input = new ArrayList<>();
        Collections.addAll(input,1.0, 4.0, 5.0, 6.0, 8.0, 3.0, 8.0);

        ArrayList<Double> expectedData = new ArrayList<>();
        Collections.addAll(expectedData,1.0, 3.0, 4.0, 5.0, 6.0, 8.0, 8.0);

        Assertions.assertEquals(expectedData,bubbleSort.sort(input));

    }

    @Test
    @DisplayName("input = [-9.3,0.2,4,0.1,5,9] result = [-9.3,0.1,0.2,4,5,9]")
    void Test2(){
        BubbleSort bubbleSort = new BubbleSort();
        ArrayList<Double> input = new ArrayList<>();
        Collections.addAll(input,-9.3, 0.2, 4.0, 0.1, 5.0, 9.0);

        ArrayList<Double> expectedData = new ArrayList<>();
        Collections.addAll(expectedData,-9.3, 0.1, 0.2, 4.0, 5.0, 9.0);

        Assertions.assertEquals(expectedData,bubbleSort.sort(input));
    }
    @Test
    @DisplayName("input = [] result = []")
    void Test3(){
        BubbleSort bs = new BubbleSort();
        ArrayList<Double> testData = new ArrayList<>();

        ArrayList<Double> expectedData = new ArrayList<>();

        Assertions.assertEquals(expectedData,bs.sort(testData));
    }
    @Test
    @DisplayName("input = [null,5.0001] result = [5.0001]")
    void Test4(){
        BubbleSort bubbleSort = new BubbleSort();
        ArrayList<Double> input = new ArrayList<>();
        Collections.addAll(input,null, 5.0001);

        ArrayList<Double> expectedData = new ArrayList<>();
        Collections.addAll(expectedData,5.0001);

        Assertions.assertEquals(expectedData,bubbleSort.sort(input));
    }
    @Test
    @DisplayName("input = null result = RuntimeException")
    void Test5(){
        BubbleSort bubbleSort = new BubbleSort();
        Assertions.assertThrows(RuntimeException.class,() -> bubbleSort.sort(null));
    }
}
