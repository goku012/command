public class Ingresso {

    private String evento;
    private String tipo;
    private boolean disponivel;

    public Ingresso(String evento, String tipo) {
        this.evento = evento;
        this.tipo = tipo;
        this.disponivel = true;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void reservar() {
        this.disponivel = false;
    }

    public void cancelarReserva() {
        this.disponivel = true;
    }

}
