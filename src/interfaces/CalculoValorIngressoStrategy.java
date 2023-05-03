package interfaces;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public interface CalculoValorIngressoStrategy {
    BigDecimal calcularValor(LocalDate dataNascimento, boolean isEstudante);
}
