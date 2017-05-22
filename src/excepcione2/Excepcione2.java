package excepcione2;

import javax.swing.JOptionPane;

public class Excepcione2 {

    public static void main(String[] args) {
        try {
            String nombre;
            int edad;
            String categoria = null;
            System.out.println("hola");
            nombre = JOptionPane.showInputDialog("Ingrese su nombre por favor");
            edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad por favor"));

            int decada = edad + 10;
            if (edad >= 0 && edad <= 25) {
                categoria = "A";
            } else if (edad >= 26 && edad <= 50) {
                categoria = "B";
            } else if (edad >= 51) {
                categoria = "C";
            }

            if (edad < 0 || edad>=122) {
                throw new EdadMal();
            }

            System.out.println("Nombre: \n" + nombre + "\nEdad: " + edad + "\nUsuario " + nombre + " de categoría " + categoria
                    + ", en una decada tendrá " + decada + " años");

        } catch (NumberFormatException nfe) {
            System.out.println("\nError de formato numerico: " + nfe.toString());
        } catch (EdadMal em) {
            System.out.println("\n" + em.getMessage());
        } 

    }
}
