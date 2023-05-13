/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba1p1_emilianourtecho.pkg12241029;

import java.util.Scanner;

/**
 *
 * @author emili
 */
public class Prueba1P1_EmilianoUrtecho12241029 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner escan = new Scanner (System.in);
        int eleccion, cont_menu=0; 
        
        System.out.println("Bienvenido a mi primera prueba práctica en Java, las opciones son las siguientes: ");
        System.out.println("    1. Repetir mi nombre. ");
        System.out.println("    2. SubMenu de mensajes. ");
        System.out.println("    3. Salir ");
        System.out.println("Cual desea ver?: ");
        eleccion = escan.nextInt();
        
        do{
            switch (eleccion){
                case 1:
                    int repe;
                    
                    System.out.print("Ingrese su nombre y apellido: "); // Le pido el nombre y apellido aunque me confundi en el ejemplo que en ningun momento puso la entrada preguntando el nombre
                    String nombre = escan.nextLine();
                    nombre = escan.nextLine(); // Hago esto porque por alguna razon solo asi mi computador puede puede leer los strings.
                    
                    System.out.print("Cantidad de veces que se repitira el texto: ");
                    repe = escan.nextInt();
                    
                    for (int i = 1; i <= repe; i++) { //uso un for para que me repita la cantidad de veces el siguiente texto
                        System.out.println("Hola mi nombre es "+nombre+ " miren mi prueba!");
                    }
                    break;
                case 2:
                        int submenu;
                        
                        System.out.println("Seleccione 1 o 2 para este submenu. Que desea seleccionar?: ");
                        System.out.println("    1. Entrar al submenu");
                        System.out.println("    2. Salir de este submenu");
                        System.out.println("Cual desea ver?: ");
                        submenu = escan.nextInt();
                        
                        do {
                            switch (submenu){
                                case 1:
                                    System.out.println("Usted ya esta dentro del submenu, vuelva a elejir una de estas opciones!!");
                                    break;
                                case 2:
                                    System.out.println("Por favor, dele un vistazo al programa, si no ha visto nada aun.");
                                    break;
                                default:
                                    System.out.println("Hmm, no puedo leer el programa disculpe mi limite sobre esta opcion. Le invito a volver a intentarlo. ");
                                    break;
                            }           
                            System.out.println(" ");
                            System.out.println("Seleccione 1 o 2 para este submenu. Que desea seleccionar?: ");
                            System.out.println("    1. Entrar al submenu");
                            System.out.println("    2. Salir de este submenu");
                            submenu = escan.nextInt();
                            if (submenu == 2) {
                                System.out.println("Hasta luego, gracias por usar mi programa!");
                                break;
                            }
                    }while (submenu != 2);
                        
                    break;
                case 3:
                    System.out.println("Vamos, recien estamos empezando. Ingrese otro numero por favor. "); // Mi computadora no tiene tildes. 
                    break;
                default:
                    System.out.println("Lo lamento, no le puedo ayudar si me ingresa ese tipo de numero(s). Favor, vuelva a intentarlo.");
                    break;
            }
                System.out.println(" "); //No imprimo nada aqui para crear un espacio para el siguiente menu. 
                System.out.println("Hola de nuevo, pruebe con otras opciones del menu: ");
                System.out.println("    1. Repetir mi nombre. ");
                System.out.println("    2. SubMenu de mensajes. ");
                System.out.println("    3. Salir ");
                System.out.println("Cual desea ver?: ");
                eleccion = escan.nextInt();
                cont_menu += 1; // Esto me ayudara a contar las veces que ha utilizado el menu principal, una vez ya este dentro de este.
                    if (eleccion == 3) {
                        System.out.println("Adios, esta fue mi prueba! ");
                    }
                System.out.println("La cantidad de veces que usted ha utilizado el menu principal fueron de: " +cont_menu);
        }while (eleccion != 3);
    }
    
}
