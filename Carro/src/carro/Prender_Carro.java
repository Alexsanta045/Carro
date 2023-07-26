
package carro;

import java.util.Scanner;
public class Prender_Carro {
   
    int puertas= 0;
    int palanca =0;
    int freno =0;
    
    
    public void puertas(int puertas){
        Scanner sc = new Scanner(System.in);   
        System.out.print("Cerrar puertas? (Si(1), No(0) ):");
        puertas = sc.nextInt();
        while(puertas != 1){
        System.out.print("Cerrar puertas? (Si(1), No(0) ):");
        puertas = sc.nextInt();
        }
        this.puertas= puertas;
    }
    public void palanca(int palanca){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Poner la palanca en parking? (Si(1), No(0) ):");
        palanca = sc.nextInt();
        
        while(palanca !=1){
        System.out.print("Poner la palanca en parking? (Si(1), No(0) ):");
        palanca = sc.nextInt();
        }
        
        this.palanca = palanca;
    }
    public void freno(int freno){
        Scanner sc = new Scanner(System.in); 
        
        System.out.print("Pisar el freno (Si(1), No(0) ):");
        freno= sc.nextInt();
        
        while(freno !=1){
        System.out.print("Pisar el freno (Si(1), No(0) ):");
        freno= sc.nextInt();
        }
        
        this.freno= freno;
    }
    
    public void prender(){
        if (puertas == 1 && palanca == 1 && freno == 1) {
            System.out.println("El carro se encendio con exito");
        }
        
    }
}
