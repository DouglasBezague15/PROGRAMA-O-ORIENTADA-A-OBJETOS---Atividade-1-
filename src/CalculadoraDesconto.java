import java.util.Scanner;

public class CalculadoraDesconto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Informe o preço do produto: ");
        double preco = sc.nextDouble();

        System.out.print("Informe a porcentagem de desconto (%): ");
        double porcentagem = sc.nextDouble();

        // Cálculos
        double valorDesconto = preco * (porcentagem / 100);
        double precoFinal = preco - valorDesconto;

        // Saída
        System.out.printf("Valor do desconto: R$ %.2f%n", valorDesconto);
        System.out.printf("Preço final do produto: R$ %.2f%n", precoFinal);

        sc.close();
    }
}
