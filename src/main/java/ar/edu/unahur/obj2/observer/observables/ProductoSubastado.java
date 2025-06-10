package ar.edu.unahur.obj2.observer.observables;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import ar.edu.unahur.obj2.observer.Oferta;
import ar.edu.unahur.obj2.observer.observadores.Subastador;



public class ProductoSubastado implements Observable{

    private final Set<Observer> observers = new HashSet<>();
    private final List<Oferta> ofertas = new ArrayList<>();

    public ProductoSubastado() {

        // Constructor vacío, se inicializa la colección de observadores
    }

    @Override
    public void agregarObservador(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void eliminarObservador(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notificarObservadores() {
        observers.forEach(observer -> {
            observer.actualizar(new EstadoANotificar("El producto ha sido subastado"));
        });
    }

     public void agregarOferta(Oferta oferta) {
        Subastador subastador = oferta.getSubastador();
        if (!observers.contains(subastador)) {
            throw new RuntimeException("El subastador no participa en la subasta");
        }
   
        
    }


}
