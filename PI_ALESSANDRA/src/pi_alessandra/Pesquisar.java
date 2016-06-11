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

    //VALIDAR CASE
    static int lacoValidarCase() {
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

    //CASE SUBMENU PESQUISAR
    static void casePsqVagas() {
        // VARIAVEL PARA O CASE
        int opcaoInt = 0;

        // SWITCH CASE
        switch (Domestica.auxiliarTeclado) {
            case 1:
                //LAÇO PARA BUSCAR POR ID
                opcaoInt = lacoValidarCase();
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

    //PESQUISA POR ID - TRATAR ERRO CARACTER
    static void psqId(int pesquisar) {
        int j = 0; // CONTADOR 

        for (int i = 0; i < Domestica.listaVagas.length; i++) {
            
            if (Domestica.listaVagas[i] == null) {
                i = Domestica.listaVagas.length;
            } else if (pesquisar == Domestica.listaVagas[i].id) {
                j++;
                System.out.println("ID da vaga: " + (Domestica.listaVagas[i].id));
                System.out.println("    Categoria: " + Domestica.listaVagas[i].categoria);
                System.out.println("    Detalhes da Vaga: " + Domestica.listaVagas[i].detalhesVagas);
                System.out.println("    Localidade: " + Domestica.listaVagas[i].localVagas);
                System.out.println();
            }
        }
        if (j == 0) {
            System.out.println("Vaga não encontrada");
        } else {
            ListarVagas.subMenuVagas();
        }
    }
    
    //FALTA CONECTAR NO CASE
    static void psqCategoria(String pesquisar) {
        int j = 0; // CONTADOR 

        for (int i = 0; i < Domestica.listaVagas.length; i++) {
            
            if (Domestica.listaVagas[i] == null) {
                i = Domestica.listaVagas.length;
            } else if (Domestica.listaVagas[i].categoria.equalsIgnoreCase(pesquisar)) {
                j++;
                System.out.println("ID da vaga: " + (Domestica.listaVagas[i].id));
                System.out.println("    Categoria: " + Domestica.listaVagas[i].categoria);
                System.out.println("    Detalhes da Vaga: " + Domestica.listaVagas[i].detalhesVagas);
                System.out.println("    Localidade: " + Domestica.listaVagas[i].localVagas);
                System.out.println();
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
