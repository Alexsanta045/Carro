
package carro;
import java.util.Scanner;
public class Velocidad {
    
    int velocidad=0;
    int turbo = 0;
    int mayor60= 0;
    int menor60=0;
    int contvel = 0;
    int cont=0;
    int promvel=0;
    
    public void turbo(int destino){ 
        Scanner sc = new Scanner(System.in);
        
        //Inicio para medellin
        if (destino ==1) {
            for (int i = 0; i < 30; i=i+10) {
                System.out.print("A que velocidad va: ");
               velocidad = sc.nextInt();
            
            if (velocidad > 60) {
                mayor60 = mayor60+10;
                cont++;
            }
            else{
                menor60 = menor60+10;
                cont++;
            }
            contvel = contvel+velocidad;
           } 
            
            for (int j = 0; j < 4; j++) {
                System.out.print("A que velocidad va: ");
                velocidad = sc.nextInt();
            
            if (velocidad > 60) {
                mayor60 = mayor60+1;
                cont++;
            }
            else{
                menor60 = menor60+1;
                cont++;
            }
            contvel = contvel+velocidad;
            }
        }
        //Final para Medellin
            
        //Inicio para Bogota
        if (destino == 2) {
            for (int i = 0; i < 375; i=i+75) {
                System.out.print("A que velocidad va: ");
                velocidad = sc.nextInt();
            
            if (velocidad > 60) {
                mayor60 = mayor60+75;
                cont++;
            }
            else{
                menor60 = menor60+75;
                cont++;
            }
            contvel = contvel+velocidad;
            }
            
            for (int j = 0; j < 2; j++) {
                System.out.print("A que velocidad va: ");
                velocidad = sc.nextInt();
            
            if (velocidad > 60) {
                mayor60 = mayor60+1;
                cont++;
            }
            else{
                menor60 = menor60+1;
                cont++;
            }
            contvel = contvel+velocidad;
            }
        
        }
        //Final para Bogota
        
        //Inicio para Manizales,Caldas
        if (destino == 3) {
            for (int i = 0; i < 200; i=i+50) {
                System.out.print("A que velocidad va: ");
                velocidad = sc.nextInt();
            
            if (velocidad > 60) {
                mayor60 = mayor60+50;
                cont++;
            }
            else{
                menor60 = menor60+50;
                cont++;
            }
            contvel = contvel+velocidad;
            }
            
            for (int j = 0; j < 22; j=j+11) {
                System.out.print("A que velocidad va: ");
                velocidad = sc.nextInt();
            
            if (velocidad > 60) {
                mayor60 = mayor60+11;
                cont++;
            }
            else{
                menor60 = menor60+11;
                cont++;
            }
            contvel = contvel+velocidad;
            }
        
        }
        //Final para Manizales,Caldas
        
        //Inicio para Cartagena
        if (destino == 4) {
            for (int i = 0; i <670 ; i=i+134) {
                System.out.print("A que velocidad va: ");
                velocidad = sc.nextInt();
            
            if (velocidad > 60) {
                mayor60 = mayor60+134;
                cont++;
            }
            else{
                menor60 = menor60+134;
                cont++;
            }
            contvel = contvel+velocidad;
            }
            
            for (int j = 0; j < 4; j=j+2) {
                System.out.print("A que velocidad va: ");
                velocidad = sc.nextInt();
            
            if (velocidad > 60) {
                mayor60 = mayor60+2;
                cont++;
            }
            else{
                menor60 = menor60+2;
                cont++;
            }
            contvel = contvel+velocidad;
            }
        
        }
        //Final para Cartagena
        
        //Inicio para Marinilla
        if (destino == 5) {
            for (int i = 0; i <8 ; i=i+2) {
                System.out.print("A que velocidad va: ");
                velocidad = sc.nextInt();
            
            if (velocidad > 60) {
                mayor60 = mayor60+2;
                cont++;
            }
            else{
                menor60 = menor60+2;
                cont++;
            }
            contvel = contvel+velocidad;
            }
            
            for (int j = 0; j < 1; j++) {
                System.out.print("A que velocidad va: ");
                velocidad = sc.nextInt();
            
            if (velocidad > 60) {
                mayor60 = mayor60+1;
                cont++;
            }
            else{
                menor60 = menor60+1;
                cont++;
            }
            contvel = contvel+velocidad;
            }
        
        }
        //Final para Marinilla
        
        //Inicio para La Ceja,Antioquia
        if (destino == 6) {
            for (int i = 0; i <18 ; i=i+6) {
                System.out.print("A que velocidad va: ");
                velocidad = sc.nextInt();
            
            if (velocidad > 60) {
                mayor60 = mayor60+6;
                cont++;
            }
            else{
                menor60 = menor60+6;
                cont++;
            }
            contvel = contvel+velocidad;
            }
            
            for (int j = 0; j < 1; j++) {
                System.out.print("A que velocidad va: ");
                velocidad = sc.nextInt();
            
            if (velocidad > 60) {
                mayor60 = mayor60+1;
                cont++;
            }
            else{
                menor60 = menor60+1;
                cont++;
            }
            contvel = contvel+velocidad;
            }
        
        }
        //Final para La Ceja,Antioquia
        
        //Inicio para El Carmen de Viboral
        if (destino == 7) {
            for (int i = 0; i <12 ; i=i+4) {
                System.out.print("A que velocidad va: ");
                velocidad = sc.nextInt();
            
            if (velocidad > 60) {
                mayor60 = mayor60+4;
                cont++;
            }
            else{
                menor60 = menor60+4;
                cont++;
            }
            contvel = contvel+velocidad;
            }
        
        }
        //Final para El Carmen de Viboral
        
        //Inicio para Guatape
        if (destino == 4) {
            for (int i = 0; i <42 ; i=i+7) {
                System.out.print("A que velocidad va: ");
                velocidad = sc.nextInt();
            
            if (velocidad > 60) {
                mayor60 = mayor60+7;
                cont++;
            }
            else{
                menor60 = menor60+7;
                cont++;
            }
            contvel = contvel+velocidad;
            }
        
        }
        //Final para Guatape
        turbo = mayor60;
        promvel= contvel/cont;
    }
}
