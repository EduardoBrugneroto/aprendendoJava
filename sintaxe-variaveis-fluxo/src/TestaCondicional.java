
public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("testando condicionais");

		int idade = 14;
		int estaAcompanhado = 0;
		if (idade >= 18) {
			System.out.println("você tem mais de 18 anos");
		} else {
			if(estaAcompanhado >= 1){
				System.out.println("não é maior de idade, mas está acompanhado");
				
			}else {
			System.out.println("você é menor de idade");
			}
			
		}
			
	}
}
