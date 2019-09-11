import java.util.Scanner;

public class Exampel02_02 {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		
		System.out.print("skriv namn : ");
		
		String namn=input.nextLine();
		
		System.out.println("Hej " + namn);
		System.out.println("skriv ålder : ");
		int ålder = input.nextInt();
		
		System.out.println("Skriv din längd : ");
		double längd = input.nextDouble();
		
		System.out.println(namn+ " är "+ålder+" år gammal och har en "+längd+" m lång schlong!(Slak)");
		
		System.out.println("Mäktigt!");
	}

}
