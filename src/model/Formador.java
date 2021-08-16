package model;

public class Formador {

    private String nombre;
    private int codigo;

   

    public Formador(String nombre, int codigo){
        super();
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public Formador() {
        super();
        this.codigo= 0;
        this.nombre = "Jon Due";
    }
    public int getCodigo() {
        return codigo;
    }
    public String getNombre() {
        return nombre;
    }
}
