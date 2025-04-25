class stringBufferBasics {
    public static void main(String[] args) {
        String str;
        StringBuffer sb = new StringBuffer (str:"Hello");
        sb.append(str:"World!");

        System.out.println("After append: " + sb);
        System.out.println("Length: " + sb.length());
        System.out.println("Capacity: " + sb.capacity());
        System.out.println("Character at index 1: " + sb.charAt(1));
        int start;
        sb.delete(start:5, end:11);
        System.out.println("After delete(5, 11): " + sb);
        sb.deleteCharAt(index:5);
        System.out.println("After deleteChart(5): " + sb);
        sb.ensureCapacity(minimumCapacity:50);
        System.out.println("After append ensureCapacity(50): " + sb.capacity());
        sb.insert(offset:5, str:",");
        System.out.println("After insert(5, \",\"): " + sb);
        sb.reverse();
        System.out.println("After reverse: " + sb);
        sb.replace(start:0, end:1, str:"Hi");
    }
}