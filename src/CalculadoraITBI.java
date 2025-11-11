import javax.swing.JOptionPane;

public class CalculadoraITBI {
    public static void main(String[] args) {
        // Entrada de dados
        String txStr = JOptionPane.showInputDialog("Valor de transação:");
        String venalStr = JOptionPane.showInputDialog("Valor venal:");
        String percStr = JOptionPane.showInputDialog("Percentual do ITBI (%):");

        // Converte texto para número (aceita vírgula trocando por ponto)
        double transacao = Double.parseDouble(txStr.replace(",", "."));
        double venal = Double.parseDouble(venalStr.replace(",", "."));
        double perc = Double.parseDouble(percStr.replace(",", "."));

        // Base é o maior valor entre transação e venal
        double base = Math.max(transacao, venal);

        // Cálculo do imposto
        double itbi = base * (perc / 100.0);

        // Saída
        String msg = String.format(
            "Base de cálculo: R$ %.2f%nITBI devido: R$ %.2f",
            base, itbi
        );
        JOptionPane.showMessageDialog(null, msg);
    }
}
