// salvador Recinos 15001
//metodo insertion 
// tutorialspoint.com ( ayuda con el codigo)
public class InsertionSort {
    
    
    public static int[] insertionSort(int[] array) {
        // entra como parametro nuestra lista de numeros 
       
        for (int izquierda = 1; izquierda < array.length; i++) {
            // condicion para cambiar de posicion 
            int siguiente = array[izquierda];
          
            int d = izquierda;
            while (d > 0 && array[d - 1] >siguiente) {
                // ciclo para que se ordenen los numeros 
                array[d] = array[d - 1];
                d--;
            }
            array[d] = siguiente;
        }
        return array;
    }
}