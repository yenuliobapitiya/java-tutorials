public class Q6 {
    public static void main(String[] args) {
        System.out.println("A");
        System.out.println("B");
        //System.out.print();
        System.out.println("C");
        System.out.println("D");
    }
}

//to fix this error -->
//The print() method requires an argument to print, but in your code, it is called without any arguments.
//Java does not allow System.out.print(); to be empty because there is no default behavior for it.
//correct code --> System.out.print(""); or without this line