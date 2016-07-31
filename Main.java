import java.util.Scanner;
import java.io.*;

public class main {

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
					//System.out.print(intArray[i]);
					//System.out.println("----- >"+ i);
					}
				}
			//catch par errores durante el proceso
			catch(Exception e)
				{
			
				System.err.println("error durante escritura/creacion de .txt/array" + e.getMessage());
			
				}
				
	}
}
