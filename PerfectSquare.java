import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a,b,n;
        System.out.println("Enter the lower limit");
        a =scanner.nextInt();
        System.out.println("Enter the upper limit");
        b =scanner.nextInt();
        System.out.println("The perfect squares between the lower limit "+a+ " and upper limit  "+b+
                " are:");
        for(int i=a;i<=b;i++)
        {
             n=i*i;
             if(n<=b)
             {

                 System.out.println(n);
             }

        }
        }
    }