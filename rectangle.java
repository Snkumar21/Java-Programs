class rectangle {
    
    int length;
    int width;

    public rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    
    public int calculateArea() {
        return length * width;
    }

    public static void main(String[] args) {
        
        rectangle rectangle = new rectangle(5, 10);

        
        int area = rectangle.calculateArea();
        System.out.println("The area of the rectangle is: " + area);
    }
}
