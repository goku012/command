import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GerenciadorIngressosTest {

    GerenciadorIngressos gerenciadorIngressos;
    Ingresso ingresso;

    @BeforeEach
    void setUp() {
        gerenciadorIngressos = new GerenciadorIngressos();
        ingresso = new Ingresso("Concerto", "VIP");
    }

    @Test
    void deveReservarIngresso() {
        Tarefa reservaIngresso = new ReservaIngressoTarefa(ingresso);
        gerenciadorIngressos.executarTarefa(reservaIngresso);

        assertFalse(ingresso.isDisponivel());
    }

    @Test
    void deveCancelarReservaIngresso() {
        Tarefa cancelamentoReserva = new CancelamentoReservaTarefa(ingresso);
        gerenciadorIngressos.executarTarefa(cancelamentoReserva);

        assertTrue(ingresso.isDisponivel());
    }

    @Test
    void deveCancelarUltimaTarefa() {
        Tarefa reservaIngresso = new ReservaIngressoTarefa(ingresso);
        Tarefa cancelamentoReserva = new CancelamentoReservaTarefa(ingresso);

        gerenciadorIngressos.executarTarefa(reservaIngresso);
        gerenciadorIngressos.executarTarefa(cancelamentoReserva);

        gerenciadorIngressos.cancelarUltimaTarefa();

        assertFalse(ingresso.isDisponivel());
    }

}