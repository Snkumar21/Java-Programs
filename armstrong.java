public class armstrong {
    public static void main(String[] args) {
        int num = 153;
        int temp = num;
        int sum = 0;
        int rem;
        while (num > 0) {
            rem = num % 10;
            sum = sum + (rem * rem * rem);
            num = num / 10;
        }
        if (temp == sum) {
            System.out.println("The number is an Armstrong number.");
        } else {
            System.out.println("The number is not an Armstrong number.");
        }
    }
}
