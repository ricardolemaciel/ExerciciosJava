package Aula01;

import javax.swing.*;

public class Exercicio03 {
    public static void main(String[] args) {

        Float A, B, b, h;

        B = Float.valueOf(JOptionPane.showInputDialog(null,"Digite um numero","Exercicio 03",3));
        b = Float.valueOf(JOptionPane.showInputDialog(null,"Digite outro numero","Exercicio 03",3));
        h = Float.valueOf(JOptionPane.showInputDialog(null,"Digite mais um numero","Exercicio 03",3));
        A = ((B + b) * h) / 2;

        JOptionPane.showMessageDialog (
                null, "A área do trapézio é de " + A, "Exercicio 03 - Resultado",
                JOptionPane.PLAIN_MESSAGE);

    }
}
