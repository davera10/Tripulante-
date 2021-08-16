package view;

import model.Curso;

public class Vista {
    
    public static void main(String[] args) {
        Curso cursoFrances = new Curso(52441, "Frances 101", 'N');
        Curso cursoItaliano = new Curso(52442, "Italiano 102", 'D' );
        System.out.println(cursoFrances.getCodigo());
        System.out.println(cursoFrances.getNombre());
        System.out.println(cursoFrances.getJornada());
        System.out.println(cursoItaliano.getNombre());
        cursoFrances.setNombre("hola");
        System.out.println(cursoFrances.getNombre());
        System.out.println(cursoItaliano.getNombre());

    }
}
