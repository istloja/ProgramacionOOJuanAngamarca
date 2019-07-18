
package practicasdeprogramaciooo;

import java.util.Scanner;

public class Conversor {

  
    public static void main(String[] args) {
     Scanner dato = new Scanner(System.in);
     double Celsius;
     
        System.out.println("*******Ingrese un valor******* ");
        Celsius = dato.nextDouble();
        Celsius_Fahrenheit(Celsius);
    }
    public static void Celsius_Fahrenheit(double Celsius ){
         double Fahrenheit= Celsius*1.8+32;
         
         
         System.out.println( +Celsius+ " Grados Celsius es igual a = " +Fahrenheit + " Grados Fahrenheit");
         Fahrenheit_celsius(Fahrenheit);
         Fahrenheit_Kelvin(Fahrenheit);
         
    }
    public static void Fahrenheit_celsius(double Fahrenheit){
          double celsius = (Fahrenheit-32)/1.8;
         
         System.out.println(+ Fahrenheit + " Grados Fahrenheit es igual a = " + celsius+ " Grados Celsius");
         celsius_Kelvin(celsius);
    }
    public static void  celsius_Kelvin (double celsius){
        double Kelvin = celsius+273.15;
        
        System.out.println( + celsius + " Grados Celsius es igual a = " + Kelvin + " Grados Kelvin ");
        Kelvin_celsius(Kelvin);
        
        
    }
    public static void Kelvin_celsius(double kelvin){
        double celsius=kelvin-273.15;
        
        System.out.println( + kelvin +  " Grados Kelvin es igual a = " + celsius + " Grados Celsius ");
        
    }
    public static void Fahrenheit_Kelvin(double Fahrenheit){
        double  Kelvin1=(Fahrenheit-32)*5/9+273.15;
        
        System.out.println( + Fahrenheit+ " Grados Fahrenheit es igual a = " +Kelvin1+ " Grados Kelvin " );
        Kelvin_Fahrenheit(Kelvin1);
    }
    public static void Kelvin_Fahrenheit(double Kelvin1){
        double Fahrenheit1=(Kelvin1-273.15)*9/5+32;
        
            System.out.println( + Kelvin1 + " Grados Kelvin es igual a = " + Fahrenheit1 + " Gados Fahrenheit " );
    }
}
