package ar.edu.unahur.obj2.observer.observables;
import ar.edu.unahur.obj2.observer.observadores.Subastador;


import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class ProductoSubastadoTest {
    @Test
    void testAgregarObservador() {
        ProductoSubastado producto = new ProductoSubastado();
        Subastador subastador = new Subastador();
        producto.agregarObservador(subastador);
        assertTrue(producto.getObservadores().contains(subastador));
    }

    @Test
    void testEliminarObservador() {
        ProductoSubastado producto = new ProductoSubastado();
        Subastador subastador = new Subastador("Juan");
        producto.agregarObservador(subastador);
        producto.eliminarObservador(subastador);
        assertFalse(producto.getObservadores().contains(subastador));
    }

    
   
}