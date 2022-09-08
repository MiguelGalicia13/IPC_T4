
package integra;

import java.util.Arrays;
public class Integra {

    public static void main(String[] args) {
       int i;
       int y;
        for(i=0;i<=10;i++){
        y=(i*i)+i;
        if(i==0||i==10){
        }else if(i%2==0){
            y=y*2;
        }else{
            y=y*4;
        }
            System.out.println(y);
        }
    
    int arreglo[] = {0,8,12,48,40,120,84,224,144,360,110};
    float suma = 0;
    for (int x = 0; x < arreglo.length; x++) {
    suma = suma + arreglo[x];
}
        float integral=suma/3;
        System.out.println("La integral de la funcion de 0 a 10 es de "+integral);
    }
    
}
