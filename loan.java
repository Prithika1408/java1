import java.util.Scanner;
class loan{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
System.out.println("Enter your Salary:");

        int salary=scan.nextInt();
        System.out.println("Enter your age:");
        int age=scan.nextInt();
        if(salary>20000 || age<25)
        {
            System.out.println("eligible for loan");
            System.out.println("Enter your loan amount:");
            int loan=scan.nextInt();
            if(loan<50000)
            {
                System.out.println("Available");
            }
            else{
                System.out.println("Maximum amount is 50000");
                            }
        }
        else{
            System.out.println("not eligible for loan");
        }
    }
}