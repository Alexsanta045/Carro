
package carro;
import java.util.Scanner;
public class Destinos {
    
    int kilometros;
    int destino = 0;
    
    
    public Destinos() {
       Scanner sc = new Scanner(System.in);
       
        System.out.print("A que destino quieres ir\n 1 Medellin\n 2 Bogota\n 3 Manizales,Caldas\n 4 Cartagena\n 5 Marinilla\n"
                 +" 6 La ceja,Antioquia\n 7 El Carmen de Viboral \n 8 Guatape\n Seleccione: ");
        destino =sc.nextInt();

    }
    
    public void destino(){
        if (destino == 1) {
            kilometros = 34;    
        }
        if (destino == 2) {
            kilometros = 377; 
        }
        if (destino == 3) {
            kilometros = 222;
        }
        if (destino == 4) {
            kilometros = 674;
        }
        if (destino == 5) {
            kilometros = 9;
        }
        if (destino == 6) {
            kilometros = 19;
        }
        if (destino == 7) {
            kilometros = 12;
        }
        if (destino == 8) {
            kilometros = 42;
        }
        System.out.println("Los kilometros a recorrer son: "+kilometros);
    }
}
