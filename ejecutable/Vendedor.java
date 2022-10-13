package ejecutable;

import controlador.Controlador;
import modelo.SueldoVendedor;
import vista.VentanaPrincipal;

public class Vendedor {
    public static void main(String[] args)
    {
        VentanaPrincipal miVentana = new VentanaPrincipal();
        SueldoVendedor miSueldoVendedor = null;
        Controlador miControlador = new Controlador(miVentana,miSueldoVendedor);
    }    
}