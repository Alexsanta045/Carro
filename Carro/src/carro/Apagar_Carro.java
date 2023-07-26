
package carro;

import java.util.Scanner;

public class Apagar_Carro {
    int palanca=0;
    int velocidad = 1;

    public Apagar_Carro() {
    }
    
    
    public void palanca(int palanca){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Poner la palanca en parking? (Si(1), No(0) ):");
        palanca = sc.nextInt();
        
        if (palanca == 1) {
            System.out.println("Puse la palanca en parking");    
        }
        
        if (palanca == 0) {
            System.out.println("No he puesto la palanca en parking");   
        }
        
        this.palanca = palanca;
    }
    
    public void velocidad(){
        Scanner sc = new Scanner(System.in);
    
        System.out.println("A que velocidad va el vehiculo: ");
        velocidad=sc.nextInt();  
    }
            
    public void apagar(){
        Scanner sc = new Scanner(System.in);
        
        if (palanca == 1 && velocidad == 0) {
                System.out.println("El auto se ha apagado exitosamente");
                palanca=1;
            }
        while(palanca != 1) {
            
            if (palanca == 0) {
                System.out.println("La palanca no se a puesto en parking");
                palanca =0;
            }    
                System.out.print("Poner la palanca en parking? (Si(1), No(0) ):");
                palanca = sc.nextInt();
        
                if (palanca == 1) {
                    System.out.println("Puse la palanca en parking");    
                }
        
                if (palanca == 0) {
                    System.out.println("No he puesto la palanca en parking");   
                }
            
        }
        
        while(velocidad != 0){
            if (velocidad > 0) {
                System.out.println("El auto no se puede apagar mientras esta en movimiento"); 
            }
            
            System.out.println("A que velocidad va el vehiculo ");
            velocidad =sc.nextInt();  
        }
        
        System.out.println("El auto se ha apagado exitosamente");
        
    }
}
