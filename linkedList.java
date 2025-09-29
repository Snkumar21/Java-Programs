class Dog {
    public String name;
    public int age;
}


class Node {
    public int value;
}


public class main {
    public void fun() {
        int arr[] = {4, 5, 6};
        System.out.println(arr);
        System.out.println(arr);
        System.out.println(arr);
        System.out.println(arr);
        //[I@6acbcfc0
        Dog dog = new Dog();
        dog.name = "sheru";
        dog.age = 21;
        System.out.println(dog.name);
    }

    public static void main(String[] args) {
        Node n1 = new Node();
        n1.value = 10;

        Node n2 = new Node();
        n2.value = 11;

        Node tempNode = n2;

        Node n3 = new Node();
        n3.value = 12;

        Node n4 = new Node();
        n4.value = 13;

        System.out.println(n2);
    }
}