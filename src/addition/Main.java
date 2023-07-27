package addition;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Addition suma = new Addition();
        suma.setNumber1(Integer.parseInt((JOptionPane.showInputDialog("ingrese el primer numero"))));
        suma.setNumber2(Integer.parseInt(JOptionPane.showInputDialog("ingrese el segundo numero")));
        JOptionPane.showMessageDialog(null,"la suma es:"+suma.Addition());
    }
}
