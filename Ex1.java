package QuestoesTreino;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em celcius: ");
		float c = s.nextFloat();
		
		float f = (float) ((float)c * 1.8 + 32);
		float k = (float) (c + 273.15);
		float re = (float) (c * 0.8);
		float ra = (float)((float)c * 1.8 + 32 + 459.67);
		
		System.out.println("temperatura em celcius " + c);
		System.out.println("temperatura em fahrenheit " + f);
		System.out.println("temperatura em kelvin " + k);
		System.out.println("temperatura em reaumur " + re);
		System.out.println("temperatura em rankine " + ra);
	}

}
