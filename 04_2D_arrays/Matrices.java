import java.util.Scanner;

public class Matrices {

    public static void main(String[] args) {

        int martrix[][] = new int[3][3];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < martrix.length; i++) {
            for (int j = 0; j < martrix.length; j++) {
                martrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < martrix.length; i++) {
            for (int j = 0; j < martrix.length; j++) {
                System.out.print(martrix[i][j]);
            }
            System.out.println();
        }

    }
}