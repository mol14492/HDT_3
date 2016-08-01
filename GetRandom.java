import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;


/**
 * guardarArray
 */

/**
 * @author Gera/Bautista
 *
 */
public class GetRandom implements I_random 
{

	/**
	 * Metodo constructor
	 */
	public GetRandom() {
		// TODO Auto-generated constructor stub
	}
	// Se genera el numero random.
	@Override 
	public int getRandom()
	  {
		  int numero;
          Random random = new Random();
          numero = random.nextInt(10);// numero random menor que 10
	      return numero;// regresa un entero.
	  }
	//Crea Archivo de texto
	@Override
	  public void crearTxt()
	  {
		  GetRandom numeroR = new GetRandom();//crea numeroR de tipo GetRandom.
			
		  File out = new File("file.txt");//Se crea archivo de texto.
	        FileWriter fw = null;
	        int cont = 3000;//contador 3000
	        try 
			{
	            fw = new FileWriter(out);
	            BufferedWriter writer = new BufferedWriter(fw);// Buffer para escribir en el archivo
	            while (cont > 0) 
				{
					int intR = numeroR.getRandom();//genera numero random
					String linea = Integer.toString(intR);//numero random a String
	                writer.write(linea);//escribe el numero en el archivo
	                writer.newLine();//crea una nueva linea por debajo
	                cont--;//resta uno al contador
	            }
	            writer.close();//se cierra el archivo.
	        } 
			catch (IOException e) 
			{
	            e.printStackTrace();
	            System.exit(0);
	        }
	  }
	public String[] guardarArray()
	{

		    String token1 = "";
		    Scanner file1=null;
			try 
			{
			file1 = new Scanner(new File("file.txt")).useDelimiter(",\\s*");// se abre el archivo
			} 
			catch (FileNotFoundException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    List<String> temps = new ArrayList<String>();// se crea un arraylist
		    while (file1.hasNext()) //mientras haya algoq que leer.
			{

		      token1 = file1.next(); //el token apunta al primer numero
		      temps.add(token1);// se agrega la lista el numero 
		    }
		    file1.close();// se cierra el archivo.

		    String[] tempsArray = temps.toArray(new String[0]); //se crea un array de la lista temps

		    for (String s : tempsArray) 
			{
		     //System.out.println(s);
		     
		    }
			return tempsArray;// regresa el array de strings con los numeros. 
		  }
		  
		   public void crearTxtn(int[] a, String nombre)
	  {	
		 try
		 {
		     PrintWriter pr = new PrintWriter(nombre);    

		     for (int i=0; i<3000 ; i++)
		     {
		         pr.println(a[i]);
		     }
		     pr.close();
		 }
		 catch (Exception e)
		 {
		     e.printStackTrace();
		     System.out.println("No existe el archivo.");
		 }
		 
	  }
	  }

