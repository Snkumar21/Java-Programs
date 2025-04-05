public class threeD_array {
    public static void main(String[] args) {
        
        int[][][] num = {
            {{1, 2, 3}, {4, 5, 6}}, 
            {{7, 8, 9}, {10, 11, 12}}
        };

        for (int i=0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.print(num[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}