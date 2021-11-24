package Aula01;

import javax.swing.*;

public class Exercicio04 {
    public static void main(String[] args) {

        Float b, c, a, delta;
        double x1, x2;

        a = Float.valueOf(JOptionPane.showInputDialog(null,"Digite um numero","Exercicio 04",3));
        b = Float.valueOf(JOptionPane.showInputDialog(null,"Digite outro numero","Exercicio 04",3));
        c = Float.valueOf(JOptionPane.showInputDialog(null,"Digite mais um numero","Exercicio 04",3));

        delta = b * b - 4 * a * c;

        x1 = (-b + Math.sqrt(delta)) / (2 * a);
        x2 = (-b - Math.sqrt(delta)) / (2 * a);


        System.out.printf("As raízes são %.0f e %.0f",x1,x2);
        JOptionPane.showMessageDialog (
                null, "As raízes são " + x1 + " e "+ x2, "Exercicio 04 - Resultado",
                JOptionPane.PLAIN_MESSAGE);
    }
}
