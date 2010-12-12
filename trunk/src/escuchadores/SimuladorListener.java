package escuchadores;

import java.util.Vector;
import modelo.*;

public interface SimuladorListener {
    public void PedirRecursos(Simulador simulador);
    public void RecibirRecursos(Simulador simulador,Vector<Recurso>rs);
}
