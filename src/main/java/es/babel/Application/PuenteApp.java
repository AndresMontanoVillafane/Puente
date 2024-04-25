package es.babel.Application;

import es.babel.Servicios.ICocheServicio;
import org.springframework.stereotype.Component;

@Component
public class PuenteApp{

    private final ICocheServicio cocheServicio;

    public PuenteApp(ICocheServicio cocheServicio) {
        this.cocheServicio = cocheServicio;
    }

    public void run() {

    }

}
