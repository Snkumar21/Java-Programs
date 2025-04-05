class array_largest_num {
    public static void main(String[] Args) {
        int[] num = {11, 22, 33, 44};
        int largest = num[0];

        for(int i = 1; i<num.length; i++) {
            if(num[i]>largest) {
                largest = num[i];
                System.out.println(largest);
            }
        }
    }
}