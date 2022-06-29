class Empregados {

    private double matricula;
    private String nome;
    private int CPF;
    private double salarioComissao;
    private double salarioComissaoeFixo;

    public Empregados(double matricula, String nome, int CPF, double salarioComissao, double salarioComissaoeFixo) {

    this.matricula = matricula;
    this.nome = nome;
    this.CPF = CPF;
    this.salarioComissao = salarioComissao;
    this.salarioComissaoeFixo = salarioComissaoeFixo;

    if (this.salarioComissao < 0 ); {
        this.salarioComissao = Double.parseDouble("Salario" + "Vendas");
        }

    }

    public double getSalarioComissaoeFixo() {
        return salarioComissaoeFixo;
    }

    public void setSalarioComissaoeFixo(double salarioComissaoeFixo) {
        this.salarioComissaoeFixo = salarioComissaoeFixo;
    }

    public double getSalarioComissao() {
        return salarioComissao;
    }

    public void setSalarioComissao(double salarioComissao) {
        this.salarioComissao = salarioComissao;

        if (this.salarioComissao < 0 ); {
            this.salarioComissao = Double.parseDouble("Salario" + "Vendas");
        }
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
