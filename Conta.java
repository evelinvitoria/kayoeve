abstract class Conta implements ContaBancaria {
    protected String numero;
    protected double saldo;

    public Conta(String numero) {
        this.numero = numero;
        this.saldo = 0.0;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public double getSaldo() {
        return saldo;
    }

    @Override
    public abstract void sacar(double valor) throws SaldoInsuficienteException;
}