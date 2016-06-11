package pi_alessandra;

public class Pesquisar {

    //VARIAVEL CONTADOR GLOBAL
    static int i;

    //MENU PESQUISA
    static void menuPesquisar() {
        System.out.print("\n----------------Pesquisar-----------------\n");
        System.out.println("        (1) - Por ID");
        System.out.println("        (2) - Por categoria");
        System.out.println("        (3) - Por localidade");
        System.out.println("        (4) - Por dias de trabalho");
        System.out.println("        (0) - Voltar ao menu");
        System.out.print("------------------------------------------\n");
        Menu.validarOp();
        Domestica.auxiliarTeclado = validarSubPsq();
        casePsqVagas();
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

    //VALIDAR CASE ID
    static int validarCaseId() {
        boolean auxCase = false;
        int opcaoInt;

        do {
            System.out.print("Digite o ID: ");
            opcaoInt = Domestica.entrada.nextInt();
            if ((opcaoInt < 1) || (opcaoInt > 10) || (Domestica.listaVagas[opcaoInt - 1] == null)) {
                System.out.println("ID Inválido, ou não existe vaga cadastrada com esse ID.");
            } else {
                auxCase = true;
            }
        } while (auxCase == false);
        return opcaoInt;
    }

    //VALIDAR CASE DIA
    static int validarCaseDia() {
        boolean auxCase = false;
        int opcaoInt;
        //ESVAZIAR ENTRADA
        Domestica.entrada.nextLine();

        do {
            System.out.print("Digite a quantidade de dias que deseja de (1 a 7): ");

            opcaoInt = Domestica.entrada.nextByte();
            // VALIDA SE FOR MAIOR QUE 7 E MENOR QUE 1 DIA
            if ((opcaoInt < 1) || (opcaoInt > 7)) {
                System.out.println("Valor inválido, digite um número entre 1 e 7");
            } else {
                auxCase = true;
            }
        } while (auxCase == false);
        return opcaoInt;
    }

    //CASE SUBMENU PESQUISAR
    static void casePsqVagas() {
        // VARIAVEL PARA O CASE
        int opcaoInt = 0;

        // SWITCH CASE
        switch (Domestica.auxiliarTeclado) {
            case 1:
                //LAÇO PARA BUSCAR POR ID
                opcaoInt = validarCaseId();
                psqId(opcaoInt);
                break;
            case 2:
                psqCategoria();
                break;
            case 3:
                psqLocal();
                break;
            case 4:
                opcaoInt = validarCaseDia();
                psqDia(opcaoInt);
                break;
            default:
                System.out.println();
                break;
        }
    }

    //PESQUISA POR ID - TRATAR ERRO CARACTER
    static void psqId(int pesquisar) {
        int j = 0; // CONTADOR 

        for (i = 0; i < Domestica.listaVagas.length; i++) {

            if (Domestica.listaVagas[i] == null) {
                i = Domestica.listaVagas.length;
            } else if (pesquisar == Domestica.listaVagas[i].id) {
                j++;
                imprimirPesquisa();
            }
        }
        if (j == 0) {
            System.out.println("Vaga não encontrada");
        } else {
            //AceitarVaga;
        }
    }

    //PESQUISA POR CATEGORIA
    static void psqCategoria() {
        int j = 0; // CONTADOR 
        String pesquisar;
        //ESVAZIAR ENTRADA
        Domestica.entrada.nextLine();

        System.out.print("Digite a categoria: ");
        pesquisar = Domestica.entrada.nextLine();

        for (i = 0; i < Domestica.listaVagas.length; i++) {
            if (Domestica.listaVagas[i] == null) {
                i = Domestica.listaVagas.length;
            } else if (Domestica.listaVagas[i].categoria.equalsIgnoreCase(pesquisar)) {
                j++;
                imprimirPesquisa();
            }
        }
        if (j == 0) {
            System.out.println("Vagas não encontradas, com esta categoria.");
        }
    }

    //PESQUISA POR LOCALIDADE
    static void psqLocal() {
        int j = 0; // CONTADOR 
        String pesquisar;
        //ESVAZIAR ENTRADA
        Domestica.entrada.nextLine();

        System.out.print("Informe a região que deseja: ");
        pesquisar = Domestica.entrada.nextLine();

        for (i = 0; i < Domestica.listaVagas.length; i++) {
            if (Domestica.listaVagas[i] == null) {
                i = Domestica.listaVagas.length;
            } else if (Domestica.listaVagas[i].localVagas.equalsIgnoreCase(pesquisar)) {
                j++;
                imprimirPesquisa();
            }
        }
        if (j == 0) {
            System.out.println("Vagas não encontradas, com esta categoria.");
        } else {
            //AceitarVaga;
        }
    }

    //PESQUISA POR DIAS TRABALHOS - TRATAR ERRO CARACTER
    static void psqDia(int pesquisar) {
        int j = 0; // CONTADOR 

        for (i = 0; i < Domestica.listaVagas.length; i++) {

            if (Domestica.listaVagas[i] == null) {
                i = Domestica.listaVagas.length;
            } else if (pesquisar == Domestica.listaVagas[i].diasTrabalhados) {
                j++;
                imprimirPesquisa();
            }
        }
        if (j == 0) {
            System.out.println("Vaga não encontrada");
        } else {
            //AceitarVaga;
        }
    }

    //METODO EM QUE IMPRIME A VAGA QUE FOI BUSCADA
    static void imprimirPesquisa() {

        System.out.println();
        System.out.println("ID da vaga: " + (Domestica.listaVagas[i].id));
        System.out.println("    Categoria: " + Domestica.listaVagas[i].categoria);
        System.out.println("    Localidade: " + Domestica.listaVagas[i].localVagas);
        System.out.println("    Detalhes da Vaga: " + Domestica.listaVagas[i].detalhesVagas);
        System.out.println("    Salário da diária: " + Domestica.listaVagas[i].salarioDiaristas);
        System.out.println("    Dias trabalhados: " + Domestica.listaVagas[i].diasTrabalhados);

    }
}
