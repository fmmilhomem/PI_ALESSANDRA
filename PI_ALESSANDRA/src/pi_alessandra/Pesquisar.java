package pi_alessandra;

public class Pesquisar {

    //VARIAVEL CONTADOR GLOBAL
    static int i, vagaSelecionada;

    //MENU PESQUISA
    static void menuPesquisar() {
        int j = 0;
        System.out.print("\n----------------Pesquisar-----------------\n");
        for (int i = 0; i < Domestica.listaVagas.length; i++) {
            if (Domestica.listaVagas[i] == null) {
                i = Domestica.listaVagas.length;
            } else {
                j++;
            }
        }
        if (j == 0) {
            System.out.println("Não existe vagas disponiveis!");
        } else {
            System.out.println("        (1) - Por ID");
            System.out.println("        (2) - Por categoria");
            System.out.println("        (3) - Por localidade");
            System.out.println("        (4) - Por dias de trabalho");
            System.out.println("        (0) - Voltar ao menu");
            System.out.print("------------------------------------------\n");
            //VALIDA MENU  
            validarSubPsq();
        }
    }

    //METODO VALIDAR E RETORNAR O VALOR
    static int validarSubPsq() {
        boolean validarSubPsq = false;
        // Verifica se a opção menu inicial é válida - 1 até 4 = São as opções do menu 
        do {
            Menu.validarOp();
            if (Domestica.auxiliarTeclado < 0 || Domestica.auxiliarTeclado > 4) {
                System.out.println("\nOpção inválida, tente novamente! (0 até 4)");
            } else {
                casePsqVagas();
                validarSubPsq = true;
            }
        } while (validarSubPsq == false);
        return Domestica.auxiliarTeclado;
    }

    //VALIDAR CASE ID
    static int validarCaseId() {
        boolean auxCase = false;

        //VALIDA SE O VALOR DIGITADO É NUMERICO
        do {
            //VALIDA SE DIGITOU NUMERO
            try {
                System.out.print("Digite o ID ou (C)Cancelar: ");
                Domestica.opcaoTeclado = Domestica.entrada.next();
                if ("C".equalsIgnoreCase(Domestica.opcaoTeclado)) {
                    auxCase = true;
                    Domestica.auxiliarTeclado = 0;
                } else {
                    Domestica.auxiliarTeclado = Integer.parseInt(Domestica.opcaoTeclado);
                    if ((Domestica.auxiliarTeclado < 1) || (Domestica.auxiliarTeclado > 10)) {
                        System.out.println("ID Inválido");
                    } else if (Domestica.listaVagas[Domestica.auxiliarTeclado - 1] == null) { //(-1) para encontrar a posição do ID. ID Inicia apartir de 1
                        System.out.println("Vaga com esse ID não esta cadastrada");
                    } else {
                        auxCase = true;
                    }
                }
            } catch (Exception error) {
                //VERIFICA SE O USUARIO DIGIOU LETRA, RETORNA PARA O MENU E PEDE QUE DIGITE UM NUMERO
                System.out.println("Valor Inválido!");
            }
        } while ((auxCase == false));

        return Domestica.auxiliarTeclado;
    }

    //VALIDAR CASE DIA
    static int validarCaseDia() {
        boolean auxCase = false;
        int opcaoInt;
        //ESVAZIAR ENTRADA
        Domestica.entrada.nextLine();
        //LAÇO VALIDADE CASE DE DIAS TRABALHO
        do {
            System.out.print("Digite a quantidade de dias que deseja de (1 a 7): ");
            opcaoInt = Domestica.entrada.nextInt();
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
                if (opcaoInt == 0) {
                    menuPesquisar();
                } else {                    
                    psqId(opcaoInt);
                }
                break;
            case 2:
                psqCategoria();
                menuPesquisar();
                break;
            case 3:
                psqLocal();
                menuPesquisar();
                break;
            case 4:
                opcaoInt = validarCaseDia();
                psqDia(opcaoInt);
                menuPesquisar();
                break;
            default:
                System.out.println();
        }
    }

    //PESQUISA POR ID - TRATAR ERRO CARACTER
    static void psqId(int pesquisar) {

        //LAÇO BUSCAR 
        int j = 0; // CONTADOR 

        for (i = 0; i < Domestica.listaVagas.length; i++) {

            if (Domestica.listaVagas[i] == null) {
                i = Domestica.listaVagas.length;
            } else if (pesquisar == Domestica.listaVagas[i].id) {
                j++;
                vagaSelecionada = i;
                imprimirPesquisa();
                AceitarVaga.aceitarVagaPsqId();
            }
        }
        if (j == 0) {
            System.out.println("Vaga não encontrada com este ID");
        }
    }

    //PESQUISA POR CATEGORIA
    static void psqCategoria() {
        int j = 0; // CONTADOR 
        String pesquisar;
        //ESVAZIAR ENTRADA
        Domestica.entrada.nextLine();
        System.out.println("\nCategorias - (Domestica / Pintor / Pedreiro / Eletrica)");
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
        } else {
            AceitarVaga.aceitarVagaPsqString();
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
            System.out.println("Vagas não encontradas, com esta região.");
        } else {
            AceitarVaga.aceitarVagaPsqString();
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
            AceitarVaga.aceitarVagaPsqId();
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
