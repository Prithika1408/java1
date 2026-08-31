
import java.util.Scanner;
class add{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        int d=(a*b*c);
        int e=(a+b+c);
        int f=(d/e);
        System.out.println("multiple of a,b,c="+d);
        System.out.println("adding of a,b,c="+e);
        System.out.println("div of d and e="+f);
    }
}