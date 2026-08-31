import java.util.Scanner;
class dept{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        String a =scan.nextLine();
        String c =scan.nextLine();
        double b =scan.nextDouble();
        System.out.println("My name is:"+a);
        System.out.println("my Score is:"+b/10);
        System.out.println("My dept is:"+c);
    }
}