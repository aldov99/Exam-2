class problem1 {
    public static boolean stoneGame(int[] piles) {
        int N = piles.length;

        int[][] ms = new int[N+2][N+2];
        for (int size = 1; size <= N; ++size)
            for (int i = 0; i + size <= N; ++i) {
                int j = i + size - 1;
                int parity = (j + i + N) % 2;  
                if (parity == 1)
                    ms[i+1][j+1] = Math.max(piles[i] + ms[i+2][j+1], piles[j] + ms[i+1][j]);
                else
                    ms[i+1][j+1] = Math.min(-piles[i] + ms[i+2][j+1], -piles[j] + ms[i+1][j]);
            }

        return ms[1][N] > 0;
    }

    public static void main(String[]args){
        int[] piles={5,3,4,5};
        System.out.print(stoneGame(piles));
    }
}