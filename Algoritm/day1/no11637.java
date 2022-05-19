package Algoritm.day1;

import java.util.Scanner;

//인기투표
public class no11637 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        while (testCase-- > 0) {
            int max_pyosu = 0;
            int all_pyosu = 0;
            int max_candidate_count = 0;
            int maxCandidate = 0;
            int candidateNum = sc.nextInt();

            for (int i = 1; i < candidateNum + 1; i++) {
                int pyosu = sc.nextInt();
                all_pyosu += pyosu;

                if (pyosu > max_pyosu) {
                    max_pyosu = pyosu;
                    maxCandidate = i;
                    max_candidate_count = 1;
                } else if (pyosu == max_pyosu) {
                    max_pyosu = pyosu;
                    max_candidate_count++;
                }
            }

            if (max_candidate_count >= 2) {
                System.out.println("no winner");
                continue;
            }

            if (max_pyosu > all_pyosu / 2) {
                System.out.println("majority winner " + maxCandidate);
            } else {
                System.out.println("minority winner " + maxCandidate);
            }
        }
    }
}

