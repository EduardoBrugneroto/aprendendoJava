
public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("testando condicionais");

		int idade = 14;
		int estaAcompanhado = 0;
		if (idade >= 18) {
			System.out.println("voc� tem mais de 18 anos");
		} else {
			if(estaAcompanhado >= 1){
				System.out.println("n�o � maior de idade, mas est� acompanhado");
				
			}else {
			System.out.println("voc� � menor de idade");
			}
			
		}
			
	}
}
