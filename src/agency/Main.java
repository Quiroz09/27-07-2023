package agency;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Agency agency = new Agency ();
        agency.setAddress(JOptionPane.showInputDialog("ingrese direccion"));
        agency.setAgentName(JOptionPane.showInputDialog("ingrese el nombre de la agencia"));
        agency.setPrice(Integer.parseInt(JOptionPane.showInputDialog("ingrese el precio")));
        JOptionPane.showMessageDialog(null,"nombre de la agencia "+agency.getAgentName());
    }
}
