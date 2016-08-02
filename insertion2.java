// salvador Recinos 15001
//metodo insertion 
// tutorialspoint.com ( ayuda con el codigo)
public class InsertionSort {
    
    
    public static int[] insertionSort(int[] intarray) {
        // entra como parametro nuestra lista de numeros 
       
        for (int izquierda = 1; izquierda < intarray.length; i++) {
            // condicion para cambiar de posicion 
            int siguiente = intarray[izquierda];
          
            int d = izquierda;
            while (d > 0 && intarray[d - 1] >siguiente) {
                // ciclo para que se ordenen los numeros 
                intarray[d] = intarray[d - 1];
                d--;
            }
            intarray[d] = siguiente;
        }
        return intarray;
    }
}