package pi_alessandra;

public class Pesquisar {
    // LISTA DE VAGAS POR PESQUISA
    static void psqVagas(int pesquisar) {
        int j = 0; // CONTADOR 
        for (int i = 0; i < Domestica.listaVagas.length; i++) {
            if (pesquisar == (i + 1)) {                
                j++;
                System.out.println("ID da vaga: " + (Domestica.listaVagas[i].id + 1));
                System.out.println("    Localidade: " + Domestica.listaVagas[i].localVagas);
                System.out.println("    Detalhes da Vaga: " + Domestica.listaVagas[i].detalhesVagas);
                System.out.println("    Salário da diarista: " + Domestica.listaVagas[i].salarioDiaristas);
                System.out.println("    Dias trabalhados: " + Domestica.listaVagas[i].diasTrabalhados);
                System.out.println();
            } else if (Domestica.listaVagas[i] == null) { 
               i = Domestica.listaVagas.length;
            }
        }
        if (j == 0) {
            System.out.println("Vaga não encontrada");
        } else {
            ListarVagas.subMenuVagas();
        }        
    }
    
    //MENU PESQUISA
    static void menuPesquisar() {
        System.out.print("\n----------------Pesquisar-----------------\n");
        System.out.println("        (1) - Por ID");
        System.out.println("        (2) - Por localidade");
        System.out.println("        (3) - Por dias de trabalho");        
        System.out.print("------------------------------------------\n");
        Menu.validarOp();
        Domestica.auxiliarTeclado = ListarVagas.validarSubMenu();
    }

    //CONDIÇÃO OPÇÕES DE VAGAS
    static void casePsqVagas() {
        Domestica.auxiliarTeclado = ListarVagas.validarSubMenu();

        int opcaoInt; // VARIAVEL PARA O CASE

        if (Domestica.auxiliarTeclado == 1) {
            System.out.println("Digite o ID: ");
            opcaoInt = Domestica.entrada.nextInt();
            //LAÇO PARA BUSCAR POR ID
            psqVagas(opcaoInt);
        } else if (Domestica.auxiliarTeclado == 2) {
            System.out.println("Digite o ID: ");
            opcaoInt = Domestica.entrada.nextInt();
        } else if (Domestica.auxiliarTeclado == 3) {
            Pesquisar.menuPesquisar();
        } else {
            System.out.println();
        }
    }
}
