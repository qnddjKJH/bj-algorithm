package src.programmers.level1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class NotCompletionPlayer {
    private static String solution(String[] participant, String[] completion) {
        Map<String, Integer> solution = new HashMap<>();
        String answer = "";

        for (String s : participant) {
            solution.put(s, solution.getOrDefault(s, 0)+1);
        }

        for (String s : completion) {
            solution.put(s, solution.get(s) - 1);
        }

        // 여기서 선택 EntrySet, keySet, iterator 개발자의 선택이다.
        Set<Map.Entry<String, Integer>> entries = solution.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            if (entry.getValue() != 0) {
                answer = entry.getKey();
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        // mislav
        String answer = solution(participant, completion);
        System.out.println("answer = " + answer);
    }
}
