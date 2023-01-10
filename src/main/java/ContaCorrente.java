public class ContaCorrente implements Conta{
    private int codigo;
    private String nomeTitular;
    private float saldo;
    private float taxaJuros;

    public ContaCorrente(int codigo, String nomeTitular, float saldo, float taxaJuros) {
        this.codigo = codigo;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
        this.taxaJuros = taxaJuros;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public float getSaldo() {
        return saldo;
    }

    public float getTaxaJuros() {
        return taxaJuros;
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirContaCorrente(this);
    }
}
