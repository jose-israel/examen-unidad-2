//======================================MENU DE OPCIONES====================================================================================00
package pe.edu.upeu.jicc;

import java.io.IOException;
import pe.edu.upeu.jicc.examen.*;
import pe.edu.upeu.jicc.utils.*;

public class App{
	

    public static void main(String[] args) throws IOException {
        try {
            LeerTeclado teclado=new LeerTeclado();    
            ResolucionExamen obj=new ResolucionExamen();

            char opcion='S'; //S=SI, N=NO
            String NumAlgoritm="01";

            do{          
				
                NumAlgoritm = teclado.leer("",
                "Ingrese el numero de Algoritmo que desee probar: \n"+
				"01= EJERCICIO1\n"+
				"02= EJERCICIO2\n"+
				"03= EJERCICIO3\n"+
				"04= EJERCICIO4");
				
                switch(NumAlgoritm){
                case "01":
				int NumVehiculos = teclado.leer(0,"Ingrese el numero de vehiculos");
				obj.EJERCICIO1(NumVehiculos);
				break;
				case "02":
                int Tablas = teclado.leer(0,"Introduce un numero de tablas a multiplicar");
				obj.EJERCICIO2(Tablas);
				break;
				case "03": 
				obj.EJERCICIO3();
				break;
				case "04":
				int num = teclado.leer(0,"Ingrese la base");
				int exp = teclado.leer(0,"Ingrese el exponente");
				System.out.println("El resultado es: "+obj.EJERCICIO4(num,exp));
				break;
                default: System.out.println("La opcion No existe!!"); break;
                }   
                System.out.println();
                opcion=teclado.leer(' ', "|---¿Desea Probar mas Algoritmos?---> S=SI, N=NO");
            }while(opcion=='S' || opcion=='s');   
        } catch (Exception er) {
            System.out.println(er.getMessage());
        }
		
    }
}
