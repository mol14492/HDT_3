import java.io.*;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;

public class SelSort
{

public void selecSortP(int [] intArray) 
	{
		
	try
	{
		//metodo Selection Sort (Erick Bautista)
			int direcciontemp=1;//posicion de registro
			int memoria=0; //memoria temporal para hacer el cambio de poaicion de los elemetos del arrays

			File SS = new File ("Ordenados_Selection.txt");
			FileWriter scs = scs = new FileWriter(SS);
			 BufferedWriter escritor = new BufferedWriter(scs);
			
			//ciclo que controla la direccion de todo el array( sirve para llenar el array en orden)
			for(int direccion=0;direccion<3000;direccion++)
			{
				//ciclo que sirve para verificar que elementos son menores a el elementos seleccionado
				for(int lector=direccion;lector<3000;lector++)
				{	
					//condicional que compara elementos del array
					Integer valor1 = intArray[lector];
					int resultado=valor1.compareTo((Integer)intArray[direcciontemp]);
					if (resultado<0)
					//if(intArray[lector]<intArray[direcciontemp])
					{
						direcciontemp=lector;
					}	
				}
				//proceso de cambio de posicion de elementos del array
				memoria=intArray[direccion];
				intArray[direccion]=intArray[direcciontemp];
				intArray[direcciontemp]=memoria;
				
				
				//System.out.print(intArray[direccion]);
			
				if (SS.exists())
				{
					//int numero=0;
					String cadena= Integer.toString(intArray[direccion]);
					escritor.write(cadena);
					escritor.newLine();
				}
					
			}
					escritor.close();
		}
		catch(Exception e)
		{
			System.err.println("error"+ e.getMessage());
		}
	}

}


