package MainPackage;

import java.util.Scanner;

public class Zadacha1 {
    public static double celsiusToFahrenheit(double c){
        return 9.0/5.0*c+32;
    }
    public static double fahrenheitToCelsius(double f){
        return 5.0/9.0*(f-32);
    }
    public static void convert(){
        System.out.println("(0)Celsius to fahrenheit (1)Fahrenheit to celsius");
        Scanner S=new Scanner(System.in);
        System.out.print("Choice: ");
        int choice;
        choice=S.nextInt();
        while(choice<0||choice>1) {
            System.out.print("Choice: ");
            choice=S.nextInt();
        }
        System.out.print("T=");
        double t;
        t=S.nextDouble();
        if(choice==0) System.out.println(celsiusToFahrenheit(t));
        if(choice==1) System.out.println(fahrenheitToCelsius(t));
        S.close();
    }
}
