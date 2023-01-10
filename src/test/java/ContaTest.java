import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaTest {

    @Test
    void deveExibirContaCorrente() {
        ContaCorrente contaCorrente = new ContaCorrente(1903, "Anderson Vieira", 1000f, 28.29f);
        ContaVisitor visitor = new ContaVisitor();

        assertEquals("ContaCorrente{codigo: 1903, nome do titular: 'Anderson Vieira', saldo: 1000.0, taxa de juros: 28.29}", visitor.exibir(contaCorrente));
    }

    @Test
    void deveExibirContaPoupanca() {
        ContaPoupanca contaPoupanca = new ContaPoupanca(2640, "Sabrina Moraes", 1500f, 7.9f);
        ContaVisitor visitor = new ContaVisitor();

        assertEquals("ContaPoupanca{codigo: 2640, nome do titular: 'Sabrina Moraes', saldo: 1500.0, taxa de rendimento: 7.9}", visitor.exibir(contaPoupanca));
    }

    @Test
    void deveExibirContaSalario() {
        ContaSalario contaSalario = new ContaSalario(1650, "Edson Silva", 2600f, new Empresa("Comercio S/A", "06.778.244/0001-86"));
        ContaVisitor visitor = new ContaVisitor();

        assertEquals("ContaSalario{codigo: 1650, nome do titular: 'Edson Silva', saldo: 2600.0, empresa: 'Comercio S/A'}", visitor.exibir(contaSalario));
    }

}