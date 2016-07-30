import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
/**
 * 
 */

/**
 * @author Gera
 *
 */
public class GetRandom implements I_random 
{

	/**
	 * 
	 */
	public GetRandom() {
		// TODO Auto-generated constructor stub
	}

	@Override 
	public int getRandom()
	  {
		  int numero;
          Random random = new Random();
          numero = random.nextInt(10);
	      return numero;
	  }
	@Override
	  public void crearTxt()
	  {
		  GetRandom numeroR = new GetRandom();
			
		  File out = new File("file.txt");
	        FileWriter fw = null;
	        int cont = 3000;
	        try {
	            fw = new FileWriter(out);
	            BufferedWriter writer = new BufferedWriter(fw);
	            while (cont > 0) {
					int intR = numeroR.getRandom();
					String linea = Integer.toString(intR);
	                writer.write(linea);
	                writer.newLine();
	                cont--;
	            }
	            writer.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	            System.exit(0);
	        }
	  }
	@Override
	 public void guardarArray(){

		    String token1 = "";
		    Scanner file1=null;
			try {
			file1 = new Scanner(new File("file.txt")).useDelimiter(",\\s*");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    List<String> temps = new ArrayList<String>();
		    while (file1.hasNext()) {

		      token1 = file1.next();
		      temps.add(token1);
		    }
		    file1.close();

		    String[] tempsArray = temps.toArray(new String[0]);

		    for (String s : tempsArray) {
		     //System.out.println(s);
		      
		    }
		  }
		
	  }
