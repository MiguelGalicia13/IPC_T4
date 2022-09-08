package factorial;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x =1;
        System.out.println("Ingrese el numero para obtener su facotrial");
        double n = sc.nextDouble();
        while ( n!=0) {
        x=x*n; n--; /*
        N es el facotrial que se desea encontrar
       X se define como 1 para que el N se multiplique por el 1 y el n-- para que N vaya
       decreciendo
       n!=n*(n-1)*(n-2)*...*1
*/
    }
        System.out.println(x);
    }
    
}
