import javax.swing.JOptionPane;

public class GeradorTabuada {
    public static void main(String[] args) {
        String numStr = JOptionPane.showInputDialog("Digite um número:");
        int n = Integer.parseInt(numStr.replace(",", "."));

        String resultado = "";

        for (int i = 1; i <= 10; i++) {
            resultado += n + " x " + i + " = " + (n * i) + "\n";
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
}
