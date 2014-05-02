/*
* Rodrigo Celebrone - 20428584
* Ronaldo dos Santos Pereira - 20432398
* Vinicius Andrade - 20470284
*/

package rodrigoviniciusronaldo;

import java.util.ArrayList;

/**
 *
 * @author Rodrigo Celebrone
 */
public class GerenciaContasEnergia {
    ArrayList<ContaEnergia> ArrContaEnergia = new ArrayList<>();

    public void adicionarContaEnergia(ContaEnergia ce){
        GerenciaContasEnergia gce = new GerenciaContasEnergia();
        gce.ArrContaEnergia.add(ce);
        this.ArrContaEnergia = gce.ArrContaEnergia;
    }
    
    public ContaEnergia buscarContaEnergia(String nomeConsumidor){
        for (ContaEnergia ce : this.ArrContaEnergia){
            if (ce.cliente.nome.equals(nomeConsumidor)){
                return ce;
            }
        }
        return null;
    }
    
    // criei um overload desse metodo pois nas especificações não ficou claro o que é pra fazer
    // buscarContaEnergia(String nomeConsumidor): buscar uma conta de energia pelo <<<NÚMERO>>>. Este método deve retornar um objeto ContaEnergia.
    public ContaEnergia buscarContaEnergia(int numeroConta){
        for (ContaEnergia ce : this.ArrContaEnergia){
            if (ce.numeroConta == numeroConta){
                return ce;
            }
        }
        return null;
    }
    
    public String listarTodas(){
        if(this.ArrContaEnergia.isEmpty())
            return null;
        String contas = "";
        for (ContaEnergia ce : this.ArrContaEnergia){
            contas += ce.Imprimir() + " \n ";
        }
        return contas;
    }
    
    public void exibirContaEconomica(){
        if(!this.ArrContaEnergia.isEmpty()){
            ContaEnergia maisEconomica = null;
            for (ContaEnergia ce : this.ArrContaEnergia){
                if(maisEconomica == null)
                    maisEconomica = ce;
                else{
                    if(ce.kwConsumido < maisEconomica.kwConsumido)
                        maisEconomica = ce;
                }
            }
            if(maisEconomica != null)
                System.out.println("O cliente:" + maisEconomica.cliente.nome + ", possui a conta mais economica com " + maisEconomica.kwConsumido + " Kw consumidos.");
        }
    }

    public void exibirConsumoMedioKw(){
        if(!this.ArrContaEnergia.isEmpty()){
            double consumoMedio = 0;
            for (ContaEnergia ce : this.ArrContaEnergia){
                consumoMedio += ce.kwConsumido;
            }
            System.out.println(consumoMedio / this.ArrContaEnergia.size());
        }
    }
}
