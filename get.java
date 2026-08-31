import java.util.Scanner;
class get{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the num1:");
    int num1 = scan.nextInt();
    System.out.println("Enter the num2:");
    int num2 = scan.nextInt();
    String result= num1<num2? "num2 is big":"num1 is big";
    System.out.println(result);
    }
}