/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaunit2;

/**
 *
 * @author edgar
 */
public class JavaUnit2 {

    static void imprimirMensaje(String sMensaje,  boolean bSalto){
        if (bSalto){
           System.out.println(sMensaje);
        }else {
           System.out.print(sMensaje);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        imprimirMensaje("Hola Comunidad de Desarrolladores de la UAC", false);
        imprimirMensaje("", true);
        imprimirMensaje("Vamos a Diretirnos programando",  false);
        imprimirMensaje("", true);
    }
    
}
