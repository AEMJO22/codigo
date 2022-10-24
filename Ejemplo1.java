/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primer.trabajo;

import java.util.Scanner;

/**
 *
 * @author alexi
 */
public class Ejemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombre;
        System.out.println("INGRESA TU NOMBRE");
        nombre=leer.next();
        System.out.println("hola mundo, Soy " + nombre+ " y estoy programando en java");// TODO code application logic here
    }
    
}
