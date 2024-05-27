interface ContaBancaria {
    void depositar(double valor);
    void sacar(double valor) throws SaldoInsuficienteException;
    double getSaldo();
}
