package Utilities;

import javax.swing.*;
import java.util.Date;

public class Cheque extends Pagamento {

    String financeira, nomeCliente, numero = "";
    String dataAbertura;

    public Cheque(int valor_pag, String financeira, String nomeCliente, String numero, String dataAbertura, Date data_pag) {
        super(valor_pag, String.valueOf(data_pag));
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
        JOptionPane.showMessageDialog(null,"Numero do cheque: "      + this.getNumero()       +"\n" +
                                                                    "Nome da Financeira: "  + this.getFinanceira()  + "\n" +
                                                                    "Nome do Cliente: "     + this.getNomeCliente() + "\n" +
                                                                    "Data Inicio:  "         + this.getDataAbertura()+ "\n" +
                                                                    "Valor : "              + this.getValor_pag() + "\n" );
    }

}
