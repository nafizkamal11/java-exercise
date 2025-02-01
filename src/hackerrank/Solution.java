package hackerrank;

class Solution{
    public static void main(String []argh){

        series(0, 2, 2);

    }

    private static void series(int a, int b, int n) {
        for (int s = 1; s < n; s++) {
            System.out.println((int) (a + b * Math.pow(2, s)));
        }
    }
}