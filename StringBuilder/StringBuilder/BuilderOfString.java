package StringBuilder;
import java.util.Scanner;

public class BuilderOfString {
    public static void main(String []args){
        StringBuilder input= new StringBuilder("Hello Java");
        System.out.println(input);
        StringBuilder name = new StringBuilder(); // here also same constructor as in StringBuffer.
        //name="Welcome to Java Coding"; // we can't declare the String builder as literal.
        System.out.println(input.append(20));
        System.out.println(input.append('a'));
        System.out.println(input.append("Love to Code"));
        System.out.println(input.reverse());
        // here use of constructor in string builder
        Scanner Input= new Scanner(System.in);
       // StringBuilder lines = new StringBuilder();
        System.out.println("Enter the String ");
        StringBuilder con = new StringBuilder(89); // here we defined the capacity of the String.
        String dataInput= Input.nextLine();
        StringBuilder data2 =new StringBuilder(dataInput);
        System.out.println(data2);
        System.out.println(data2.reverse());
    }
}
