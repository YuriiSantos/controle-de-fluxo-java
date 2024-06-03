import java.util.Scanner;  // Importando a classe Scanner

public class ControleFluxo {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);  // Criando um objeto Scanner para ler a entrada do usuário
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();  // Lendo o primeiro número
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();  // Lendo o segundo número

        try {
            // Chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            // Imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println(exception.getMessage());
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        // Realizar o for para imprimir os números com base na variável contagem
        for (int i = parametroUm; i <= parametroDois; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
