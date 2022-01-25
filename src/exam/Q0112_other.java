package exam;

public class Q0112_other {
    // 선택하고자 하는 대상 집합.
    static int[] target = new int[] { 20, 97, 43, 13, 36 };
    // 대상 숫자를 선택했는지를 알려주는 집합.
    static boolean[] visited = new boolean[target.length];
    static String st = "";
    
    public static void main(String[] args) {
        permutation(0, st);
        String[] div = st.split(" ");
        long[] numbers = new long[div.length];
        for (int i=0; i<div.length; i++) {
            numbers[i] = Long.parseLong(div[i]);
        }
        for (int i=0; i<numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        
        long find_biggest_num = find_biggest(numbers);
        System.out.println();
        System.out.println(find_biggest_num);
    }
    
    private static long find_biggest(long[] numbers) {
        long mx = -1;
        for (int i=0; i<numbers.length; i++) {
            if (numbers[i] > mx) {
                mx = numbers[i];
            }
        }
        return mx;
    }
    // 순열 메서드(cnt는 선택 횟수, result는 결과)
    private static void permutation(int cnt, String result) {
        // 2개를 선택했으므로, 결과를 출력하고 재귀를 종료한다.
        if (cnt == target.length) {
            st += result;
            st += " ";
            return;
        }
        // 대상 집합을 순회하며 숫자를 하나 선택한다.
        for (int i = 0; i < target.length; i++) {
            // 이미 해당 숫자를 선택한 경우에는 스킵.
            if (visited[i]) {
                continue;
            }
            // 선택하지 않은경우, 선택했다는 표시를 해준다.
            visited[i] = true;
            // 자신을 재귀 호출한다.
            permutation(cnt + 1, result + target[i]);
            // 선택을 해제한다.
            visited[i] = false;
        }
    }
}