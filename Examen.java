public class Examen {

	public static long numDigitos(long num) {
		long ndig = 1;
		if (num == 0) {
			System.out.println("El 0 no cuenta como número de dígitos: valor = 0");
			return 0;
		}
		
		else if (num < 0) {
			return -1;
		}
		
		else {
			while (num > 10) {
				System.out.println("Aquí estamos");
				ndig++;
				num /= 10;
			}
		}
		return ndig;
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(numDigitos(20));

	}

}
