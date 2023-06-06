public class CancelamentoReservaTarefa implements Tarefa {

    private Ingresso ingresso;

    public CancelamentoReservaTarefa(Ingresso ingresso) {
        this.ingresso = ingresso;
    }

    public void executar() {
        this.ingresso.cancelarReserva();
    }

    public void cancelar() {
        this.ingresso.reservar();
    }
}