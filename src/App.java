import model.Curso;
import model.Tripulante;

public class App {
    public static void main(String[] args) throws Exception {
        
        Curso programacion1 = new Curso(1234, " Fundamentos de programación", 'M', 7400, "dEV 1");
        System.out.println(programacion1.getNombre());
        Tripulante t = new Tripulante();
        t.setNota1(4);
        t.setNota1(4.2);
        t.setNota1(5);
        System.out.println( programacion1.agregarTripulante(t));
        for (Tripulante desarrollador : programacion1.getTripulantes()) {
            System.out.println("La nota mas alta es: "+ desarrollador.getHighNote());
        }
    }
}
