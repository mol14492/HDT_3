public class InsertionSort{

	public void OrdernarInsertion(int[] array){

	int a,cont1,cont2;

	for(cont1=;cont1<array.length;cont1++){
		a= intarray[cont1];

		for(cont2=cont1-1;cont2>=0 && array[cont2]>a;cont2--)
		{
			array[cont2+1]= array[cont2;
			array[cont2]=a;
	
		}	
	}
	}
