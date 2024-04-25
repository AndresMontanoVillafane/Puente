package es.babel.Modelos;

import java.util.List;

public class Puente {

    List<Coche> cochesEnCirculacion;
    double pesoTotal;

    public Puente() {}

    public Puente(List<Coche> cochesEnCirculacion, double pesoTotal) {
        this.cochesEnCirculacion = cochesEnCirculacion;
        this.pesoTotal = pesoTotal;
    }

    public List<Coche> getCochesEnCirculacion() {
        return cochesEnCirculacion;
    }

    public void setCochesEnCirculacion(List<Coche> cochesEnCirculacion) {
        this.cochesEnCirculacion = cochesEnCirculacion;
    }

    public double getPesoTotal() {
        return pesoTotal;
    }

    public void setPesoTotal(double pesoTotal) {
        this.pesoTotal = pesoTotal;
    }



}
