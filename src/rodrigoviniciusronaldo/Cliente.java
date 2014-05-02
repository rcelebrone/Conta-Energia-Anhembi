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
public class Cliente {
    public String nome;
    public String endereco;
    
    public Cliente (){
        this("Rodrigo Celebrone","Rua Coimbra, 705, Diadema/SP");
    }
    
    public Cliente (String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
    }
    
    public String Imprimir(){
        return this.nome + " reside no endereço: " + this.endereco;
    }
}
