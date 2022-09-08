
package ejericio.pkg4;

import java.lang.Math;
import java.util.Scanner;
public class Ejericio4 {


    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
        System.out.println("Ingrese su edad");
        int edad = sc.nextInt();
        if(edad>=50){
            System.out.println("Usted es un adulto mayor");
        }else if(edad>=40){
            System.out.println("Usted es un adulto de mediana edad");
        }else if(edad>=20){
            System.out.println("Usted es un adulto joven");
        }else if(edad>=18){
            System.out.println("Ya eres mayor de edad");
        }else if(edad>=15){
            System.out.println("Estas en la adolecencia");
        }else if(edad>=11){
            System.out.println("Eres un preadolescente");
        }else if(edad>=4){
            System.out.println("estas en la infancia");
        }else if(edad>=0){
            System.out.println("es un bebé ");
        }
        else{
            System.out.println("Edad no valida");
        }
            
    }
    
}
