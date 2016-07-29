
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contador=3000;
		int intR;

		while(contador > 0){
			Random numeroR = new Random();
			intR = numeroR.getRandom();
			Random escribir = new Random();
			escribir.crearTxt(intR);
			contador--;
	}

}
}
