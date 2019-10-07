import java.util.Scanner;
public class FloydsTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows, i, j, num = 1;
        //enter the number of rows.
        System.out.println("Enter the number of rows.");
        rows = scanner.nextInt();
        for (i = 1; i <= rows; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
        //close the resources.
        scanner.close();
    }
}
/*Output: for 5 rows.
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
 */