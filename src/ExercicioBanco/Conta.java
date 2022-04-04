package ExercicioBanco;

 public abstract class Conta {
     private String nomeBanco;
     private int agencia;
     private int numeroConta;
     private double saldo;
     private double sacar;
     private double deposito;

     public String getNomeBanco() {
         return nomeBanco;
     }

     public void setNomeBanco( String nomeBanco ) {
         this.nomeBanco = nomeBanco;
     }

     public int getAgencia() {
         return agencia;
     }

     public void setAgencia( int agencia ) {
         this.agencia = agencia;
     }

     public int getNumeroConta() {
         return numeroConta;
     }

     public void setNumeroConta( int numeroConta ) {
         this.numeroConta = numeroConta;
     }

     abstract double getSaldo();

     public void setSaldo( double saldo ) {
         this.saldo = saldo;
     }

     abstract double getSacar( double valor);

     public void setSacar( double sacar ) {
         this.sacar = sacar;
     }

      abstract double getDeposito( double valor);

     public void setDeposito( double deposito ) {
         this.deposito = deposito;
     }
 }
