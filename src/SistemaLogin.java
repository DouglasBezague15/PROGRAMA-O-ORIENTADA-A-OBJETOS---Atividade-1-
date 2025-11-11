import javax.swing.JOptionPane;

public class SistemaLogin {
    public static void main(String[] args) {
        final String USER = "java8";
        final String PASS = "java8";

        for (int tent = 1; tent <= 3; tent++) {
            String u = JOptionPane.showInputDialog("Login:");
            if (u == null) System.exit(0);  // Cancelou

            String p = JOptionPane.showInputDialog("Senha:");
            if (p == null) System.exit(0);  // Cancelou

            if (USER.equals(u) && PASS.equals(p)) {
                JOptionPane.showMessageDialog(null, "Acesso concedido. Bem-vindo!");
                return;
            } else {
                int restantes = 3 - tent;
                String msg = (restantes > 0)
                    ? "Credenciais inválidas. Você tem " + restantes + " tentativa(s) restante(s)."
                    : "Acesso bloqueado. Tente mais tarde.";
                JOptionPane.showMessageDialog(null, msg);
            }
        }
    }
}
