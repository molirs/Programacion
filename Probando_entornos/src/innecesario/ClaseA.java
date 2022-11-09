/**************************************************************************
AUTOR: MIGUEL MOLINA QUEROL
FECHA INICIO: 18-10-2022
FECHA DE FINALIZACION: 18-10-2022
CENTRO: I.E.S. PABLO SERRANO
TITULACION: PROGRAMACION APLICACIONES MULTIPLATAFORMA
MODULO: PROGRAMACION
COMENTARIO: PROGRAMA QUE TE OFRECE CALCULAR EL AREA DE 3 FIGURAS DIFERENTES
			UNA VEZ ELEGIDA LA FIGURA LE DAMOS LOS VALORES DIMENSIONALES
			DE LA FIGURA Y EL PROGRAMA NOS IMPRIME EN PANTALLA EL AREA
**************************************************************************/

package innecesario;
import java.util.Scanner;

public class ClaseA {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int seleccion,base,altura;
		float area;
		
		System.out.println("Buenas tardes usuario elija de que figura quiere calcular el area introducioendo el nuemro correspondiente: ");
	    System.out.println("- TRIANGULO (1) ");
	    System.out.println("- CUADRADO (2) ");	
	    System.out.println("- RECTANGULO (3) ");
	    System.out.println(": ");
	    seleccion=teclado.nextInt();
	    switch(seleccion) {
	    	case 1:
	    	    System.out.println("Se ha seleccionado el triangulo:");
	    	    System.out.println("      *");
	    	    System.out.println("     * *");
	    	    System.out.println("    *   *");
	    	    System.out.println("   *     *");
	    	    System.out.println("  * * * * *");
	    		System.out.println("introduzca la base del triangulo: ");	
	    		base=teclado.nextInt();
	    		System.out.println("introduzca la altura del triangulo: ");	
	    		altura=teclado.nextInt();
	    		area=base*altura/2.0F;
	    		System.out.println("El area del triangulo es: "+area);
	    	break;
	    	case 2:
	    	    System.out.println("Se ha seleccionado el Cuadrado:");
	    	    System.out.println("  * * * * *");
	    	    System.out.println("  *       *");
	    	    System.out.println("  *       *");
	    	    System.out.println("  *       *");
	    	    System.out.println("  * * * * *");
	    		System.out.println("introduzca la base del cuadrado: ");	
	    		base=teclado.nextInt();
	    		area=(float)Math.pow(base,2);
	    		System.out.println("El area del cuadrado es: "+area);
	    	break;
	    	case 3:
	    	    System.out.println("Se ha seleccionado el Rectangulo:");
	    	    System.out.println("  * * * * * * * *");
	    	    System.out.println("  *             *");
	    	    System.out.println("  *             *");
	    	    System.out.println("  *             *");
	    	    System.out.println("  * * * * * * * *");
	    		System.out.println("introduzca la base del rectangulo: ");	
	    		base=teclado.nextInt();
	    		System.out.println("introduzca la altura del rectangulo: ");	
	    		altura=teclado.nextInt();
	    		area=base*altura;
	    		System.out.println("El area del rectangulo es: "+area);
	    	break;
	    	default:
	    		System.out.println("Numero de seleccion incorrecto reinicie el programa.");
	    }
	}
}
