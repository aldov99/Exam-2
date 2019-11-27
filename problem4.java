public class problem4 {
    public static int numberOfArithmeticSlices(int[] A) {
        int[] as = new int[A.length];
        int sum = 0;
        for (int i = 2; i < as.length; i++) {
            if (A[i] - A[i - 1] == A[i - 1] - A[i - 2]) {
                as[i] = 1 + as[i - 1];
                sum += as[i];
            }
        }
        return sum;
    }

    public static void main(String[] args){
        int[] A={1,2,3,4};
        System.out.print(numberOfArithmeticSlices(A));
    }
}
