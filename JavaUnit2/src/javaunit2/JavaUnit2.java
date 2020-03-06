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
        imprimirMensaje("_______  ______   _______  _______  ______   ", true);
        imprimirMensaje("|       ||      | |       ||   _   ||    _ | ", true); 
        imprimirMensaje("|    ___||  _    ||    ___||  |_|  ||   | || ", true); 
        imprimirMensaje("|   |___ | | |   ||   | __ |       ||   |_||_", true); 
        imprimirMensaje("|    ___|| |_|   ||   ||  ||       ||    __  |", true);
        imprimirMensaje("|   |___ |       ||   |_| ||   _   ||   |  | |", true);
        imprimirMensaje("|_______||______| |_______||__| |__||___|  |_|", true);
        
        
        imprimirMensaje("________    _     ", true);              
        imprimirMensaje("_(_______)  | |   ", true);               
        imprimirMensaje("_ _____   __| | ____ _____  ____ ", true);
         imprimirMensaje("_|  ___) / _  |/ _  (____ |/ ___)", true);
        imprimirMensaje("_| |____( (_| ( (_| / ___ | |    ", true);
//        imprimirMensaje("_|_______)____|\___ \_____|_|   ", true); 
        imprimirMensaje("_             (_____|     ", true);       
                
        imprimirMensaje("Hola Comunidad de Desarrolladores de la UAC",  false);
        imprimirMensaje("",  true);
        imprimirMensaje("Vamos a Divertirnos programando",  false);
        imprimirMensaje("",  true);
        imprimirMensaje("Trabajando con la herramienta GitHub",  false);
        imprimirMensaje("Para probar trabajar en equipo",  false);
        
    }
    
}
