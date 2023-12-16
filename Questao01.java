import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o valor do seu empréstimo: ");
        double valorEmprestimo = input.nextDouble();
        System.out.println("Informe o valor do juros: ");
        double taxaJuros = input.nextDouble();
        System.out.println("Informe o tempo para o pagamento: ");
        int tempoPagamento = input.nextInt();

        double amortizacao = valorEmprestimo / tempoPagamento;
        double saldoDevedorAtual = valorEmprestimo;
        double totalAmortizacao = 0;
        double totalPrestacaoPago = 0;
        double totalJurosPago = 0;

        System.out.printf("Valor fixo da amortização: R$ %.2f, Saldo devedor total R$ %.2f com um juros de %.2f%%  ao mês\n", amortizacao, saldoDevedorAtual, taxaJuros);

        for (int i = 1; i <= tempoPagamento; i++) {
            double jurosMensal = saldoDevedorAtual * (taxaJuros / 100);
            double parcelaMensal = jurosMensal + amortizacao;
            saldoDevedorAtual -= amortizacao;

            System.out.printf("Parcela %d | Juros R$ %.2f, Amortização R$ %.2f, Saldo devedor R$ %.2f\n", i, jurosMensal, amortizacao, saldoDevedorAtual);

            totalPrestacaoPago += parcelaMensal;
            totalJurosPago += jurosMensal;
            totalAmortizacao += amortizacao;
        }
        System.out.printf("Total: Prestação R$ %.2f, Juros R$ %.2f, Amortização R$ %.2f\n", totalPrestacaoPago, totalJurosPago, totalAmortizacao);

        input.close();
    }
}
