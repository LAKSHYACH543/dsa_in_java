import java.util.Scanner;
public class si {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("enter principal");
        float p= in.nextFloat();
        System.out.println("enter rate");
        float r= in.nextFloat();
        System.out.println("enter time");
        float t= in.nextFloat();
        float si=(p*r*t)/100;
        System.out.println("the simple interest is "+si);
    }
    
}
