import java.util.Scanner;
public class Pattern3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows, i, j;
        //enter the  number of rows.
        System.out.println("Enter the number of rows.");
        rows = scanner.nextInt();
        for (i = 1; i <= rows; i++) {
            for (j = 1; j <= rows; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
            for (j = rows; j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        //close the resources.
        scanner.close();
    }
}
/*Output: for 5 rows.
1 2 3 4 5
5 4 3 2 1
1 2 3 4 5
5 4 3 2
1 2 3 4 5
5 4 3
1 2 3 4 5
5 4
1 2 3 4 5
5
 */
