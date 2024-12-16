package src.math;

import java.io.IOException;
import java.util.Scanner;

public class Backjoon1546 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long max = 0;
        long sum = 0;
        for (int i = 0; i < n; i++) {
            int score = sc.nextInt();
            sum += score;
            if(max < score) max = score;
        }

        System.out.println((sum * 100.0) / max / n);
    }


}
