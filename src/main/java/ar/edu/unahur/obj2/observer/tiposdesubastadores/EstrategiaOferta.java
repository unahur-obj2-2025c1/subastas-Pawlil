package ar.edu.unahur.obj2.observer.tiposdesubastadores;

import ar.edu.unahur.obj2.observer.Oferta;
import ar.edu.unahur.obj2.observer.observadores.Subastador;

public interface EstrategiaOferta {

    Oferta crearOferta(Subastador subastador);
}





