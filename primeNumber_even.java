public class primeNumber_even {    
    public static void main(String[] args) {
        int n = 100; 
        int[] prime = new int[n]; 
        int count = 0; 

        for (int num = 2; num <= n; num++) {
            if (isPrime(num)) {
                prime[count] = num; 
                count++;
            }
        }

        System.out.println("Prime numbers at even indices:");
        for (int i = 0; i < count; i += 2) {
            System.out.print(prime[i] + " ");
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) { 
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}