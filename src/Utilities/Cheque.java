package Utilities;

import javax.swing.*;
import java.util.Date;

public class Cheque extends Pagamento {

    private String financeira, nomeCliente, numero = "";
    private String dataAbertura;

    public Cheque(int valor_pag, String banco_pag,String agencia_pag,String conta_pag , String financeira, String nomeCliente, String numero, String dataAbertura, Date data_pag, String forma_pag, int parcelas_pag) {
        super(valor_pag, banco_pag, agencia_pag, conta_pag, String.valueOf(data_pag), forma_pag, parcelas_pag);
        this.financeira = financeira;
        this.nomeCliente = nomeCliente;
        this.numero = numero;
        this.dataAbertura = dataAbertura;
    }

    public String getFinanceira() {
        return financeira;
    }

    public void setFinanceira(String financeira) {
        this.financeira = financeira;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }



    public void exibirDadosCheque(){
        JOptionPane.showMessageDialog(null,"Numero do cheque: "      + getNumero()       +"\n" +
                                                                    "Nome da Financeira: "  + getFinanceira()  + "\n" +
                                                                    "Nome do Cliente: "     + getNomeCliente() + "\n" +
                                                                    "Data Inicio:  "         + getDataAbertura()+ "\n" +
                                                                    "Valor : "              + getValor_pag() + "\n" );
    }

}
