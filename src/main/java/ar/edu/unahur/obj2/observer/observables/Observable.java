package ar.edu.unahur.obj2.observer.observables;

public interface Observable  {
    void agregarObservador(Observer observer);

    void eliminarObservador(Observer observer);

    void notificarObservadores();

}
