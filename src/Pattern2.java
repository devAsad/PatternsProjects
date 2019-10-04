import java.util.Scanner;
public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows, i, j;
        //Enter the number of rows.
        System.out.println("Enter the number of rows.");
        rows = sc.nextInt();
        for (i = 1; i <= rows; i++) {
            for (j = i; j <= rows; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        //close resources
        sc.close();
    }
}
/*Output: for 5 rows.
1 2 3 4 5
2 3 4 5
3 4 5
4 5
5
 */
