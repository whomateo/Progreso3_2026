import java.util.LinkedList;
import java.util.Queue;

public class SistemaTurnosSoporte {

    private Queue<String> cola;
    private static final int CAPACIDAD_MAXIMA = 10;

    public SistemaTurnosSoporte() {
        cola=new LinkedList<>();

    }

    public boolean registrarTurno(String codigo, String problema) {
        return true;
    }

    public String verSiguienteTurno() {
        return "";

    }

    public String atenderSiguienteTurno() {
        return "";
    }

    public int obtenerCantidadTurnos() {
        return cola.size();
    }

    public int obtenerEspaciosDisponibles() {
        return 0;
    }

    public String mostrarCola() {
        return cola.size()==0? "Cola vacia":"Muestra todos los datos";
    }
}
