import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intR;
		Scanner scan = new Scanner( System.in );
        
        
			GetRandom escribir = new GetRandom();
			escribir.crearTxt();// se crea archivo con 3000 numeros random.
			GetRandom array = new GetRandom(); 
			String [] arr=array.guardarArray();//se crea el array con los numeros del archivo 
				
			int numeros[]={0,1,2};//aarray de ints solo para que no de error, esto no es parte del programa es oslo para probar.
					;
			// Sort, se llama al radixsort y al array para compararlos y ordenarlos
			RadixSort comp= new RadixSort();
			
		        for (i = 0; i < n; i++)
		            arre[i] = scan.nextInt();// se recorre un array de tipo int, nosostros tenemos uno de tipo string
		        /** Call method sort **/
		        comp.radixSort(arre);// se llama un array de tipo int, nosostros tenemos uno de tipo string
		        /** Print sorted Array **/
		        System.out.println("\nElements after sorting ");
		        for (i = 0; i < n; i++)
		            System.out.print(arre[i]+" ");// imprime array de tipo int, nosostros tenemos uno de tipo string
		        System.out.println();
	}
}
