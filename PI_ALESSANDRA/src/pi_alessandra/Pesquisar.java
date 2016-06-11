package pi_alessandra;

public class Pesquisar {

    //MENU PESQUISA
    static void menuPesquisar() {
        System.out.print("\n----------------Pesquisar-----------------\n");
        System.out.println("        (1) - Por ID");
        System.out.println("        (2) - Por categoria");
        System.out.println("        (3) - Por localidade");
        System.out.println("        (4) - Por dias de trabalho");
        System.out.print("------------------------------------------\n");
        Menu.validarOp();
    }
    
    //VALIDAR CASE
    static int lacoValidarCase() {
        boolean auxCase = false;
        int opcaoInt;

        do {
            System.out.println("Digite o ID: ");
            opcaoInt = Domestica.entrada.nextInt();
            if ((opcaoInt < 0) && (opcaoInt > Domestica.listaVagas.length)) {
                System.out.println("ID não encontrado.");
            } else if (Domestica.listaVagas[opcaoInt] == null) {
                System.out.println("Não existe vaga com esse Id");
            } else {
                auxCase = true;
            }
        } while (auxCase == false);
        return opcaoInt;
    }
    
    //METODO VALIDAR E RETORNAR O VALOR
    static int validarSubPsq() {
        // Verifica se a opção menu inicial é válida - 1 até 5 = São as opções do menu 
        while ((Domestica.auxiliarTeclado < 0) || (Domestica.auxiliarTeclado > 4)) {
            System.out.printf("\nOpção inválida, tente novamente: ");

            try {
                Domestica.opcaoTeclado = Domestica.entrada.next();
                Domestica.auxiliarTeclado = Integer.parseInt(Domestica.opcaoTeclado);
            } catch (Exception error) {
                //VERIFICA SE O USUARIO DIGIOU LETRA, RETORNA PARA O MENU E PEDE QUE DIGITE UM NUMERO
                System.out.println("Valor Inválido!");
            }
        }
        return Domestica.auxiliarTeclado;
    }
    
    //CASE SUBMENU PESQUISAR
    static void casePsqVagas() {
        // VARIAVEL PARA O CASE
        int opcaoInt;
        
        // SWITCH CASE
        switch (Domestica.auxiliarTeclado) {
            case 1:
                opcaoInt = validarSubPsq();
                //LAÇO PARA BUSCAR POR ID
                psqId(opcaoInt);
                break;
            case 2:
                System.out.println("Digite o ID: ");
                opcaoInt = Domestica.entrada.nextInt();
                break;
            case 3:
                Pesquisar.menuPesquisar();
                break;
            default:
                System.out.println();
                break;
        }
    }

    //PESQUISA POR ID
    static void psqId(int pesquisar) {
        int j = 0; // CONTADOR 
        for (int i = 0; i < Domestica.listaVagas.length; i++) {
            if (pesquisar == Domestica.listaVagas[i].id) {
                j++;
                System.out.println("ID da vaga: " + (Domestica.listaVagas[i].id));
                System.out.println("    Categoria: " + Domestica.listaVagas[i].categoria);
                System.out.println("    Detalhes da Vaga: " + Domestica.listaVagas[i].detalhesVagas);
                System.out.println("    Localidade: " + Domestica.listaVagas[i].localVagas);
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

    // LISTA DE VAGAS POR PESQUISA
    static void psqVagas(int opcaoInt) {
        int j = 0; // CONTADOR 
        
        for (int i = 0; i < Domestica.listaVagas.length; i++) {
            if (opcaoInt == (i + 1)) {
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
}
