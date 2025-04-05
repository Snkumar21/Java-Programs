class primeNumber {
    public static void main(String[] args) {
        int n = 2, i, flag = 0;

        if (n == 0 || n == 1) { 
            flag = 1;
        }
        for (i = 2; i <= n/2; ++i) {
            if (n % i == 0) {
                flag = 1;
                break;
            }
        }

        if  (flag == 0) {
            System.out.println("Number is prime : " + n);
        }
        else {
            System.out.println("Number is not prime.");
        }
    }
}