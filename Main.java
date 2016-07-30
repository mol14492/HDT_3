import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intR;
		Scanner scan = new Scanner( System.in );
        
        
			GetRandom escribir = new GetRandom();
			escribir.crearTxt();
			GetRandom array = new GetRandom();
			String [] arr=array.guardarArray();
				
			int numeros[]={0,1,2};
					;
			// Sort
			RadixSort comp= new RadixSort();

		     
			
		        for (i = 0; i < n; i++)
		            arre[i] = scan.nextInt();
		        /** Call method sort **/
		        comp.radixSort(arre);
		        /** Print sorted Array **/
		        System.out.println("\nElements after sorting ");
		        for (i = 0; i < n; i++)
		            System.out.print(arre[i]+" ");
		        System.out.println();
	}
}
