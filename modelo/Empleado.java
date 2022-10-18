package modelo;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Empleado {
    public static void main(String[] args) {
        
        // Declaración de variables
        final int SALARIO_MINIMO = 1000000;
        int[] ventas;
        int numeroVentas;
        double gananciaEmpleado;
        double gananciaSegunPorcentaje = 0;
        double sumaDeLasVentas = 0;

        // Input
        numeroVentas = Integer.parseInt(JOptionPane.showInputDialog("Por favor digite el numero de ventas que realizó el empleado"));
        ventas = new int[numeroVentas];


        // Processing
        for(int i = 0; i < ventas.length; i++){
            ventas[i] = Integer.parseInt(JOptionPane.showInputDialog("Por favor digite el precio del carro "+(i+1)));
            gananciaEmpleado = SALARIO_MINIMO + (numeroVentas * 100000);
            gananciaSegunPorcentaje = gananciaSegunPorcentaje + (ventas[i]*0.02);
            sumaDeLasVentas = gananciaEmpleado + gananciaSegunPorcentaje;
        }

        // Output
        // String salidaGananciaEmpleado = "La ganancia total del empleado es: ";
        JOptionPane.showMessageDialog(null, "La ganancia total del empleado es: "+ sumaDeLasVentas);
    }
}