package modelos;

import Enums.TipoConta;
import interfaces.IConta;
import lombok.Getter;

public abstract class Conta implements IConta {

    private static final String AGENCIA =  "0001";
    private static int SEQUENCIAL = 1001;

    @Getter
    protected String agencia;
    @Getter
    protected String numero;
    @Getter
    protected double saldo;
    @Getter
    protected Cliente cliente;
    @Getter
    protected TipoConta tipoConta;

    public Conta(Cliente cliente, TipoConta tipoConta) {
        this.agencia = Conta.AGENCIA;
        this.numero = String.format("%08d", SEQUENCIAL++);
        this.cliente = cliente;
        this.tipoConta = tipoConta;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta destino) {
        sacar(valor);
        destino.depositar(valor);
    }

    void ImprimirExtratoDadosPrincipais() {
        System.out.println("=== EXTRATO DE CONTA " + this.tipoConta.getDescricao() + " ===");
        System.out.println(String.format("Cliente: %s", this.cliente.getNome()));
        System.out.println(String.format("\nAgência: %s", this.agencia));
        System.out.println(String.format("Numero: %s", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
        System.out.println("=================================\n");
    }
}
