import java.util.Scanner;

interface A {
    void getA();  // Abstract method
}

class B {
    int b;

    void getb() {
        b = 20;
    }
}

class C extends B implements A {
    int a;

    public void getA() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value for a: ");
        a = scanner.nextInt();
    }

    void disp() {
        int c = a + b;
        System.out.println("Sum: " + c);
    }
}

public class Fahrenheit {
    public static void main(String[] args) {
        C obj = new C();
        obj.getA();  // from interface A
        obj.getb();  // from class B
        obj.disp();  // show result
    }
}
