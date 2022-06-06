import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

class BalancedWordsCounterTest {

    @Test
    @DisplayName("input = “aabbabcccba” result = 28")
    void test1() {
        String input = "aabbabcccba";
        BalancedWordsCounter balancedWordsCounter = new BalancedWordsCounter(input);

        Assertions.assertEquals(28,balancedWordsCounter.count());
    }
    @Test
    @DisplayName("input = “” result = 0")
    void test2() {
        String input = "";
        BalancedWordsCounter balancedWordsCounter = new BalancedWordsCounter(input);

        Assertions.assertEquals(0,balancedWordsCounter.count());
    }
    @Test
    @DisplayName("input = “abababa1” result = RuntimeException ")
    void Test3(){
        String input = "abababa1";
        BalancedWordsCounter balancedWordsCounter = new BalancedWordsCounter(input);
        Assertions.assertThrows(RuntimeException.class, balancedWordsCounter::count);
    }
    @Test
    @DisplayName("input = null result = RuntimeException")
    void Test4(){
        BalancedWordsCounter balancedWordsCounter = new BalancedWordsCounter(null);
        Assertions.assertThrows(RuntimeException.class, balancedWordsCounter::count);
    }
}