package Utilities;

import javax.swing.*;
import java.util.Date;

public class Tranferencia extends Pagamento {
    String tipo, codIdentificacao = "";

    public Tranferencia(int valor_pag, String banco_pag, String agencia_pag, String conta_pag, String tipo, String codIdentificacao, String data_pag, String forma_pag, int parcelas_pag) {
        super(valor_pag, banco_pag, agencia_pag, conta_pag, String.valueOf(data_pag), forma_pag, parcelas_pag);
        this.tipo = tipo;
        this.codIdentificacao = codIdentificacao;
    }

    public void exibirDadosTransferencia(){
        JOptionPane.showMessageDialog(null,"Codigo de Identificacao: " + this.getCodIdentificacao() +"\n" +
                                                                  "Tipo de Tranferencia: " + this.getTipo()  + "\n" +
                                                                  "Banco: "   + this.getBanco_pag()          + "\n" +
                                                                  "Conta: "   + this.getConta_pag()          + "\n" +
                                                                  "Agencia: " + this.getAgencia_pag()        + "\n" +
                                                                  "Data da Tranferencia: " + this.getData_pag() + "\n"+
                                                                  "Valor da Transferencia: " + this.getValor_pag());
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCodIdentificacao() {
        return codIdentificacao;
    }

    public void setCodIdentificacao(String codIdentificacao) {
        this.codIdentificacao = codIdentificacao;
    }
}
