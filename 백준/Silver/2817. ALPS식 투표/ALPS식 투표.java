import java.io.*;
import java.util.*;

public class Main { // S3 ALPS식 투표

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int X = Integer.parseInt(br.readLine()); // 전체 수
        int N = Integer.parseInt(br.readLine()); // 스태프 수

        List<Player> playersList = new ArrayList<>();

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int votes = Integer.parseInt(st.nextToken());
            //5% 미만처리
            if(votes < X * 0.05){
                continue;
            }
            int [] scores = new int[14];
            for(int j = 1; j<= 14; j++){
                scores[j-1] = votes/j;
            }
            playersList.add(new Player(name, votes, scores, 0));
        }

        // 상위 14개의 점수를 가진 플레이어에게 chips +1
        List<Score> scoreList = new ArrayList<>();
        for (Player player : playersList) {
            for (int score : player.scores) {
                scoreList.add(new Score(player, score));
            }
        }

        // 점수 리스트를 내림차순 정렬
        Collections.sort(scoreList, (a, b) -> b.score - a.score);

        // 상위 14개의 점수에 해당하는 플레이어들에게 chips +1
        for (int i = 0; i < 14 && i < scoreList.size(); i++) {
            scoreList.get(i).player.chips++;
        }

        // 이름순으로 정렬
        Player[] players = playersList.toArray(new Player[0]);
        Arrays.sort(players, Comparator.comparing(p -> p.name));

        // 결과 출력
        for (Player player : players) {
            sb.append(player.name).append(" ").append(player.chips).append("\n");
        }

        System.out.print(sb);
    }

    public static class Player {
        String name;
        int votes;
        int[] scores;
        int chips;

        public Player(String name, int votes, int[] scores, int chips) {
            this.name = name;
            this.votes = votes;
            this.scores = scores;
            this.chips = chips;
        }
    }

    public static class Score {
        Player player;
        int score;

        public Score(Player player, int score) {
            this.player = player;
            this.score = score;
        }
    }
}
