import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
/**
 * 
 */

/**
 * @author 
 *
 */
public class Random {

	/**
	 * 
	 */
	public Random() {
		// TODO Auto-generated constructor stub
	}

	  public int getRandom()
	  {
		  int numero=1;
          Random random = new Random();
          //numero = random.nextInt(10);
	      return numero;
	  }
	  public void crearTxt(int num)
	  {
		  File out = new File("file.txt");
	        FileWriter fw = null;
	        int cont = 3000;
	        try {
	            fw = new FileWriter(out);
	            BufferedWriter writer = new BufferedWriter(fw);
	            while (cont > 0) {
	                writer.write(num);
	                cont--;
	            }
	            writer.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	            System.exit(0);
	        }
		  
	  }
}
