/*
* Rodrigo Celebrone - 20428584
* Ronaldo dos Santos Pereira - 20432398
* Vinicius Andrade - 20470284
*/

package rodrigoviniciusronaldo;

/**
 *
 * @author Rodrigo Celebrone
 */
public class ContaEnergia {
    public int numeroConta;
    public Cliente cliente;
    public double kwValorUnitario;
    public double kwConsumido;
        
    public ContaEnergia(){
        this(1,new Cliente(),12.987);
    }
    
    public ContaEnergia(int numeroConta, Cliente cliente, double kwConsumido){
        this.kwValorUnitario = 1.5;
        this.cliente = cliente;
        this.kwConsumido = kwConsumido;
        this.numeroConta = numeroConta;
    }
    
    public void ExibirDados(ContaEnergia contaEnergia){
        System.out.println(contaEnergia.cliente.Imprimir());
        System.out.println("Numero da conta: " + contaEnergia.numeroConta);
        System.out.println("KW consumidos: " + contaEnergia.kwConsumido);
        System.out.println("Valor da conta: R$" + contaEnergia.kwConsumido * contaEnergia.kwValorUnitario);
    }
    
    public String Imprimir(){
        return this.cliente.Imprimir() + ". Sua fatura fechou em: RS "+ String.valueOf(this.calcularTotalConta());
    }
    
    public double calcularTotalConta(){
        return this.kwConsumido * this.kwValorUnitario;
    }
    
    
}
