//Example program using multiple parameters from text page 149
//Similar program was used - without parameters- in unit 2"practice tracing nested loops"

public class ParameterArtExample {
	public static void main(String[] args){
		writeChars('=', 40);
		System.out.println();
		for (int i = 1; i <= 20; i++){
			writeChars('/', i);
			writeChars('_', 41 - 2 * i);
			writeChars('\\', i);
			System.out.println();
		}
	}
	public static void writeChars (char ch, int number) {
		for (int i = 1; i <= number; i++){
			System.out.print(ch);
		}
	}
}
