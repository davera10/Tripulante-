package model;

import java.util.ArrayList;

public class Curso {
    
    public static final int MAXIMO_TRIPULANTES = 4;
    private int codigo;
    private String nombre;
    private char jornada;

    private Formador formador;

    private ArrayList<Tripulante> tripulantes;
   
    public Curso (int pCodigo, String pNombre, char pJornada, int fCodigo, String fnombre) {
        super();
        this.codigo = pCodigo;
        this.nombre = pNombre;
        this.jornada = pJornada;
        formador = new Formador(fnombre, fCodigo);
        tripulantes= new ArrayList<>();
    }

   

    public ArrayList<Tripulante> getTripulantes() {
        return tripulantes;
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

    public Formador getFormador() {
        return formador;
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

    public String agregarTripulante(Tripulante t){

        if (tripulantes.size() == MAXIMO_TRIPULANTES){
           return "No se puede agregar mas de " + MAXIMO_TRIPULANTES +"Tripulantes";
        }   
            tripulantes.add(t);
        return "Tripulante agregado al curso" + nombre;
        
        
    }
    
}
