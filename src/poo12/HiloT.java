/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo12;

/**
 *
 * @author poo01alu24
 */
public class HiloT extends Thread{//extencion para traer a los hilos (Tread)

    public HiloT(String name) {
        super(name);
    }
    
    public void run(){
        for(int i =0; i<10;i++){
            System.out.println("Iteracion "+(i+1)+" de "+getName());
        }
        System.out.println("Termina el for "+getName());
    }
    
}
