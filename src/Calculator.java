import java.util.Scanner;

public class Calculator {
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        double a= sc.nextInt();
        System.out.println("Enter second number");
         double b=sc.nextInt();
        System.out.println("1-Addition");
        System.out.println("2-Substraction");
        System.out.println("3-Multiplication");
        System.out.println("4-Division");
        System.out.println("5-Exit");
        int c=sc.nextInt();
        switch (c){
            case 1: double d = a+b;
                System.out.println("Sum="+d);
                break;
            case 2: double e = a-b;
                System.out.println("Difference="+e);
                break;






        }


}
