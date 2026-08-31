import java.util.Scanner;
class marks{
    public static void main(String args[]){
        Scanner marks=new Scanner(System.in);
        int a=marks.nextInt();
        int b=marks.nextInt();
        int c=marks.nextInt();
        int d=marks.nextInt();
        int e=marks.nextInt();
        int totalmarks=a+b+c+d+e;
        int avg=totalmarks/5;
        if(avg<30)
        {
            System.out.println("Additional class requried");
        }
        else
        {
        System.out.println("You are good to go");
        }
    }
}