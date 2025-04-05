public class pattern_number {
    public static void main(String[] args) {
        int n = 4; // Number of rows

        for (int i = 1; i <= n; i++) {
            // Print spaces for centering
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            // Print increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // Print decreasing numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            // Move to the next line
            System.out.println();
        }
    }    
}