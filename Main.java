import java.util.Scanner;
import java.io.*;

public class main 
{


	int n=3000;
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int intR;
		Scanner scan = new Scanner( System.in );
		String seleccion="";
        SelSort cadena=new SelSort();
		
		GetRandom escribir = new GetRandom();
		escribir.crearTxt();// se crea archivo con 3000 numeros random.
		GetRandom array = new GetRandom(); 
		String [] arr=array.guardarArray();//se crea el array con los numeros del archivo 
			
		try
		{
			
			FileInputStream archStream  = new FileInputStream("file.txt");
			// Creamos el objeto de entrada
			DataInputStream entrada = new DataInputStream(archStream);
			// Creamos el Buffer de Lectura
			BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
			//se crea el array de tamaño de 3000 elementos (0-2999)
			int [] intArray=new int [3000];
			
			//ciclo para llenar el array de ints / USAREMOS EL ARRAY llamado intArray
			
			for (int i=0;i<3000;i++)
			{
				String strNum=buffer.readLine();
				int intNum = Integer.parseInt(strNum);
				intArray[i]=intNum;
				System.out.println("random generado y almacenado No..."+ i);
				//System.out.println("----- >"+ i);	
			}
		
			System.out.println("\n    #######################################################\n    #  Programa para ordenamiento por distintos metodo    #\n    #######################################################\n");
			System.out.println("     *** Ejecutando los metodos seleccionados de ordenamiento ***\n\n *Selection Sort\n *Radix Sort\n *Insertion\n");
			
			System.out.println("\n   Se  crearan archivos.txt con los elementos del arreglo ordenados\n   esto como una forma de demostrar el buen funionamiento de los mismos");
			
			
			
			//codigo Erick
			cadena.selecSortP(intArray);
			System.out.println("   *Archivo Ordenados_selection.txt creado!...");					
				
			//codigo Gerardo
			RadixSort radi = new RadixSort();
			radi.radixSort(intArray);
			GetRandom nuevo = new GetRandom();
			String nombre="Ordenados_Radix.txt";
			nuevo.crearTxtn(intArray,nombre);
			System.out.println("   *Archivo Ordenados_Radix.txt creado!...");	
			
			//codigo Giovanni/salvador
			InsertionSort inse= new InsertionSort();
			inse.insertionSort(intArray);
			GetRandom nuevoii = new GetRandom();
			String nombreii="Ordenados_Insertion.txt";
			nuevoii.crearTxtn(intArray,nombreii);
			System.out.println("   *Archivo Ordenados_Insertion.txt creado!...");	
			
			System.out.println("Se han creado archivos.txt con los elementos del arraglo ordenados");
			System.out.println("   *Elementos generados satisfactoriamente en la direccion de raiz de clases\n    saliendo a consola.....");
		
		
				
		}
		catch(Exception e)
		{
			System.err.println("error durante escritura/creacion de .txt/array" + e.getMessage());
		}
				
	}
}
