public class removeLastCharacter {
    public static void main(String[] args) {
        String string = "Javapoint is the best educational websites";
        StringBuffer sb = new StringBuffer(string);

        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb);
    }
}