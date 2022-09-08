package mayor.a.menor;
import java.util.Scanner;
public class MayorAMenor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int a = sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        int b = sc.nextInt();
        System.out.println("Ingrese el tercer numero");
        int c = sc.nextInt();
       if(a>b){
           if(a>c){
               if(b>c){
                   System.out.println(a+" "+b+" "+c);
               }else{
                   System.out.println(a+" "+c+" "+b);
               }
           }else{
               System.out.println(c+" "+a+" "+b);
           }
       }else{
           if(b>c){
               if(a>c){
                   System.out.println(b+""+a+""+c);
               }else{
                   System.out.println(b+""+c+""+a);
               }
           }else{
               System.out.println(c+""+b+""+a);
           }
       }
   
    }
    
}
