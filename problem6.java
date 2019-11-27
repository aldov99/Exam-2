import java.util.*;
class problem6 {
    public static int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (a, b) -> a[0] - b[0]);
        int N = pairs.length;
        int[] lc = new int[N];
        Arrays.fill(lc, 1);

        for (int j = 1; j < N; ++j) {
            for (int i = 0; i < j; ++i) {
                if (pairs[i][1] < pairs[j][0])
                    lc[j] = Math.max(lc[j], lc[i] + 1);
            }
        }

        int a = 0;
        for (int x: lc) if (x > a) a = x;
        return a;
    }

    public static void main(String[] args){
        int[][]pairs={{1,2},{2,3},{3,4}};
        System.out.print(findLongestChain(pairs));
    }
}