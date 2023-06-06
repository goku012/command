public class ReservaIngressoTarefa implements Tarefa {

    private Ingresso ingresso;

    public ReservaIngressoTarefa(Ingresso ingresso) {
        this.ingresso = ingresso;
    }

    public void executar() {
        this.ingresso.reservar();
    }

    public void cancelar() {
        this.ingresso.cancelarReserva();
    }
}