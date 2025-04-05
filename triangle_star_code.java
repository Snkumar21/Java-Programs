class triangle_star_code {
    public static void main(String Args[]) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) { 
            for (int j = rows - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }        
}