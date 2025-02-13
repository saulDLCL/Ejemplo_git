/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package git;

import java.util.Scanner;

/**
 *
 * @author saul
 */
public class Hola {
    Scanner entrada = new Scanner (System.in);
    String mensaje;
    
    public void Mensajer(){
        mensaje=entrada.nextLine();
        System.out.println("El mensaje es:"+ mensaje);
    }
    public static void main(String[] args){
        //System.out.println("Hola mundo");
        Hola ejemplo=new Hola();
        ejemplo.Mensajer();
    }
}
