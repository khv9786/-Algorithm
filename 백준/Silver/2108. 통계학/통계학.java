import java.util.*;

public class Main { // 2108 통계학 26%
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int[] numbers = new int[K];
        int sum = 0;

        // 빈도용
        Map<Integer, Integer> map = new HashMap<>();

        // input
        for (int i = 0; i < K; i++) {
            int a = sc.nextInt();
            numbers[i] = a;
            sum += a;
            if (map.containsKey(a)) {
                int v = map.get(a);
                v++;
                map.put(a, v);
            } else {
                map.put(a, 1);
            }
        }
        Arrays.sort(numbers);

        double d_mean = (double) sum / K;
        int mean = (int) Math.round(d_mean);
        int median = numbers[K / 2];

        List<Integer> keySet = new ArrayList<>(map.keySet());
        List<Integer> fre = new ArrayList<>();
        // 먼저 람다 사용해서 value 내림차순으로 정렬
        keySet.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));

        int mode = 0;

        int MaxFrequency = map.get(keySet.get(0)); // 가장 높은 빈도수

        for (int key : keySet) {
            if (map.get(key) == MaxFrequency) {
                fre.add(key);
            }
        }
        Collections.sort(fre);

        if (fre.size() >= 2) {
            mode = fre.get(1);
        } else {
            mode = fre.get(0);
        }

        int range = numbers[numbers.length - 1] - numbers[0];
        // output
        System.out.println(mean);
        System.out.println(median);
        System.out.println(mode);
        System.out.println(range);
    }
}
