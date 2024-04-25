package es.babel.Application;

import es.babel.Modelos.Coche;
import es.babel.Servicios.ICocheServicio;
import org.springframework.stereotype.Component;

import java.util.Random;
import java.util.concurrent.TimeUnit;

@Component
public class PuenteApp {

    private final ICocheServicio cocheServicio;

    public PuenteApp(ICocheServicio cocheServicio) {
        this.cocheServicio = cocheServicio;
    }

    public void run() {

    }

    private int randomizarTiempo(Random random) {
        int retraso = random.nextInt(10);
        try {
            TimeUnit.SECONDS.sleep(retraso);
            //cocheServicio.crearNuevoCoche()
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return retraso;
    }

    /*
    public void agregarCoche(Coche coche) {
        if (cola.size() < CAPACIDAD_MAXIMA && pesoActual + coche.getPeso() <= PESO_MAXIMO) {
            cola.add(coche);
            pesoActual += coche.getPeso();
            System.out.println("Coche agregado al puente");
            System.out.println("Peso actual en el puente: " + pesoActual);
        } else {
            System.out.println("El coche no puede pasar el puente en este momento");
        }
    }

     */
}

