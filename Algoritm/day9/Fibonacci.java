package Algoritm.day9;

public class Fibonacci {

    //dp를 사용 시작은 문제의 결과값을 저장하는 배열
    //Top-down, Bottom-up 별개로 생성

    static int[] topDown_memo;
    static int[] bottomUp_memo;

    public static void main(String[] args) {
        int n = 30;
        topDown_memo = new int[n + 1];
        bottomUp_memo = new int[n + 1];

        long startTime = System.currentTimeMillis();
        System.out.println(navieRecursion(n));
        long endTime = System.currentTimeMillis();
        System.out.println("일반 재귀 소요 시간 : " + (endTime - startTime));

        System.out.println();

        startTime = System.currentTimeMillis();
        System.out.println(topDown(n));
        endTime = System.currentTimeMillis();
        System.out.println("Top-down 소요 시간 : " + (endTime - startTime));

        System.out.println();

        startTime = System.currentTimeMillis();
        System.out.println(bottomUp(n));
        endTime = System.currentTimeMillis();
        System.out.println("Bottom-Up 소요 시간 : " + (endTime - startTime));
    }

    //일반 재귀함수 사용
    //동일한 계산을 반복하여 비효율적으로 처리가 수행됨
    private static int navieRecursion(int n) {
        if (n <= 1) {
            return n;
        }
        return navieRecursion(n - 1) + navieRecursion(n - 2);
    }

    //DP를 Top-down을 사용하여 Fibonacci를 구하는 경우
    private static int topDown(int n) {
        //기저 상태 도달시, 0,1로 초기화
        if (n < 2) return topDown_memo[n] = n;

        //메모에 계산된 값이 있으면 바로 반환
        if (topDown_memo[n] > 0) return topDown_memo[n];

        //재귀를 사용하고 있음
        topDown_memo[n] = topDown(n - 1) + topDown(n - 2);
        return topDown_memo[n];
    }

    //DP Bottom-Up을 사용해 Fibonacci를 구하는 경우
    public static int bottomUp(int n){
        //기저 상태의 경우 사전에 미리 저장
        bottomUp_memo[0] = 0;
        bottomUp_memo[1] = 1;

        for(int i =2; i<=n; i++){
            bottomUp_memo[i] = bottomUp_memo[i-1] + bottomUp_memo[i-2];
        }
        return bottomUp_memo[n];
    }
}
