package ar.edu.unahur.obj2.observer.tiposdesubastadores;
import ar.edu.unahur.obj2.observer.Oferta;
import ar.edu.unahur.obj2.observer.observadores.Subastador;

public class Arriesgado implements EstrategiaOferta {

    @Override
    public Oferta crearOferta(Subastador subastador) {
        double nuevoValor = subastador.getUltimaOfertaRecibida() == null ? 10 : subastador.getUltimaOfertaRecibida().getValorOfertado() + 10;
        return new Oferta(subastador, nuevoValor);
    }
}
