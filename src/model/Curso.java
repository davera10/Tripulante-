package model;

public class Curso {
    
    private int codigo;
    private String nombre;
    private char jornada;

    public Curso (int pCodigo, String pNombre, char pJornada) {
        super();
        this.codigo = pCodigo;
        this.nombre = pNombre;
        this.jornada = pJornada;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public char getJornada() {
        return jornada;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setJornada(char jornada) {
        this.jornada = jornada;
    }

    
}
