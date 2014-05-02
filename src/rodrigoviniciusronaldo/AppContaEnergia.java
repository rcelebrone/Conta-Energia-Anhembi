/*
Rodrigo Celebrone - 20428584
Ronaldo dos Santos Pereira - 20432398
Vinicius Andrade - 20470284
 */

package rodrigoviniciusronaldo;

import java.util.Scanner;

/**
 *
 * @author Rodrigo Celebrone
 */
public class AppContaEnergia {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menuPrograma = 0;
        GerenciaContasEnergia gContaEnergia = new GerenciaContasEnergia();
        
        while(menuPrograma != 6){
            System.out.println("////////////////////Escolha uma opção////////////////////////");
            System.out.println("1 – Adicionar ContaEnergia");
            System.out.println("2 – Buscar ContaEnergia e exibir os dados");
            System.out.println("3 – Exibir mais econômica");
            System.out.println("4 – Exibir Consumo Médio");
            System.out.println("5 – Listar todas");
            System.out.println("6 – Sair");
            System.out.println("////////////////////////////////////////////");
            System.out.println("Digite o numero de uma dos opções acima: ");
            menuPrograma = input.nextInt();

            while (menuPrograma < 1 || menuPrograma > 6) {
                System.out.print("Digite uma das opções 1,2,3,4,5,6: ");
                menuPrograma = input.nextInt();
            }
            
            if (menuPrograma == 1) {
                gContaEnergia.adicionarContaEnergia(new ContaEnergia());
            } else if (menuPrograma == 2) {
                ContaEnergia ce = gContaEnergia.buscarContaEnergia(1);
                ce.ExibirDados(ce);
            } else if (menuPrograma == 3) {
                gContaEnergia.exibirContaEconomica();
            } else if (menuPrograma == 4) {
                gContaEnergia.exibirConsumoMedioKw();
            } else if (menuPrograma == 5) {
                System.out.println(gContaEnergia.listarTodas());
            } else if (menuPrograma == 6) {
                System.exit(0);
            }
        }
    }
    
}
