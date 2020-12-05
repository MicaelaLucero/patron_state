package ar.edu.ge.meli;

public class Saludable implements EstadoDeSalud{

    Soldado soldado;

    public Saludable(Soldado soldado) {
        this.soldado = soldado;
    }

    @Override
    public Soldado recibirDisparo() {
        System.out.print("Grito fuerte");
        this.soldado.setSangre(soldado.getSangre() - 100);
        this.soldado.setEstadoDeSalud(new Herido(soldado));
        this.soldado.setCantidadDeAgujerosDeBala(soldado.getCantidadDeAgujerosDeBala()+1);
        return this.soldado;
    }
}
