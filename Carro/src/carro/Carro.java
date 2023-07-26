
package carro;

import java.util.Scanner;

public class Carro {
public static void main (String[]args){
 Scanner sc = new Scanner(System.in);   
 
 Velocidad vel = new Velocidad();
 
 Prender_Carro pc = new Prender_Carro();
 
 
 pc.puertas(0);
 pc.palanca(0);
 pc.freno(0);
 pc.prender();
 
Destinos destinos = new Destinos();
destinos.destino();
int destino = destinos.destino;


Consumo consumo = new Consumo();

        
vel.turbo(destino);
float kilometros = destinos.kilometros;
float velo= vel.promvel;
int conTurbo =vel.mayor60;
int sinTurbo = vel.menor60;
System.out.println("LLegamos a su destino");
    
consumo.consumido(conTurbo, sinTurbo);

Tiempo tp = new Tiempo(kilometros, velo);

Apagar_Carro ac = new Apagar_Carro ();

ac.palanca(0);
ac.velocidad();
ac.apagar();
        
}
}
