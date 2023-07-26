
package carro;

import java.util.Scanner;

public class Consumo {
    
   int combustible=0; 
   float gas = 40;
   float gasolina = 70;
   float gasTurbo=32;
   float gasolinaTurbo=59.5f;
   float galonesGasSin=0;
   float galonesGasCon=0;
   float galonesGasolinaSin=0;
   float galonesGasolinaCon=0;
   float galonesGas =0;
   float galonesGasolina=0;
   float totalGas=0;
   float totalGasolina=0;
   float valorGas= 10000;
   float valorGasolina = 15000;

    public Consumo() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Que combustible deseas usar (Gas(1), Gasolina(0)):");
        combustible = sc.nextInt();
    }
   
    public void consumido(float distanciaConTurbo, float distanciaSinTurbo){
        if (combustible == 1) {  
            galonesGasSin= distanciaSinTurbo/gas;
            galonesGasCon= distanciaConTurbo/gasTurbo;
            
            galonesGas=galonesGasSin+galonesGasCon;
            
            totalGas=valorGas*galonesGas;
            
            System.out.println("El dinero gastado en combustible fue: "+totalGas);
        }
        
        else{         
            galonesGasolinaSin=distanciaSinTurbo/gasolina;
            galonesGasolinaCon=distanciaConTurbo/gasolinaTurbo;
            
            galonesGasolina=galonesGasolinaSin+galonesGasolinaCon;
            
            totalGasolina = valorGasolina*galonesGasolina;
            
            System.out.println("El dinero gastado en combustible fue: "+totalGasolina);
        }
    }
   
}
