package datastructer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class BJ7785 {
    /**
     * V2
     */
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        TreeSet<String> set = new TreeSet<>();
        // 순서보장, 중복X
        // 인덱싱 안됨, 순서 보장 + 트리라서 역순으로 순회하기 난감

        // 항상 생각하던건데 왜 못 떠올렸을까 - n번 while 반복문
        while (n-- > 0) {
            String name = st.nextToken();
            String s = st.nextToken();

            if (s.equals("enter")) {
                set.add(name);
            } else {
                set.remove(name);
            }
        }

        // 그런 트리셋을 위해 역순으로 순회하는 이터레이터 제공중
        for(Iterator<String> itr = set.descendingIterator(); itr.hasNext();) {
            sb.append(itr.next()).append("\n");
        }
        System.out.println(sb);
    }

    /**
     * V1
     */
    /*public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // contains 시간
        // list: O(n), set: O(1) 
//        List<String> list = new ArrayList<>();
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            String temp = input.split(" ")[0];

            if (input.contains("enter")) {
                set.add(temp);
            } else {
                set.remove(temp);
            }
        }

        String[] arr = set.toArray(new String[set.size()]);
        Arrays.sort(arr, Collections.reverseOrder());
        Arrays.stream(arr).forEach(System.out::println);
    }*/
}
