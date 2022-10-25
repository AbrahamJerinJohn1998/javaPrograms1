import java.util.Scanner;

public class Fibonacci {
    public static int fib(int k)
    {
        if (k == 0)
        {
            return 0;
        }
        else if (k == 1||k==2)
        {
            return 1;
        }
        else
        {
            return (fib(k - 1) + fib(k - 2));
        }

    }

    public static void main(String[] args) {

        Fibonacci f =new Fibonacci();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int k= scanner.nextInt();
        System.out.println("Fibonacci value of " + k + " is :"+ f.fib(k));
        System.out.println("Fibonacci series up to " + k + " is:");
        for(int i=0;i<k;i++){
            System.out.print(fib(i)+" ");
        }
    }
}