package eng_facade;

public class Combo {
	private Burger burger, burger1 = new Burger();
	private Sobremesa sobremesa, sobremesa1 = new Sobremesa();
	private Bebida bebida, bebida1 = new Bebida();

	public void CriarCombo(int x) {
		if (x == 1) {
			burger.getPreco();
			burger.Montar();
			sobremesa.getPreco();
			sobremesa.Montar();
			bebida.getPreco();
			bebida.Encher();
		} else {
			if (x == 2) {
				burger1.getPreco();
				burger1.Montar();
				sobremesa1.getPreco();
				sobremesa1.Montar();
				bebida1.getPreco();
				bebida1.Encher();
			}
		}

	}

	public void MostrarCombos() {
		System.out.println(
				"Combo Master\n " + "Coca-Cola\n" + "Sundae\n" + "Super Burger\n" + "Batata Frita c/cheddar\n");
		System.out.println("Super Combo\n " + "Sprite\n" + "Churrinhos\n" + "Burger\n" + "Batata Frita");
	}
}
