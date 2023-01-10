public class ContaVisitor implements Visitor{

    public String exibir(Conta conta) {
        return conta.aceitar(this);
    }

    @Override
    public String exibirContaCorrente(ContaCorrente contaCorrente) {
        return "ContaCorrente{"+
                "codigo: " + contaCorrente.getCodigo() +
                ", nome do titular: '" + contaCorrente.getNomeTitular()+
                "', saldo: " + contaCorrente.getSaldo()+
                ", taxa de juros: " + contaCorrente.getTaxaJuros()+
                "}";
    }

    @Override
    public String exibirContaPoupanca(ContaPoupanca contaPoupanca) {
        return "ContaPoupanca{"+
                "codigo: " + contaPoupanca.getCodigo() +
                ", nome do titular: '" + contaPoupanca.getNomeTitular()+
                "', saldo: " + contaPoupanca.getSaldo()+
                ", taxa de rendimento: " + contaPoupanca.getTaxaRendimento()+
                "}";
    }

    @Override
    public String exibirContaSalario(ContaSalario contaSalario) {
        return "ContaSalario{"+
                "codigo: " + contaSalario.getCodigo() +
                ", nome do titular: '" + contaSalario.getNomeTitular()+
                "', saldo: " + contaSalario.getSaldo()+
                ", empresa: '" + contaSalario.getNomeEmpresa()+
                "'}";
    }
}
