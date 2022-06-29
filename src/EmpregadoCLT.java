public class EmpregadoCLT extends Empregado{

    private boolean temBeneficio;

    public EmpregadoCLT(double matricula, String nome, int CPF, double salarioComissao, double salarioComissaoeFixo, boolean temBeneficio) {
        super(matricula, nome, CPF, salarioComissao, salarioComissaoeFixo);
        this.temFerias = temFerias;
    }

    public boolean isTemBeneficio() {
        return temFerias;
    }

    public void setTemBeneficio(boolean temBeneficio) {
        this.temBeneficio = temBeneficio;
    }


}
