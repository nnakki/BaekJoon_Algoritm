package Algoritm;

import java.util.Scanner;

//부녀회장이 될테야
public class no2775 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int result = 0;

        //todo 아직못품
        while (T-- > 0) {
            int k = sc.nextInt();
            for (int i = 0; i < k; i++) {
                int n = sc.nextInt();
                for (int j = 0; j < n; j++) {
                    result += j;
                }
            }
        }
    }
}
