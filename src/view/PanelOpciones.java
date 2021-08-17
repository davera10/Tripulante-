package view;

import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;

public class PanelOpciones extends JPanel implements ActionListener {

    public final static String OPCION_1="Ver mejor promedio";

    // creamos la relacion
    private JButton opcion1;
    private Vista vistaPrincipal;

    public PanelOpciones(Vista v) {
        super();

        setLayout(new GridLayout(1, 3));

        vistaPrincipal = v;
        
        // inicializar el boton 
        opcion1 = new JButton(OPCION_1);
       
        //Modificar las propiedades del boton (se agregan acciones al boton)
        opcion1.setActionCommand(OPCION_1);
        opcion1.addActionListener(this);

        //Agregar
        add(opcion1); 

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getActionCommand().equals(OPCION_1)){
          System.out.println("hola");
        }


        
    }
}
