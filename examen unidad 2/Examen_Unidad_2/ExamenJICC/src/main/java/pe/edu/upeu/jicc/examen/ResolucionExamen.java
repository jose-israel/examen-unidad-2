//============================================RESOLUCION DE EXAMEN============================================================================
package pe.edu.upeu.jicc.examen;
import pe.edu.upeu.jicc.utils.LeerTeclado;

public class ResolucionExamen{
	
	
	LeerTeclado leerT = new LeerTeclado();
//1 ===========================================================================================================================================
	public void EJERCICIO1(int NumVehiculos){
	System.out.println("---EJERCICIO1---"); 
    System.out.println(); 	
	
	int CostoVehiculo = 0, Categoria = 0;
	double Impuesto1 = 0, Impuesto2 = 0, Impuesto3 = 0, ImpuestoTotal = 0;
	
	int x = 1;
	
    while(x <= NumVehiculos){
	
		Categoria = leerT.leer(0,"Ingrese la categoria del vehiculo numero "+x);
		System.out.println();
		CostoVehiculo = leerT.leer(0,"Ingrese el costo de vehiculo numero "+x);
		System.out.println();
		
		if(Categoria == 1){
			Impuesto1 = CostoVehiculo * 0.10;
			System.out.println("El costo del vehiculo numero "+x+" es de: S/"+CostoVehiculo+" Soles y el impuesto a pagar por este es de: S/"+Impuesto1+" Soles");
			System.out.println("------------------------------------------------------------------------------------------------------");
		
		}else if(Categoria == 2){
			Impuesto2 = CostoVehiculo * 0.07;
			System.out.println("El costo del vehiculo numero "+x+" es de: S/"+CostoVehiculo+" Soles y el impuesto a pagar por este es de: S/"+Impuesto2+" Soles");
		    System.out.println("------------------------------------------------------------------------------------------------------");
		
		}else{
			Impuesto3 = CostoVehiculo * 0.05;
			System.out.println("El costo del vehiculo numero "+x+" es de: S/"+CostoVehiculo+" Soles y el impuesto a pagar por este es de: S/"+Impuesto3+" Soles");
			System.out.println("------------------------------------------------------------------------------------------------------");
        }
         x++;
  }
    System.out.println();
    ImpuestoTotal = Impuesto1 + Impuesto2 + Impuesto3;
	System.out.println("El impuesto total a pagar es de: S/"+ImpuestoTotal+" Soles");
	System.out.println("=======================================================================");
	
}

//2 =============================================================================================================================================

    public void EJERCICIO2(int Tablas){
		
	 int i;
		
		int x = 0, n = 1;
		while(x < Tablas){
	    System.out.println("-------------");
		System.out.println(); 
        System.out.println("============");		
        System.out.println("Tabla del " + n+"");
		System.out.println("============");
		
        for(i = 1; i<=10; i++){
             System.out.println(""+n + " * " + i + " = " + n*i+""); 
        }
		i++;
		n++;
		x++;
	   }
	  
	 }
//3==============================================================================================================================================

    public void EJERCICIO3(){
	System.out.println("---EJERCICIO3---"); 
    System.out.println(); 
	
	double NumPerfect = 0;
	
	int x = 1, n = 2;
	
	while(x <= 6){
	if(n == 2){
	NumPerfect = Math.pow(2,n-1)*(Math.pow(2,n)-1);
	System.out.println("El primer numero perfecto es: "+NumPerfect+" y sus numeros enteros divisores son 1,2,3");
	System.out.println("-------------------------------------------------------------------------------------"); 
	
	}else if(n == 3){
	NumPerfect = Math.pow(2,n-1)*(Math.pow(2,n)-1);
	System.out.println("El segundo numero perfecto es: "+NumPerfect+" y sus numeros enteros divisores son 1,2,4,7,14");
	System.out.println("-----------------------------------------------------------------------------------------"); 
	
	}else if(n == 5){
	NumPerfect = Math.pow(2,n-1)*(Math.pow(2,n)-1);
	System.out.println("El tercer numero perfecto es: "+NumPerfect+" y sus numeros enteros divisores son 1,2,4,8,16,31,62,124,248");
	System.out.println("----------------------------------------------------------------------------------------------------"); 
	
	}else if(n == 7){
	NumPerfect = Math.pow(2,n-1)*(Math.pow(2,n)-1);
	System.out.println("El cuarto numero perfecto es: "+NumPerfect+" y sus numeros enteros divisores son 1,2,4,8,16,32,64,127,254,508,1016,2032,4064");
	System.out.println("----------------------------------------------------------------------------------------------------------------------"); 
	}
	x++;
	n++;
	}
  	
  }

//4============================================================================================================================================

public int EJERCICIO4(int num, int exp){ 
	int Resultado = 0;
	
    if (exp <= 0){
        Resultado = 1;
	}else{
		Resultado = num*EJERCICIO4(num,(exp-1));
	}
	return Resultado;
  } 
//Fin Resolucion de Examen=====================================================================================================================
 }


























