
package par.o.impar;

import java.lang.Math;
import java.util.Scanner;

public class ParOImpar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int x= sc.nextInt();
        float z = x%2;
        if(z==0){
            System.out.println("Es un numero par");
        }else{
            System.out.println("Es un numero impar");
        }
        if(x<0){
            System.out.println("Es un numero negativo");
        }else if(x>0){
            System.out.println("Es un numero positivo");
        }else{
            System.out.println("Su numero es 0");
        }
    }
    
}
