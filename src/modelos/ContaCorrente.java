package modelos;

import Enums.TipoConta;

public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente) {
        super(cliente, TipoConta.C);
    }

    @Override
    public void imprimirExtrato() {
        ImprimirExtratoDadosPrincipais();
    }
}
