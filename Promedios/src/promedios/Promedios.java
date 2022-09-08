
package promedios;

import java.util.Scanner;
public class Promedios {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Programa para calcualr promedio");
        System.out.println("Ingrese su primer nota");
        int a = sc.nextInt();
        System.out.println("Ingrese su segunda nota");
        int b = sc.nextInt();
         System.out.println("Ingrese su tercera nota");
        int c = sc.nextInt();
        System.out.println("Ingrese su cuarta nota");
        int d = sc.nextInt();
        double x = (a*0.2);
        double y = (b*0.2);
        double z = c*0.3;
        double v = d*0.3;
        double prom = x+y+z+v;
        if(prom<=60.5){
            System.out.println("Ucted reprobo con "+prom+" pts.");
        }else if(x<=70.5){
            System.out.println("Usted aprobo decentemente con "+prom+" pts.");
        }else if(x<=80.5){
            System.out.println("Usted aprobo de manera aceptable con "+prom+" pts.");
        }else if(x<=100){
            System.out.println("Usted aprobo con promedio excelente con" +prom+" pts.");
        }
    }
    
}
