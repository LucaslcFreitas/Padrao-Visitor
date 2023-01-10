public class ContaPoupanca implements Conta{

    private int codigo;
    private String nomeTitular;
    private float saldo;
    private float taxaRendimento;

    public ContaPoupanca(int codigo, String nomeTitular, float saldo, float taxaRendimento) {
        this.codigo = codigo;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
        this.taxaRendimento = taxaRendimento;
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

    public float getTaxaRendimento() {
        return taxaRendimento;
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirContaPoupanca(this);
    }
}
