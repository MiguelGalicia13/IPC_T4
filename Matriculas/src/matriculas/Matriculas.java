
package matriculas;
import java.util.Scanner;
public class Matriculas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String n = sc.nextLine();
        System.out.println("A que carrera se desa matriclar, ingrese un numero");
        System.out.println("1. Ing. Sistemas || Matricula Q350 || Mensualidad Q650 ");
        System.out.println("2.    Derecho    || Matricula Q300 || Mensualidad Q550 ");
        System.out.println("3. Ing. Naviera  || Matricula Q300 || Mensualidad Q500 ");
        System.out.println("4. Ing. Pesquera || Matricula Q310 || Mensualidad Q460 ");
        System.out.println("5.  Contabilidad || Matricula Q280 || Mensualidad Q490 ");
        System.out.println("6 Administracion || Matricula Q360 || Mensualidad Q520 ");
        System.out.println("Ingrese su opcion: ");
        int op = sc.nextInt();
        switch (op){
            case 1 -> System.out.println(n + " Usted eligio Ing. Sistemas Matricula Q350 Mensualidad Q650 IGV: "+ 0.18*(350+650)+ " y su impotre total es de: "+ (350+650+0.18*(350+650)));
            case 2 -> System.out.println(n + " Usted eligio Derecho Matricula Q300 Mensualidad Q550 IGV: "+ 0.18*(300+550)+ " y su impotre total es de: "+ (300+550+0.18*(300+550)));
            case 3 -> System.out.println(n + " Usted eligio Ing. Naviera Matricula Q300 Mensualidad Q500  IGV: "+ 0.18*(300+500)+ " y su impotre total es de: "+ (300+500+0.18*(300+500)));
            case 4 -> System.out.println(n + " Usted eligio Ing. Pesquera Matricula Q310 Mensualidad Q460 IGV: "+ 0.18*(310+460)+ " y su impotre total es de: "+ (310+460+0.18*(310+460)));
            case 5 -> System.out.println(n + " Usted eligio  Contabilidad Matricula Q280 Mensualidad Q490 IGV: "+ 0.18*(280+490)+ " y su impotre total es de: "+ (280+490+0.18*(280+490)));
            case 6 -> System.out.println(n + " Usted eligio Administracion Matricula Q360 Mensualidad Q520 IGV: "+ 0.18*(360+520)+ " y su impotre total es de: "+ (360+520+0.18*(360+520)));
        }
    }
    
}
