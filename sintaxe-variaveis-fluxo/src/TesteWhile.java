import javax.swing.plaf.synth.SynthOptionPaneUI;

public class TesteWhile {
	public static void main(String[] args) {
		int contador = 0;

		while (contador <= 10) {
			System.out.println(contador);
			//contador =+1; é a mesma coisa que contado++;
			contador ++;
		}
		System.out.println(contador);
	}
}
