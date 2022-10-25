import java.util.Scanner;

public class FahrenheitTocelsius {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the temperature in fahrenheit");
        float Fahrenheit= sc.nextFloat();
        float Celsius=((Fahrenheit-32)*5)/9;
        System.out.println("The temperature in Celsius is "+ Celsius);
    }
}