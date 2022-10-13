package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.SueldoVendedor;
import vista.VentanaPrincipal;

public class Controlador implements ActionListener
{
    //Atributos
    private VentanaPrincipal venPrin;
    private SueldoVendedor model;
    //----------------------------
    //Metodos
    //----------------------------
    
    //Constructor
    public Controlador(VentanaPrincipal pVenPrin, SueldoVendedor pModel)
    {
        this.venPrin = pVenPrin;
        this.model = pModel;
        this.venPrin.miPanelOperaciones.agregarOyentesBotones(this);
        
    }

    public void actionPerformed(ActionEvent ae) 
    {
        String comando = ae.getActionCommand();
        
        if(comando.equals("Sueldo"))
        {
            try
            {
                String Nombre = venPrin.miPanelEntradaDatos.getNombre();
                int Autos =Integer.parseInt(venPrin.miPanelEntradaDatos.getAutos());

                model = new SueldoVendedor(Nombre, Autos);
                venPrin.miPanelResultado.mostrarResultado("El nombre del vendedor es: " + model.getNombre());
                venPrin.miPanelResultado.mostrarResultado("Sus autos vendidos son: " + model.getAutos());
                venPrin.miPanelResultado.mostrarResultado("El Salario minimo del vendedor es: " + model.getSALARIOMINIMO());
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Error en datos de entrada", "Error", JOptionPane.ERROR_MESSAGE);
            }   
        }
        if(comando.equals("borrar"))
        {
            this.venPrin.miPanelEntradaDatos.borrar();
            this.venPrin.miPanelResultado.borrar();
        }
        
    }

}