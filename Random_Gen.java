import java.io.*;
import java.util.Random;


public class Random_Gen{


  public int generarNumero()
  {
      Random numeroR = new Random();

      int intR = numeroR.nextInt(10);
      return intR;
  }

  public void crearTxt(string nombre)
  {
    try
    {
     File nota = new File (nombre);
     BufferedWriter bE  = new BufferedWriter(new FileWriter(nombre));
     if (nota.exists())
			{
    		for (int i=0; i<3000;i++)
    		{
    		  String sNumero=Integer.toString(generarNumero);
    		  bE.write(sNumero);
    		}	
    		bE.close();
			}
    }
    catch (Exception e)
    { 
              System.err.println("error de tipo:" + e.getMessage());
    }
    
    
  }


  public int getRandom()
  {
    return intR;
  }

  }
