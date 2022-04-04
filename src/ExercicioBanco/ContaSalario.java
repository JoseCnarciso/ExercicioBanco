package ExercicioBanco;

public class ContaSalario extends Conta {
    private int limiteSaques;

    public ContaSalario( int limiteSaques ) {
        this.limiteSaques = limiteSaques;
    }

    public int getLimiteSaques(double valor) {

        return limiteSaques;
    }

    public void setLimiteSaques( int limiteSaques ) {
        this.limiteSaques = limiteSaques;
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
        if (limiteSaques > 0) {
            setSaldo(getSaldo() - valor );
            limiteSaques --;
            return valor;

        }
        return 0.0;
    }

    @Override
    double getDeposito( double valor ) {
        setSaldo(getSaldo() + valor);

        return valor;
    }
}
