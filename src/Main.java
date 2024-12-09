public class Main {
    public static void main(String[] args) {
        double emprestimo = 50000; // Valor do empréstimo
        double taxaAnual = 12; // Taxa de juros anual (12%)
        int numeroParcelas = 24; // Número de parcelas (2 anos)

        CalculadoraAmortizacao calculadora = new CalculadoraAmortizacao();
        InterfaceGrafica interfaceGrafica = new InterfaceGrafica(calculadora);

        interfaceGrafica.exibir(emprestimo, taxaAnual, numeroParcelas);
    }
}