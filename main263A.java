import java.util.*;

public class main263A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[5][5];
        int rowpos = 0;
        int colpos = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (arr[i][j] == 1) {
                    rowpos = i;
                    colpos = j;
                }
            }
        }
        int ans = Math.abs(colpos - 2) + Math.abs(rowpos - 2);
        System.out.println(ans);
    }
}
