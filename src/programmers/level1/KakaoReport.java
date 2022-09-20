package src.programmers.level1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class KakaoReport {

    /**
     * Stream 을 활용한 다른 사람 풀이
     * java 8 stream 활용 와...감탄...
     */
    public static int[] solution2(String[] id_list, String[] report, int k) {
        List<String> list = Arrays.stream(report).distinct().collect(Collectors.toList());
        HashMap<String, Integer> count = new HashMap<>();

        for (String s : report) {
            String target = s.split(" ")[1];
            count.put(target, count.getOrDefault(target, 0) + 1);
        }

        return Arrays.stream(id_list).map(_user -> {
            final String user = _user;
            List<String> reportList = list.stream().filter(s -> s.startsWith(user + " ")).collect(Collectors.toList());
            return reportList.stream().filter(s -> count.getOrDefault(s.split(" ")[1], 0) >= k).count();
        }).mapToInt(Long::intValue).toArray();
    }

    /**
     * 내 풀이
     */
    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<String, HashSet<String>> keys = new HashMap<>();

        for (int i = 0; i < id_list.length; i++) {
            keys.put(id_list[i], new HashSet<>());
            answer[0] = 0;
        }

        for (String s : report) {
            String[] tmp = s.split(" ");
            if(!keys.get(tmp[0]).contains(tmp[1])) {
                map.put(tmp[1], map.getOrDefault(tmp[1], 0) + 1);
                keys.get(tmp[0]).add(tmp[1]);
            }
        }

        System.out.println("map.values() = " + map.values());
        System.out.println("keys.values() = " + keys.values());

        for (int i = 0; i < id_list.length; i++) {
            for (String s : keys.get(id_list[i])) {
                if(map.get(s) >= k) {
                    answer[i] += 1;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        int k = 2;

        for (int n : solution(id_list, report, k)) {
            System.out.print(n + ", ");
        }
    }
}
