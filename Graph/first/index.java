package Graph.first;

import java.util.ArrayList;
import java.util.Scanner;

public class index {
    static class edge {
        int src, desc, wt;

        public edge(int s, int d, int w) {
            this.src = s;
            this.desc = d;
            this.wt = w;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the size of graph");
        int v = sc.nextInt();
        ArrayList<edge>[] grapgh = new ArrayList[v];
        for (int i = 0; i < v; i++) {
            grapgh[i] = new ArrayList<>();
        }
        grapgh[0].add(new edge(0, 1, 5));

        grapgh[1].add(new edge(1, 0, 5));
        grapgh[1].add(new edge(1, 2, 1));
        grapgh[1].add(new edge(1, 3, 3));

        grapgh[2].add(new edge(2, 1, 1));
        grapgh[2].add(new edge(2, 3, 1));
        grapgh[2].add(new edge(2, 4, 4));

        grapgh[3].add(new edge(3, 2, 1));
        grapgh[3].add(new edge(3, 1, 3));

        grapgh[4].add(new edge(4, 2, 4));

        for (int i = 0; i < grapgh[2].size(); i++) {
            edge e = grapgh[2].get(i);
            System.out.println(e.desc);
        }
    }
}
