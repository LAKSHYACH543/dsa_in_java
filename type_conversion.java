import java.util.Scanner;
public class typeconversion {
 public static void main(String[] args)
 {
    Scanner in= new Scanner(System.in);
    float a=in.nextFloat();
    System.out.println(a);
    int num=(int)(67.89f);
    System.out.println(num);
    int g=257;
    byte b=(byte)(g);//maximum as byte can store only 256 and it will give 257 remainder 256 == 1
   byte f=40;
   byte e=50;
   byte c=100;
   int d =(f*e)/c;
   System.out.println(d);
   int number='a';
   System.out.println(number);
   System.out.println(3*5.46f);
 }

}
