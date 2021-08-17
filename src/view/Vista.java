package view;

import javax.swing.JFrame;

import controller.CursoController;

import java.awt.BorderLayout;

// import model.Curso;
// import model.Formador;

public class Vista extends JFrame{

    //Relaciones 

    private PanelOpciones panelOpc;
    private CursoController CursoController;
    
public Vista() {
    super();
    setSize(600, 400);
    setTitle("Tripulantes");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new BorderLayout());


    CursoController = new CursoController();
    //inicializar
    panelOpc = new PanelOpciones(this);

    //Modificar las propiedades -- por el moemnto no se va a modificar las

    //Agregar las propiedades
    add(panelOpc, BorderLayout.SOUTH);

}

public void addCurso(int pCodigo, String pNombre, char pJornada){

    CursoController.addCurso(pCodigo, pNombre, pJornada);
}

    // public static void main(String[] args) {
    //     Curso cursoFrances = new Curso(52441, "Frances 101", 'N',7400,"Guilla");
    //     Curso cursoItaliano = new Curso(52442, "Italiano 102", 'D',74001,"Vladimir" );

    //     Formador profesor = new Formador("carlitos", 321654);
    //     System.out.println(profesor.getCodigo());

    //     // System.out.println(cursoFrances.getCodigo());
    //     // System.out.println(cursoFrances.getNombre());
    //     // System.out.println(cursoFrances.getJornada());
    //     // System.out.println(cursoItaliano.getNombre());
    //     // // cursoFrances.setNombre("hola");
    //     // // System.out.println(cursoFrances.getNombre());
    //     // // System.out.println(cursoItaliano.getNombre());

    //     System.out.println(cursoFrances.getFormador().getNombre());
    //     System.out.println(cursoItaliano.getFormador().getNombre());
    //     System.out.println(cursoFrances.getFormador().getCodigo());

    // }
}
