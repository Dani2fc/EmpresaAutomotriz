package vista;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntradaDatos extends JPanel {
    // Atributos
    private JLabel lbImagen;
    private ImageIcon iImagen;
    private JLabel lNombre;
    private JLabel lAutos;
    private JTextField tfNombre;
    private JTextField tfAutos;

    // Métodos

    /* Método Constructor */

    public PanelEntradaDatos() {
        // Definicion del contenedor del panel
        setLayout(null);
        setBackground(Color.pink);

        // Creación y adicion de la imagen
        iImagen = new ImageIcon(getClass().getResource("/vista/vendedor.png"));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(10, 20, 158, 158);
        this.add(lbImagen);

        // Crear y agregar etiquetas, campos de texto
        lNombre = new JLabel("Nombre del vendedor =");
        lNombre.setBounds(175, 40, 150, 20);
        this.add(lNombre);

        tfNombre = new JTextField();
        tfNombre.setBounds(310, 40, 150, 20);
        this.add(tfNombre);

        lAutos = new JLabel("Autos vendidos =");
        lAutos.setBounds(175, 70, 150, 20);
        this.add(lAutos);

        tfAutos = new JTextField();
        tfAutos.setBounds(280, 70, 100, 20);
        this.add(tfAutos);

        // Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Datos de entrada");
        borde.setTitleColor(Color.gray);
        setBorder(borde);
    }

    // Metodos de acceso a la información de las cajas de texto
    public String getNombre() {
        return tfNombre.getText();
    }

    public String getAutos() {
        return tfAutos.getText();
    }

    // Metodo para borrar cajas de texto
    public void borrar() {
        tfNombre.setText("");
        tfAutos.setText("");
    }
}