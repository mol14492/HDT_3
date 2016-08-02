//codigo radixSort basado en: 
//codigofacilito.(27 marzo de 2012). Ordenamiento por Inserción (Insertion Sort) en Java [Archivo de video]. Recuperado de
//https://www.youtube.com/watch?v=O4iuk9VhqYs


public class InsertionSort {
	//Metodo InsertionSort *Java
	public void insertionSort (int [] myArray){
		
		//Variables autilizar:
		int auxiliar, contador1, contador2;
		//Primer ciclo que sirve para recorrer el tamamaño del arreglo de izquierda a derecha y guarda en una variable axiliar 
		//el valor del arreglo en la posicion n
		for(contador1 = 1; contador1 < myArray.length;contador1++){
			auxiliar = myArray[contador1];
			//Ciclo que sirve para intercambiar las posiciones de cada uno de los contenidos del arreglo de acuerdo al valor de
			//cada numero
			for(contador2 = contador1 - 1; contador2 > 0 && myArray[contador2] > auxiliar; contador2--){
				myArray[contador2 + 1] = myArray[contador2];
				myArray[contador2] = auxiliar;
			}
		}
	}	
}