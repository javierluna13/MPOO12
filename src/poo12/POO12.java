/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo12;

/**
 *
 * @author poo01alu24
 */
public class POO12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Hilos
        //creamos 2 hilos
        /*HiloT primero=new HiloT("Primer Hilo");
        primero.start();
        new HiloT("Segundo hilo").start();//segundo hilo
        
        new Thread(new HiloR(),"Tercer hilo ").start();
        new Thread(new HiloR(), "Cuarto hilo").start();
        */
        //creamos 4 hilos de tipo cuenta
        new Cuenta("Retiro 1").start();
        new Cuenta("Retiro 2").start();
        new Cuenta("Deposito 1").start();
        new Cuenta("Deposito 2").start();
        
        
    }
    
}
