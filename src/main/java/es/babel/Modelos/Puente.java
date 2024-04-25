package es.babel.Modelos;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Puente {
    List<Coche> listaCoches;
    double peso;
}
