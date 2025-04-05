<<<<<<< HEAD
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
=======
// This is a rectangle area calculator using user-defined value.
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
>>>>>>> 3b91145e87f179c688b01060e6f387c287eacd71
