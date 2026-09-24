package Programs;

public class Operators {

    public static void main(String[] args) {

       int a=10;
       int b=20;

        System.out.println("a:10,"+"b:20");

        System.out.println("addition:"+(a+b));
        System.out.println("subtraction:"+(a-b));
        System.out.println("multiplication:"+(a*b));
        System.out.println("division:"+(a/b));
        System.out.println("modulus:"+(a%b));

        a+=5;
        System.out.println("a:"+a);

        b*=2;
        System.out.println("b:"+b);

        b-=20;
        System.out.println("b:"+b);


        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));


        System.out.println("logical and:(a > b) && (a > 0): " + ((a > b) && (a > 0)));

        System.out.println("logical or:(a < b) || (a > 0): " + ((a < b) || (a > 0)));

        System.out.println("logical not:!(a > b): " + (!(a > b)));

        int x = 10;
        System.out.println("x++: " + x++);
        System.out.println("++x: " + ++x);
        System.out.println("x--: " + x--);
        System.out.println("--x: " + --x);


        int c= 10;
        int d= 5;

        String result = (c > d) ? "c is greater" : "d is greater";

        System.out.println(result);


        int age=22;

        String res =(age>19) ? "eligible": "not eligible";

        System.out.println(res);




    }
}
