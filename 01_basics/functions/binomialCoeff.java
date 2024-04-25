package functions;

public class binomialCoeff {
    public static int factorialOfN(int n) {
        int f = 1;

        for (int i = 1; i <= n; i++) {
            f *= i;
        }

        return f;
    }

    public static int binomial(int n, int r) {
        int factN = factorialOfN(n);
        int factR = factorialOfN(r);
        int factDiffNR = factorialOfN(n - r);
        int coeff = factN / (factR * factDiffNR);
        return coeff;
    }

    public static void main(String[] args) {
        System.out.println(binomial(5, 2));
    }
}
