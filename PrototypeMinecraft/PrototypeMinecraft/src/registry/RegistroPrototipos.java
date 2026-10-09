package registry;

import java.util.HashMap;
import java.util.Map;
import prototype.Personaje;

public class RegistroPrototipos {

    private final Map<String, Personaje> prototipos = new HashMap<>();

    public void registrarPrototipo(String clave, Personaje personaje) {
        prototipos.put(clave, personaje);
    }
    public Personaje obtenerCopia(String clave) {
        Personaje base = prototipos.get(clave);
        if (base == null) {
            return null;
        }
        return base.clonar();
    }
    public Personaje consultarPrototipo(String clave) {
        return prototipos.get(clave);
    }
}
