import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

class LinhaPlanilha {
    int parcela;
    double saldoInicial;
    double juros;
    double amortizacao;
    double saldoFinal;

    public LinhaPlanilha(int parcela, double saldoInicial, double juros, double amortizacao, double saldoFinal) {
        this.parcela = parcela;
        this.saldoInicial = saldoInicial;
        this.juros = juros;
        this.amortizacao = amortizacao;
        this.saldoFinal = saldoFinal;
    }

    public Object[] toTableRow() {
        return new Object[]{
                parcela,
                String.format("%.2f", saldoInicial),
                String.format("%.2f", juros),
                String.format("%.2f", amortizacao),
                String.format("%.2f", saldoFinal)
        };
    }
}