import java.util.Scanner;
import java.io.*;

public class Main {

	//tamaño de array(aunque no lo pude implementar como variable y tire el valor directo)
	int n=3000;
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int intR;
		Scanner scan = new Scanner( System.in );
        
		
			GetRandom escribir = new GetRandom();
			escribir.crearTxt();// se crea archivo con 3000 numeros random.
			GetRandom array = new GetRandom(); 
			
			
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

					}
				
				// Guardar file con radixsort.
				RadixSort radi = new RadixSort();
				radi.radixSort(intArray);
				GetRandom nuevo = new GetRandom();
				String nombre="Ordenados_Radix.txt";
				nuevo.crearTxtn(intArray,nombre);
				
				}
			
			
			//catch par errores durante el proceso
			catch(Exception e)
				{
			
				System.err.println("error durante escritura/creacion de .txt/array" + e.getMessage());
			
				}

				
	}
}
