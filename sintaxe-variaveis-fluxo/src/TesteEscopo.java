//a variavel s� est� viva at� o final de um escopo
public class TesteEscopo {
    public static void main(String[] args) {
        System.out.println("testando condicionais");
        int idade = 20;
                int quantidadePessoas = 3;
        boolean acompanhado = quantidadePessoas >= 2;

                System.out.println("valor de acompanhado = " + acompanhado);

        if (idade >= 18 && acompanhado) {
            System.out.println("seja bem vindo");
        } else {
            System.out.println("infelizmente voc� n�o pode entrar");
        }
    }
}