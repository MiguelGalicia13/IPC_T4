package digitos;

import java.util.Scanner;
public class Digitos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Ingrese un numero entre 0 y 99999");
         int x = sc.nextInt();
         if(x>0){
             if(x<100000){
                 if(x<10){
                     System.out.println("Su numero tiene un digito");
                 }else if(x<100){
                     System.out.println("Su numero tiene 2 digitos");
                 }else if(x<1000){
                     System.out.println("Su numero tiene 3 digitos");
                 }else if(x<10000){
                     System.out.println("Su numero tiene 4 digitos");
                 }else if(x<=99999){
                     System.out.println("Su numero tiene 5 digitos");
                 }
             }else{
                 System.out.println("Ingreso un numero muy alto");
             }
         }else{
             System.out.println("Ingreso un numero negativo");
         }
    }
    
}
