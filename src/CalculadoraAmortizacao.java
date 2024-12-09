import java.util.ArrayList;
import java.util.List;

class CalculadoraAmortizacao {

    public List<LinhaPlanilha> calcular(double emprestimo, double taxaAnual, int numeroParcelas) {
        List<LinhaPlanilha> planilha = new ArrayList<>();

        double taxaMensal = taxaAnual / 12 / 100;
        double parcelaFixa = (emprestimo * taxaMensal) / (1 - Math.pow(1 + taxaMensal, -numeroParcelas));
        double saldoDevedor = emprestimo;

        for (int i = 1; i <= numeroParcelas; i++) {
            double juros = saldoDevedor * taxaMensal;
            double amortizacao = parcelaFixa - juros;
            double saldoFinal = saldoDevedor - amortizacao;

            planilha.add(new LinhaPlanilha(i, saldoDevedor, juros, amortizacao, saldoFinal));
            saldoDevedor = saldoFinal;
        }

        return planilha;
    }
}