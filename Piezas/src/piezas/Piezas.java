
package piezas;

import java.util.Scanner;
public class Piezas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double peso;
        int i=0;
        int x=0;
        int y=0;
        int z=0;
        do{
            System.out.println("Ingrese el peso");
            peso = sc.nextDouble();
           i++;
           if(peso<9.8){
               x++;
           }else if(peso<=10.2){
               y++;
           }else if(peso>10.2){
               z++;
           }
        }while(peso!=0);
        System.out.println("Usted ingreso "+i+" datos");
        System.out.println(y+" datos estan entre 9.8 y 10.2");
        System.out.println(z+" datos son mayores a 10.2");
        System.out.println((x-1)+" datos son menores a 9.8");
    }
    
}
