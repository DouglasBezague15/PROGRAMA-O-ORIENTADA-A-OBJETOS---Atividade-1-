import javax.swing.JOptionPane;

public class CalculadoraAposentadoria {
    public static void main(String[] args) {
        // Entradas (sexo: M/F)
        String sexoStr = JOptionPane.showInputDialog("Sexo (M/F):");
        String idadeStr = JOptionPane.showInputDialog("Idade:");
        String contribStr = JOptionPane.showInputDialog("Anos de contribuição:");

        // Normaliza e converte
        char sexo = sexoStr.trim().toUpperCase().charAt(0);
        int idade = Integer.parseInt(idadeStr.replace(",", ".").split("\\.")[0]);
        int contrib = Integer.parseInt(contribStr.replace(",", ".").split("\\.")[0]);

        // Regras didáticas
        int idadeMin = (sexo == 'F') ? 60 : 65;
        int contribMin = (sexo == 'F') ? 30 : 35;

        boolean porIdade = idade >= idadeMin;
        boolean porContrib = contrib >= contribMin;

        String msg;
        if (porIdade || porContrib) {
            msg = "Já pode se aposentar.";
        } else {
            int faltaIdade = Math.max(0, idadeMin - idade);
            int faltaContrib = Math.max(0, contribMin - contrib);
            int menor = Math.min(faltaIdade, faltaContrib);
            String crit = (menor == faltaIdade) ? "idade" : "contribuição";
            msg = String.format(
                "Ainda não pode se aposentar.%nFaltam %d anos (%s).", menor, crit
            );
        }

        // Saída
        String resumo = String.format(
            "Sexo: %s%nIdade: %d%nContribuição: %d%nIdade mín.: %d%nContrib. mín.: %d%n%n%s",
            (sexo == 'F' ? "Feminino" : "Masculino"),
            idade, contrib, idadeMin, contribMin, msg
        );
        JOptionPane.showMessageDialog(null, resumo);
    }
}
