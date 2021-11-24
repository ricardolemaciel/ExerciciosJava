package Aula01;

import javax.swing.*;

public class Exercicio02 {
    public static void main(String[] args) {

        Float Al, D1, D2;

        D1 = Float.valueOf(JOptionPane.showInputDialog(null,"Digite um numero","Exercicio 02",3));
        D2 = Float.valueOf(JOptionPane.showInputDialog(null,"Digite outro numero","Exercicio 02",3));

        Al = (D1 * D2) / 2;

        JOptionPane.showMessageDialog (
                null, "A área do Losango é de "+ Al, "Exercicio 02 - Resultado",
                JOptionPane.PLAIN_MESSAGE);

    }
}
