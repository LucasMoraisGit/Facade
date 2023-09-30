package eng_facade;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Combo combo = new Combo(); 
		 combo.MostrarCombos();
		System.out.println("\nSelecione seu compo"); 
        System.out.println("1. Combo Master"); 
        System.out.println("2. Super Combo"); 
        System.out.print("Sua escolha: "); 
 
        Scanner input = new Scanner(System.in); 
 
        int tipo = input.nextInt(); 
        combo.CriarCombo(tipo); 
        System.out.println(combo); 
        
        input.close();
	}

}
