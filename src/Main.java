import modelos.Cliente;
import modelos.Conta;
import modelos.ContaCorrente;
import modelos.ContaPoupanca;

public class Main {
    public static void main(String[] args) {

        Cliente c = new Cliente("Marcelo");

        Conta cc = new ContaCorrente(c);
        Conta cp = new ContaPoupanca(c);

        cc.depositar(1000);
        cc.transferir(250, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}