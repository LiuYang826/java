import java.util.Scanner;
public class arrayThree {

        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            int a[][] = new int [3][3];
                while (in.hasNext()) {
                    int k = in.nextInt();
                    while (k>0) {
                        for (int i = 0; i < 3; i++) {
                            for (int j = 0; j < 3; j++) {
                                a[i][j] =in.nextInt();
                            }
                        }
                        for (int i = 0; i < 3; i++) {
                            for (int j = 0; j < 3; j++) {
                                System.out.print(a[j][i]);
                            }
                            System.out.println();
                        }
                        System.out.println();
                    }
                    k--;
                }
        }
}
