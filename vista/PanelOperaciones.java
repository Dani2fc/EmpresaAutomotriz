package vista;

import java.awt.Color;
import java.awt.Font;
import static java.awt.Font.BOLD;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelOperaciones extends JPanel {
    // ----------------------
    // Atributos
    // ----------------------
    public JButton btSueldo;
    public JButton btBorrar;

    // ----------------------
    // Metodos
    // ----------------------

    // Constructor
    public PanelOperaciones() {
        // Definicion del contenedor del panel
        setLayout(null);
        setBackground(Color.pink);

        // Creación y adicion de los botones
        btSueldo = new JButton("Sueldo");
        btSueldo.setFont(new Font("Arial", BOLD, 12));
        btSueldo.setBounds(10, 20, 90, 20);
        add(btSueldo);
        btSueldo.setActionCommand("Sueldo");

        btBorrar = new JButton("Borrar");
        btBorrar.setBounds(120, 20, 90, 20);
        this.add(btBorrar);
        btBorrar.setActionCommand("borrar");

        // Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Operaciones");
        borde.setTitleColor(Color.gray);
        setBorder(borde);
    }

    public void agregarOyentesBotones(ActionListener pAL) {
        btSueldo.addActionListener(pAL);
        btBorrar.addActionListener(pAL);

    }

}