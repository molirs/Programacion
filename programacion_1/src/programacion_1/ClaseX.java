/**************************************************************************
AUTOR: MIGUEL MOLINA QUEROL
FECHA INICIO: 7-11-2022
FECHA DE FINALIZACION: 7-11-2022
CENTRO: I.E.S. PABLO SERRANO
TITULACION: PROGRAMACION APLICACIONES MULTIPLATAFORMA
MODULO: PROGRAMACION
COMENTARIO: PROGRAMA QUE LEE UNA CADENA DE 20 CARACTERES O MENOS Y LE DA
			LA VUELTA PONIENDO CADA VEZ MAS LETRAS DEL FINAL EN LA PARTE
			DE DELANTE DE LA FRASE
**************************************************************************/

package programacion_1;
import java.util.Scanner;

public class ClaseX {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		String cadena1,aux1,cadena2="",cadena3="";
		int length;
		char aux2;
		
		System.out.println("Introduceme una cadena de 60 caracteres o menos: ");
		cadena1=teclado.nextLine();
		cadena1=cadena1.toUpperCase();
		length=cadena1.length();
		if(length<=20) {
			for(int i=0;i<length;i++){
				aux1=cadena1.substring(0,length-i);
				if(i!=0) {
					 for(int j=i;j>0;j--) {
						aux2=cadena1.charAt(length-j);
						cadena3+=aux2;
					 }
					 cadena2=cadena3+aux1;
					 cadena3="";				}
				else if(i==0){
					System.out.println(cadena1);
				}
				if(i!=0) {
					System.out.println(cadena2);
				}
			}
		}
	}
}
