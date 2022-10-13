package modelo;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Modelo {
    public static void main(String[] args) {
        
        // Declaración de variables
        final int SALARIO_MINIMO = 1000000;
        final int NUM_EMPLEADOS = 10;
        int[] empleados = new int[NUM_EMPLEADOS];
        int[] ventas;
        int numeroVentas;
        double gananciaEmpleado = 0;
        int sumaDeLasVentas = 0;

        // Input
        numeroVentas = Integer.parseInt(JOptionPane.showInputDialog("Por favor digite el numero de ventas que realizó el empleado"));
        ventas = new int[numeroVentas];


        // Processing
        for(int i = 0; i < ventas.length; i++){
            ventas[i] = Integer.parseInt(JOptionPane.showInputDialog("Por favor digite el precio del carro "+(i+1)));
            gananciaEmpleado = ((SALARIO_MINIMO + (numeroVentas * 100000)) + (ventas[i] * 0.02));
        }

        // Output
        // String salidaGananciaEmpleado = "La ganancia total del empleado es: ";
        JOptionPane.showMessageDialog(null, "La ganancia total del empleado es: "+ gananciaEmpleado);
    }
}