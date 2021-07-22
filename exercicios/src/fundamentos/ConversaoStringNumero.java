package fundamentos;

import javax.swing.*;

public class ConversaoStringNumero {
    public static void main(String[] args) {
        String valor1 = JOptionPane.showInputDialog(
                "Digite o primeiro número");
        String valor2 = JOptionPane.showInputDialog(
                "Digite o segundo número");

        double soma = Double.parseDouble(valor1) + Double.parseDouble(valor2);

        JOptionPane.showConfirmDialog(null, soma,"Soma", JOptionPane.YES_NO_OPTION);
    }
}
