package ar.edu.unahur.obj2.observer.observadores;
import ar.edu.unahur.obj2.observer.Oferta;
import ar.edu.unahur.obj2.observer.observables.EstadoANotificar;
import ar.edu.unahur.obj2.observer.observables.Observer;
import ar.edu.unahur.obj2.observer.tiposdesubastadores.EstrategiaOferta;

public class Subastador implements Observer {
    private final String nombreUsuario;
    private Oferta ultimaOfertaRecibida;
    private EstrategiaOferta estrategia;

    public Subastador(String nombreUsuario, EstrategiaOferta estrategia) {
        this.nombreUsuario = nombreUsuario;
        this.estrategia = estrategia;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setUltimaOfertaRecibida(Oferta oferta) {
        this.ultimaOfertaRecibida = oferta;
    }

    public Oferta getUltimaOfertaRecibida() {
        return ultimaOfertaRecibida;
    }

    public Oferta crearOferta() {
        return estrategia.crearOferta(this);
    }

    @Override
    public void actualizar(EstadoANotificar estado) {
        System.out.println(nombreUsuario + " recibió notificación: " + estado.getMensaje());
    }

    public EstrategiaOferta getEstrategia() {
        return estrategia;
    }

    public void resetearOferta() {
        ultimaOfertaRecibida = null;
    }
}
