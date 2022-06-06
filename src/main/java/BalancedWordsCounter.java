
import java.util.HashMap;

class BalancedWordsCounter {
    private final String input;

    public BalancedWordsCounter(String input) {
        this.input = input;
    }

    public Integer count(){
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isLetter(input.toCharArray()[i])) {
                throw new RuntimeException();
            }
        }
        return subWordGenerator();
    }
    private Integer subWordGenerator(){
        int count = 0;

        for (int c = 0; c < input.length(); c++) {
            for (int j = 1; j <= input.length() - c; j++) {
                String subWord = input.substring(c, c + j);
                if (isBalancesWord(subWord))
                    count++;
            }
        }
        return count;
    }

    private boolean isBalancesWord(String subWord){
        HashMap<Character, Integer> letterCounter = new HashMap<>();
        for (char letter : subWord.toCharArray()) {
            if (letterCounter.containsKey(letter)) {
                letterCounter.replace(letter, letterCounter.get(letter) + 1);
                continue;
            }
            letterCounter.put(letter, 1);
        }
        int count = letterCounter.get(subWord.toCharArray()[0]);
        return letterCounter.values().stream().allMatch(v -> v == count);
    }
}
