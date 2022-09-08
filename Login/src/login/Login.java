
package login;

import java.util.Scanner;
public class Login {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         String usuario;
         String contra;
                 System.out.println("Ingrese su usuario");
                 usuario = sc.nextLine();
                 System.out.println("Ingrese su contrasenya");
                   contra = sc.nextLine();
                 if(usuario.equals("user")&&contra.equals("paso")){
                     System.out.println("Inicio de sesion exitoso");                   
                 }else{
                     System.out.println("Usuario y/o incorrecta");
                 }
    }
    
}
