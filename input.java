import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        int a,b;
        int sum=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter two  number"); 
        a=in.nextInt();
        b=in.nextInt();
        System.out.println("the entered number are");
        System.out.println(a);
        System.err.println(b);
        sum=a+b;
        System.out.println("sum of two number is:"+sum);
    }
    
}
