package Utilities;

import javax.swing.*;
import java.util.Date;

public class Boleto extends Pagamento {
    private String codCliente, nomeCliente = "";

    public Boleto(int valor_pag,String banco_pag,String agencia_pag,String conta_pag,  String data_pag, String codCliente, String nomeCliente, String forma_pag, int parcelas_pag) {
        super(valor_pag, banco_pag, agencia_pag, conta_pag, data_pag, forma_pag, parcelas_pag);
        this.codCliente = codCliente;
        this.nomeCliente = nomeCliente;
    }

    public void exibirDadosBoleto(){
        JOptionPane.showMessageDialog(null,"Codigo de Cliente: "   + this.getCodCliente()   +"\n" +
                                                                    "Nome do Cliente: "  + this.getNomeCliente()  + "\n" +
                                                                    "Valor do Boleto: "  + this.getValor_pag()     + "\n" +
                                                                    "Data de vencimento: " + this.getData_pag());
    }

    public String getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(String codCliente) {
        this.codCliente = codCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
}
