public class Main {
    public static void main(String[] args) {
        int n = 4; // Number of rows
        int m = 5; // Number of columns

        for (int i = 1; i <= n; i++) { // Row loop
            for (int j = 1; j <= m; j++) { // Column loop
                if (i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to the next row
        }
    }
}
