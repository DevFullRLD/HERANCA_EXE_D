package Utilities;

import javax.swing.*;
import java.util.Date;

public class Deposito extends Pagamento {
    String idDeposito = "";

    public Deposito(int valor_pag, String banco_pag, String agencia_pag, String conta_pag, String idDeposito, String data_pag) {
        super(valor_pag, String.valueOf(data_pag));
        this.idDeposito = idDeposito;
    }

    public void exibirDadosDeposito(){
        JOptionPane.showMessageDialog(null,"Codigo do Deposito: " + this.idDeposito +"\n" +
                                                                    "Banco: "   + this.banco_pag          + "\n" +
                                                                    "Conta: "   + this.conta_pag          + "\n" +
                                                                    "Agencia: " + this.agencia_pag        + "\n" +
                                                                    "Valor do Deposito: " + this.valor_pag + "\n"+
                                                                    "Depositado em: " + this.getData_pag());
    }
    public String getIdDeposito() {
        return idDeposito;
    }

    public void setIdDeposito(String idDeposito) {
        this.idDeposito = idDeposito;
    }
}
