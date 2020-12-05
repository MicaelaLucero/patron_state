package ar.edu.ge.meli;

public class Herido implements EstadoDeSalud{

    Soldado soldado;

    public Herido(Soldado soldado) {
        this.soldado = soldado;
    }

    @Override
    public Soldado recibirDisparo() {
        System.out.print("Grito más fuerte");
        this.soldado.setSangre(soldado.getSangre()/2);
        this.soldado.setCantidadDeAgujerosDeBala(soldado.getCantidadDeAgujerosDeBala()+1);
        return this.soldado;
    }
}
