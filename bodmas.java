import java.util.Scanner;
public class bodmas {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("enter 1 number");
        float a=in.nextFloat();
        System.out.println("enter second number");
        float b=in.nextFloat();
        float sum =a+b;
        float diff= a-b;
        float mul=a*b;
        float div=a/b;
        System.out.println(sum);
        System.out.println(diff);
        System.out.println(mul);
        System.out.println(div);
    }
    
}
