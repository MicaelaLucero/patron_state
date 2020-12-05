package ar.edu.ge.meli;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class SoldadoTest {

    Soldado soldado = new Soldado();
    EstadoDeSalud estadoDeSalud;
    Saludable saludable;
    Herido herido;
    Integer cantidadDeSangre;

    @Test
    public void cuandoReciboUnDisparoPasoAEstadoHerido(){
        dadoUnSoldadoHerido();
        cuandoReciboUnDisparoEstandoHerido();
        entoncesPierdoLaMitadDeLaSangre();
    }

    private void dadoUnSoldadoHerido() {
        this.herido = new Herido(soldado);
    }

    private void cuandoReciboUnDisparoEstandoHerido() {
        this.herido.recibirDisparo();
        cantidadDeSangre = this.soldado.getSangre();
    }

    private void entoncesPierdoLaMitadDeLaSangre() {
        assertThat(cantidadDeSangre).isEqualTo(100);
    }

    @Test
    public void cuandoReciboUnDisparoEstandoHeridoPierdoLaMitadDeLaSangre(){
        dadoUnSoldadoSaludable();
        cuandoReciboUnDisparo();
        entoncesPasoAEstadoHerido();
    }

    private void dadoUnSoldadoSaludable() {
        this.saludable = new Saludable(soldado);
    }

    private void cuandoReciboUnDisparo() {
        this.saludable.recibirDisparo();
        this.estadoDeSalud = this.soldado.getEstadoDeSalud();
    }

    private void entoncesPasoAEstadoHerido() {
        assertThat(estadoDeSalud).isInstanceOf(Herido.class);
    }
}
