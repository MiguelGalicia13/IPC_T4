

package numero.mayor;

import java.lang.Math;
import java.util.Scanner;

public class NumeroMayor {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int x= sc.nextInt();
        System.out.println("Ingrese otro numero");
        int z= sc.nextInt();
        if(z>x){
            System.out.println(z+" es el numero mayor");
        }else if(z<x){
            System.out.println(x+" es el numero mayor");
        }else{
            System.out.println("Son numero iguales");
        }
    }
    
}
