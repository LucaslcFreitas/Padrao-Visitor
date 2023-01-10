public class ContaSalario implements Conta{

    private int codigo;
    private String nomeTitular;
    private float saldo;
    private Empresa empresa;

    public ContaSalario(int codigo, String nomeTitular, float saldo, Empresa empresa) {
        this.codigo = codigo;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
        this.empresa = empresa;
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

    public String getNomeEmpresa() {
        return empresa.getNome();
    }


    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirContaSalario(this);
    }
}
