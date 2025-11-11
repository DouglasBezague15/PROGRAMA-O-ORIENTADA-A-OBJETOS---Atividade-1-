import javax.swing.JOptionPane;

public class CircuitoResistencias {
    public static void main(String[] args) {
        // Entradas (aceita vírgula trocando por ponto)
        double r1 = Double.parseDouble(JOptionPane.showInputDialog("Resistência 1 (Ω):").replace(",", "."));
        double r2 = Double.parseDouble(JOptionPane.showInputDialog("Resistência 2 (Ω):").replace(",", "."));
        double r3 = Double.parseDouble(JOptionPane.showInputDialog("Resistência 3 (Ω):").replace(",", "."));
        double r4 = Double.parseDouble(JOptionPane.showInputDialog("Resistência 4 (Ω):").replace(",", "."));

        // Cálculos
        double req = r1 + r2 + r3 + r4;                // série = soma
        double maior = Math.max(Math.max(r1, r2), Math.max(r3, r4));
        double menor = Math.min(Math.min(r1, r2), Math.min(r3, r4));

        // Saída
        String msg = String.format(
            "Req (série): %.2f Ω%nMaior resistência: %.2f Ω%nMenor resistência: %.2f Ω",
            req, maior, menor
        );
        JOptionPane.showMessageDialog(null, msg);
    }
}
