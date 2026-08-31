import java.util.Scanner;
class name{
    public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        String name=scan.nextLine();
        double score=scan.nextInt();
        scan.nextLine();
        String department=scan.nextLine();
        System.out.println("My name is:"+name);
        System.out.println("My score is:"+score+"/10");
        System.out.println("My department is:"+department);
    }
}