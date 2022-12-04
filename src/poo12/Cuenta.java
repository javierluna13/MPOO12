/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo12;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author poo01alu24
 */
public class Cuenta extends Thread{
    private static double saldo;//es privado por que solo se accede a traves de getters y setters
    //vamos a hacer 4 hilos 2 para retirar y 2 para ingresar
    public Cuenta(String name){
        super(name);
        saldo=0;
    }

    public static double getSaldo() {
        return saldo;
    }
    
    public static double consultaSaldo(){
        return saldo;
    }
    public synchronized void depositarDinero(double monto){
        saldo+=monto;
        System.out.println("Depositando...... saldo $"+saldo);
        notifyAll();
    }
    
    public synchronized void retirarDiner(double monto){
        if(monto>saldo){
            System.out.println(getName()+ " debe esperar un deposito Saldo: "+ saldo);
            try {
                sleep(50);//se duerme oara esperar el deposito
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
        }else{
            saldo-=monto;
            System.out.println(getName()+" extrajo la canatidad $"+ monto + "Saldo actual: $" + saldo);
        }
        notifyAll();
    }
    
    @Override
    public void run(){//aqui tiene que ir el for
        if(getName().equals("Deposito 1")||getName().equals("Deposito 2")){
            //para saber cual hilo vamos a usar usamos la funcion run
            int x=0;
            while (x<=50){
             this.depositarDinero(100); 
             x++;
            }
        }else{
            int i=0;
            while (i<=50){
             this.retirarDiner(50); 
             i++;
            }
            
        }
    }
}
