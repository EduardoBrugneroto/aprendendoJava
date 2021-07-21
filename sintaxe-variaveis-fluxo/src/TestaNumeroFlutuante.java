
public class TestaNumeroFlutuante {
	public static void main(String[] args) {
		double salario = 1250 * 2.5;;
		System.out.println ("meu salario é " + salario);
		
		double divisao = 3.14 / 2;
		System.out.println ("meu resultado é " + divisao);
					
		//o JAVA usa o numero com uma "range" maior para fazer a divisao dar certo, por isso o "5" tem um ".0"
		double outraDivisao = 5.0 / 2;
		System.out.println (outraDivisao);
	}
}
