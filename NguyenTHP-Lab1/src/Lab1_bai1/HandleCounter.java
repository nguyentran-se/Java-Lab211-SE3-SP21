package Lab1_bai1;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class HandleCounter {

    private Map<String, Integer> wordCounter
            = new HashMap<String, Integer>();

    private Map<Character, Integer> charCounter
            = new HashMap<Character, Integer>();

    public void countWord(String content) {
        StringTokenizer st = new StringTokenizer(content);
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            if (!wordCounter.containsKey(token)) {
                wordCounter.put(token, 1);
            } else {
                wordCounter.put(token, ((int) wordCounter.get(token)) + 1);
            }
        }
    }

    public void countChar(String content) {
        for (char ch : content.toCharArray()) {
            if (!Character.isLetter(ch)) {
                continue;
            }
            if (!charCounter.containsKey(ch)) {
                charCounter.put(ch, 1);
            } else {
                charCounter.put(ch, ((int) charCounter.get(ch)) + 1);
            }
        }
    }

    public void displayResult() {
        System.out.println(wordCounter);
        System.out.println(charCounter);
    }
}
