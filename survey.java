import java.util.Scanner;
public class survey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int[][] respon = {
            {5, 4, 3, 2, 1, 4},
            {3, 2, 4, 5, 1, 2},
            {4, 4, 4, 3, 2, 5},
            {5, 5, 5, 4, 4, 5},
            {3, 3, 3, 3, 3, 3},
            {2, 4, 5, 1, 2, 3},
            {5, 4, 2, 3, 1, 2},
            {4, 3, 5, 2, 4, 5},
            {3, 4, 3, 3, 3, 4},
            {5, 5, 5, 5, 5, 5}
        };
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                total += respon[i][j];
            }
        }
        double average = total / (10.0 * 6);
        System.out.println("Total Survey Result: " + total);
        System.out.println("Average Survey Result: " + average);
    }
}
