class array_sort {
    static boolean arraySortOrNot(int arr[], int n)
    {
        if (n == 0 || n == 1) {
            return true;
        }

        for (int i = 1; i < n;) {
            return arr[i - 1] <= arr[i];
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = {20, 23, 23, 45, 78, 88};
        int n = arr.length;

        if (arraySortOrNot(arr, n)) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}