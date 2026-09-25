package Programs;

public class StringFunctions {

    public static void main(String[] args) {

        String name= " My name is Chaturth Gowda ";

        System.out.println(name.length());

        System.out.println(name.toLowerCase());

        System.out.println(name.toUpperCase());

        System.out.println(name.charAt(4));

        System.out.println(name.trim()); //remove spaces from start and end

        System.out.println(name.indexOf("My"));// index of string

        System.out.println(name.contains("not"));

        System.out.println(name.startsWith(" "));

        System.out.println(name.endsWith("m"));

        System.out.println(name.equals("Java program"));

        System.out.println(name.indexOf("y"));//index of char
    }
}
