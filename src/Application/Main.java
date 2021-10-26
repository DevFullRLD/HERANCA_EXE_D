package Application;

import Utilities.*;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyyy");
        int opera = Integer.parseInt(JOptionPane.showInputDialog("Digite a operação Escolhida: " + "\n"+
                                                                "1 - Pagamento em Cheque" + "\n" +
                                                                "2 - Pagamento via Boleto" + "\n" +
                                                                "3 - Depósito Bancario" + "\n"+
                                                                "4 - Tranferência Bancaria"));

        switch (opera){
            case 1:{
                //ENTRADA DE DADOS
                String financeira = JOptionPane.showInputDialog("Digite o nome da Financeira:");
                String nome       = JOptionPane.showInputDialog("Digite seu nome: ");
                String numero     = JOptionPane.showInputDialog("Digite o numero do Talão de cheque:");
                int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do cheque"));
                Date dataNF = new Date();
                String dataAB = formatar.format(dataNF);
                Date datapg = null;
                Cheque cheque = new Cheque(valor, financeira, nome, numero, dataAB, datapg);
                //INSERINDO DADOS

                cheque.setFinanceira(financeira);
                cheque.setNomeCliente(nome);
                cheque.setNumero(numero);
                cheque.setDataAbertura(dataAB);
                cheque.setValor_pag(valor);

                //APRESENTANDO DADOS
                cheque.exibirDadosCheque();
                break;
            }
            case 2: {
                //ENTRADA DE DADOS
                String codigo = JOptionPane.showInputDialog("Digite o Codigo do Cliente:");
                String nome       = JOptionPane.showInputDialog("Digite seu nome do cliente: ");
                int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do cheque"));
                Date dataNF = new Date();
                String datapg = formatar.format(dataNF);
                Boleto boleto = new Boleto(valor, datapg, codigo, nome );
                //INSERINDO DADOS

                boleto.setCodCliente(codigo);
                boleto.setNomeCliente(nome);
                boleto.setData_pag(datapg);
                boleto.setValor_pag(valor);

                //APRESENTANDO DADOS

                boleto.exibirDadosBoleto();
                break;
            }
            case 3:{
                //ENTRADA DE DADOS
                String codigo = JOptionPane.showInputDialog("Digite o id do deposito:");
                String banco       = JOptionPane.showInputDialog("Digite o Banco: ");
                String conta       = JOptionPane.showInputDialog("Digite a conta: ");
                String agencia       = JOptionPane.showInputDialog("Digite a agencia: ");
                int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do deposito"));
                Date dataNF = new Date();
                String datapg = formatar.format(dataNF);
                Deposito deposito = new Deposito(valor, banco, agencia, conta, codigo, datapg);

                //INSERINDO DADOS
                deposito.setBanco_pag(banco);
                deposito.setAgencia_pag(agencia);
                deposito.setConta_pag(conta);
                deposito.setIdDeposito(codigo);
                deposito.setValor_pag(valor);
                deposito.setData_pag(datapg);

                //APRESENTANDO DADOS
                deposito.exibirDadosDeposito();
                break;
            }
            case 4:{
                //ENTRADA DE DADOS
                String codigo = JOptionPane.showInputDialog("Digite o id da transferencia:");
                String tipo = JOptionPane.showInputDialog("Digite o  tipo de tranferencia:");
                String banco       = JOptionPane.showInputDialog("Digite o Banco: ");
                String conta       = JOptionPane.showInputDialog("Digite a conta: ");
                String agencia       = JOptionPane.showInputDialog("Digite a agencia: ");
                int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do deposito"));
                Date dataNF = new Date();
                String datapg = formatar.format(dataNF);
                Tranferencia transferencia = new Tranferencia(valor, banco, agencia, conta, tipo, codigo, datapg);

                //INSERINDO DADOS
                transferencia.setBanco_pag(banco);
                transferencia.setAgencia_pag(agencia);
                transferencia.setConta_pag(conta);
                transferencia.setCodIdentificacao(codigo);
                transferencia.setData_pag(datapg);
                transferencia.setTipo(tipo);
                transferencia.setValor_pag(valor);

                //APRESENTANDO DADOS
                transferencia.exibirDadosTransferencia();
                break;
            }
            default:{
                JOptionPane.showMessageDialog(null,"Opção invalida, execute novamente");
                break;
            }
        }
    }
}
