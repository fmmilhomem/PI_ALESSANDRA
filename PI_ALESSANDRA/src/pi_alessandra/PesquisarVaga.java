package pi_alessandra;

public class PesquisarVaga {

    // LISTA DE VAGAS POR PESQUISA
    static void psqVagas(int pesquisar) {
        int j = 0; // CONTADOR 
        for (int i = 0; i < Domestica.listaVagas.length; i++) {
            if (pesquisar == (i + 1)) {
                j++;
                System.out.println("ID da vaga: " + Domestica.listaVagas[i].id);
                System.out.println("    Localidade: " + Domestica.listaVagas[i].localVagas);
                System.out.println("    Detalhes da Vaga: " + Domestica.listaVagas[i].detalhesVagas);
                System.out.println("    Salário da diarista: " + Domestica.listaVagas[i].salarioDiaria);
                System.out.println("    Dias trabalhados: " + Domestica.listaVagas[i].diasTrabalho);
                System.out.println();
            } else if (Domestica.listaVagas[i] == null) {
                i = Domestica.listaVagas.length;
            }
        }
        if (j == 0) {
            System.out.println("Vaga não encontrada");
        } else {
            ListarVaga.subMenuVagas();
        }
    }

    //MENU PESQUISA
    static void menuPesquisar() {
        System.out.print("\n----------------Pesquisar-----------------\n");
        System.out.println("        (1) - Por ID");
        System.out.println("        (2) - Por categoria");
        System.out.println("        (3) - Por localidade");
        System.out.println("        (4) - Por dias de trabalho");
        System.out.print("------------------------------------------\n");
        Menu.validarOp();
        Domestica.auxiliarTeclado = ListarVaga.validarSubMenu();
    }

    //PESQUISAR POR ID DETALHES DA VAGA
    static void psqIdDetalhes(int idPsq) {
        boolean auxPsq = false;
        int j = 0;

        //VERIFICA SE OPÇÃO É VALIDA
        do {
            //LAÇO PARA BUSCAR POR ID
            if (((idPsq < 0) && (idPsq > Domestica.listaVagas.length)) || (Domestica.listaVagas == null)) {
                System.out.println("Valor inválido! Ou não existe vagas cadastrada com esse ID!");
                System.out.println("Digite o ID da vaga: ");
                idPsq = Domestica.entrada.nextInt();
            } else {
                auxPsq = true;
            }
        } while (auxPsq == false);

        auxPsq = false;
        //LAÇO PESQUISA VAGAS PELO ID
        for (int i = 0; i < Domestica.listaVagas.length; i++) {

            if (idPsq == Domestica.listaVagas[i].id) {
                System.out.print("------------------------------------------\n");
                System.out.println("ID da vaga: " + (Domestica.listaVagas[i].id));
                System.out.println("    Detalhes: " + Domestica.listaVagas[i].detalhesVagas);
                auxPsq = true;
                j++;
                i = Domestica.listaVagas.length;
            }
        }
        if (j == 0) {
            System.out.println("ID não encontrado!");
        }
    }

    //CONDIÇÃO OPÇÕES DE VAGAS
    static void casePsqVagas() {
        Domestica.auxiliarTeclado = ListarVaga.validarSubMenu();

        int opcaoInt; // VARIAVEL PARA O CASE
        switch (Domestica.auxiliarTeclado) {
            case 1:
                do {
                    System.out.println("Digite o ID: ");
                    opcaoInt = Domestica.entrada.nextInt();
                    //LAÇO PARA BUSCAR POR ID
                    if ((opcaoInt < 0) || (opcaoInt > Domestica.listaVagas.length)) {
                        System.out.println("Valor inválido! Ou não existe vagas cadastrada com esse ID");
                    }
                } while ((opcaoInt >= 0) && (opcaoInt <= 2));
                psqVagas(opcaoInt);
                break;

            case 2:
                System.out.println("Digite o ID: ");
                opcaoInt = Domestica.entrada.nextInt();
                do {
                    System.out.println("Digite o ID: ");
                    opcaoInt = Domestica.entrada.nextInt();
                    //LAÇO PARA BUSCAR POR ID
                    if ((opcaoInt < 0) || (opcaoInt > Domestica.listaVagas.length)) {
                        System.out.println("Valor inválido!");
                    } else if (Domestica.listaVagas[opcaoInt] == null) {
                        System.out.println("Não existe vaga cadastrado neste ID!");
                    }
                } while ((opcaoInt >= 0) && (opcaoInt <= 2));
                break;

            case 3:
                PesquisarVaga.menuPesquisar();
                break;

            default:
                System.out.println();

                break;
        }
    }
}
