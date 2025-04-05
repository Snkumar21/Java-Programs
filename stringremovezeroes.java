class stringremovezeroes {
    public static String removeZero(String str) {
        int i = 0;

        while (i < str.length() && str.charAt(i) == '0')
        i++;
        
        StringBuffer sb = new StringBuffer(str);
        sb.replace(0, i, str);
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "000123";
        str = removeZero(str);
        System.out.println(str);
    }
}