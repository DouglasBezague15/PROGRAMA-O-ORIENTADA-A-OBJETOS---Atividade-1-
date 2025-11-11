import javax.swing.JOptionPane;

public class SistemaAvaliacao {
    public static void main(String[] args) {
        // Entradas
        String p1Str = JOptionPane.showInputDialog("Nota da Prova 1:");
        String p2Str = JOptionPane.showInputDialog("Nota da Prova 2:");
        String trabStr = JOptionPane.showInputDialog("Nota do Trabalho:");

        // Converte para número (aceita vírgula)
        double p1 = Double.parseDouble(p1Str.replace(",", "."));
        double p2 = Double.parseDouble(p2Str.replace(",", "."));
        double trab = Double.parseDouble(trabStr.replace(",", "."));

        // Cálculo
        double media = (p1 + p2 + trab) / 3.0;
        String status = (media >= 6.0) ? "APROVADO" : "REPROVADO";

        // Saída
        String msg = String.format("Média: %.2f%nStatus: %s", media, status);
        JOptionPane.showMessageDialog(null, msg);
    }
}
