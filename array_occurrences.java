class array_occurrences {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 5, 1, 3, 2, 1};
        @SuppressWarnings("unused")
        boolean found = false;
        
        for (int i = 0; i < arr.length; i++) {
            if('a' == arr[i]){
                found = true;
            }
            else {
                System.out.println("Character is not present.");
            }
        }
    }
} 