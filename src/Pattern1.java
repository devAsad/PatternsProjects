import java.util.Scanner;
public class Pattern1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows, i, j;
        System.out.println("Enter the number of rows.");
        //Enter the number of rows.
        rows = scanner.nextInt();
        for (i = 1; i <= rows; i++) {
            for (j = rows; j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        //closed the resources.
        scanner.close();
    }
}
/*Output: for 5 rows.
5 4 3 2 1
5 4 3 2
5 4 3
5 4
5
 */

