package es.babel.Servicios;

import es.babel.Modelos.Coche;
import org.springframework.stereotype.Service;

@Service
public class CocheServicio {
    public Coche crearNuevoCoche () {
        return new Coche(asignarPeso());
    }

    public double asignarPeso() {
        return Math.random() * (2000 - 800) + 800;
    }
}
