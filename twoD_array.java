public class twoD_array {
    public static void main(String[] args) {
        int[][] num = {{10, 20, 30},{40, 50, 60},{70, 80, 90}};

        for (int[] num1 : num) {
            for (int j = 0; j < num1.length; j++) {
                System.out.println(num1[j] + " ");
            }
        }
    }
}