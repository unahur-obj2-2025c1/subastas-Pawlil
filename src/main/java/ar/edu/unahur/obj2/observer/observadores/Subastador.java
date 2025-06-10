package ar.edu.unahur.obj2.observer.observadores;
import ar.edu.unahur.obj2.observer.Oferta;
import ar.edu.unahur.obj2.observer.observables.EstadoANotificar;
import ar.edu.unahur.obj2.observer.observables.Observer;


public class Subastador implements Observer  {
    private final String nombre;
    public  double ultimaOferta;
    

    public void nombreDeUsuario(String nombre) {
        System.out.println("Nombre de usuario del subastador: " + nombre);
    }
    public void ultimaOfertaRecibida(double ultimaOferta) {
        System.out.println("Última oferta recibida por el subastador: " + ultimaOferta);
    }

    public Subastador(String nombre, double ultimaOferta) {
        this.nombre = nombre;
        this.ultimaOferta = ultimaOferta;

    }

    public void realizarOferta(Subastador subastador, double valorOfertado){
        Oferta oferta = new Oferta(subastador, valorOfertado);
        System.out.println("Oferta realizada por el subastador: " + oferta);
        this.ultimaOferta = valorOfertado;
        this.nombreDeUsuario(nombre);
        this.ultimaOfertaRecibida(ultimaOferta);

    }

    @Override
    public void actualizar(EstadoANotificar estadoANotificar) {
        System.out.println("Subastador notificado: " + estadoANotificar.getMensaje());
    }

}
