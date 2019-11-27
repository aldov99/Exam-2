class problem5 {
    public static int minimumDeleteSum(String s1, String s2) {
        int[][] ms = new int[s1.length() + 1][s2.length() + 1];

        for (int i = s1.length() - 1; i >= 0; i--) {
            ms[i][s2.length()] = ms[i+1][s2.length()] + s1.codePointAt(i);
        }
        for (int j = s2.length() - 1; j >= 0; j--) {
            ms[s1.length()][j] = ms[s1.length()][j+1] + s2.codePointAt(j);
        }
        for (int i = s1.length() - 1; i >= 0; i--) {
            for (int j = s2.length() - 1; j >= 0; j--) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    ms[i][j] = ms[i+1][j+1];
                } else {
                    ms[i][j] = Math.min(ms[i+1][j] + s1.codePointAt(i), ms[i][j+1] + s2.codePointAt(j));
                }
            }
        }
        return ms[0][0];
    }

    public static void main(String[]atgs){
        String s1="sea";
        String s2="eat";
        System.out.print(minimumDeleteSum(s1,s2));
    }
}