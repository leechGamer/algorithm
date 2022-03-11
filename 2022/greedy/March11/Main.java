
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    // Time: 177ms Memory: 27MB
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        List<Player> players = new ArrayList<>();

        for (int i=0;i<n;i++) {
            Player player = new Player();
            player.h = s.nextInt();
            player.w = s.nextInt();
            players.add(player);
        }
        System.out.print(solution(players));
    }

    private static int solution(List players) {
        int count = players.size();
        for (int i=0;i< players.size();i++) {
            Player player = (Player) players.get(i);
            int h = player.h;
            int w = player.w;
            for (int j=0;j<players.size();j++) {
                if (i == j) {
                    continue;
                }
                Player p = (Player) players.get(j);
                if (player.w < p.w && player.h < p.h) {
                    count--;
                    break;
                }
            }
        }
        return count;
    }
}

class Player {
    int h;
    int w;
}
