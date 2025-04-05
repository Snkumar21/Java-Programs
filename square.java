// This is example of square finder of the given user-defined value.
class square {
   
    int side;

    public square() {
        side = 5;
    }

    public void displaySide() {
        System.out.println("The side length of the square is: " + side);
    }

    public static void main(String[] args) {
       
        square square = new square();

        square.displaySide();
    }
}
