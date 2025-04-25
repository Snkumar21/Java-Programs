// This is pattern program of * star in right angle triangle format.
public class right_angle_triangle_star {
    public static void main(String Args[]) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }    
}