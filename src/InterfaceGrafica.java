import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

class InterfaceGrafica {

    private CalculadoraAmortizacao calculadora;

    public InterfaceGrafica(CalculadoraAmortizacao calculadora) {
        this.calculadora = calculadora;
    }

    public void exibir(double emprestimo, double taxaAnual, int numeroParcelas) {
        List<LinhaPlanilha> planilha = calculadora.calcular(emprestimo, taxaAnual, numeroParcelas);

        JFrame frame = new JFrame("Planilha de Amortização");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 400);
        frame.setLayout(new BorderLayout());

        DefaultTableModel modeloTabela = new DefaultTableModel();
        modeloTabela.addColumn("Parcela");
        modeloTabela.addColumn("Saldo Inicial");
        modeloTabela.addColumn("Juros");
        modeloTabela.addColumn("Amortização");
        modeloTabela.addColumn("Saldo Final");

        for (LinhaPlanilha linha : planilha) {
            modeloTabela.addRow(linha.toTableRow());
        }

        JTable tabela = new JTable(modeloTabela);
        JScrollPane scrollPane = new JScrollPane(tabela);

        frame.add(scrollPane, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
