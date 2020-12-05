package ar.edu.ge.meli;

public class Soldado {

    Integer sangre = 200;
    Integer cantidadDeAgujerosDeBala = 0;
    EstadoDeSalud estadoDeSalud;

    public Integer getSangre() {
        return sangre;
    }

    public void setSangre(Integer sangre) {
        this.sangre = sangre;
    }

    public Integer getCantidadDeAgujerosDeBala() {
        return cantidadDeAgujerosDeBala;
    }

    public void setCantidadDeAgujerosDeBala(Integer cantidadDeAgujerosDeBala) {
        this.cantidadDeAgujerosDeBala = cantidadDeAgujerosDeBala;
    }

    public EstadoDeSalud getEstadoDeSalud() {
        return estadoDeSalud;
    }

    public void setEstadoDeSalud(EstadoDeSalud estadoDeSalud) {
        this.estadoDeSalud = estadoDeSalud;
    }
}
