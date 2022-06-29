public class EmpregadoPJ extends Empregado{

    private boolean temFerias;

    public EmpregadoPJ(double matricula, String nome, int CPF, double salarioComissao, double salarioComissaoeFixo, boolean temFerias) {
        super(matricula, nome, CPF, salarioComissao, salarioComissaoeFixo);
        this.temFerias = temFerias;
    }

    public boolean isTemFerias() {
        return temFerias;
    }

    public void setTemFerias(boolean temFerias) {
        this.temFerias = temFerias;
    }


}
