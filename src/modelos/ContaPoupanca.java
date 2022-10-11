package modelos;

import Enums.TipoConta;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(Cliente cliente) {
        super(cliente, TipoConta.P);
    }

    @Override
    public void imprimirExtrato() {
        ImprimirExtratoDadosPrincipais();
    }

}
