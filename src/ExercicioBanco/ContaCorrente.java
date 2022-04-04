package ExercicioBanco;

public class ContaCorrente extends Conta{
    private double chequeEspecial;



    public ContaCorrente() {
        this.chequeEspecial = chequeEspecial;
    }

    public double getChequeEspecial() {
        if (getSaldo() < 0) {
            return chequeEspecial - Math.abs(getSaldo());
        } else {
            return chequeEspecial;
        }
    }

    public void setChequeEspecial( double chequeEspecial ) {
        this.chequeEspecial = chequeEspecial;
    }

    @Override
    public String getNomeBanco() {
        return super.getNomeBanco();
    }

    @Override
    double getSaldo() {
        return 0;
    }

    @Override
    double getSacar( double valor ) {
        if (valor <= (getSaldo() + chequeEspecial)) {

        }
        return valor;
    }

    @Override
    double getDeposito( double valor ) {
        setSaldo(getSaldo() + valor);

        return valor;
    }
}
