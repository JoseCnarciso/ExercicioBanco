package ExercicioBanco;

import java.util.Date;

public class ContaPoupanca extends Conta{
    private Date dataInicial;
    private double taxaJurosFixa;

    public ContaPoupanca( Date dataInicial, double taxaJurosFixa ) {
        this.dataInicial = dataInicial;
        this.taxaJurosFixa = taxaJurosFixa;
    }

    public ContaPoupanca() {

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
        if (valor <= (getSaldo() + getSaldo())) {

        }
        return valor;
    }

    @Override
    double getDeposito( double valor ) {
        setSaldo(getSaldo() + valor);

        return valor;
    }
}
