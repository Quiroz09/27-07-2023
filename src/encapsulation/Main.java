package encapsulation;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName(JOptionPane.showInputDialog("Ingre el nombre"));
        System.out.println(person.getName());
        person.setAge(Integer.parseInt(JOptionPane.showInputDialog(("ingrese su edad"))));
        System.out.println(person.getAge());
    }
}
