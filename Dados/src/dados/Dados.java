
package dados;


public class Dados {


    public static void main(String[] args) {
        System.out.println("Se realizara el lanzamiento de tres dados");
        int dado1 = (int)(Math.random()*6+1);
        int dado2 = (int)(Math.random()*6+1);
        int dado3 = (int)(Math.random()*6+1);
        System.out.println("El resultado del dado 1 es "+dado1);
        System.out.println("El resultado del dado 2 es "+dado2);
        System.out.println("El resultado del dado 3 es "+dado3);
        int r = dado1+dado2+dado3;
        if(r==18){
            System.out.println("Excelente resultado");
        }else if(dado1==6&&dado2==6 || dado1==6&&dado3==6 || dado2==6&&dado3==6 ){
            System.out.println("Muy bien");
        }else if(dado1==6&&dado2!=6&&dado3!=6 || dado2==6&&dado1!=6&&dado3!=6 || dado3==6&&dado2!=6&&dado1!=6){
            System.out.println("Regular");
        }else if(dado1!=6&&dado2!=6&&dado3!=6){
            System.out.println("Pesimo");
        }
    }
    
}
