package ar.edu.unahur.obj2.observer;
import ar.edu.unahur.obj2.observer.observadores.Subastador;


public  class Oferta   {
    
    private Subastador subastador;
    private double valorOfertado;

    public Oferta(Subastador subastador, double valorOfertado) {
        
    }

    public Subastador getSubastador() {
        return subastador;
    }

    public double getValorOfertado() {
        return valorOfertado;
    }

}
