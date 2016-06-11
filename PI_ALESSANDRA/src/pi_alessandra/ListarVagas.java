package pi_alessandra;

public class ListarVagas {

    //LISTA VAGAS CADASTRADAS
    static void imprimirVagas() {
        System.out.printf("\n------------------Vagas-------------------\n");
        int j = 0; // CONTADOR 
        for (int i = 0; i < Domestica.listaVagas.length; i++) {
            if (Domestica.listaVagas[i] == null) {
                i = Domestica.listaVagas.length;
            } else {
                j++;
                System.out.println();
                System.out.println("ID da vaga: " + (Domestica.listaVagas[i].id));
                System.out.println("    Categoria: " + Domestica.listaVagas[i].categoria);
                System.out.println("    Localidade: " + Domestica.listaVagas[i].localVagas);
                System.out.println("    Detalhes da Vaga: " + Domestica.listaVagas[i].detalhesVagas);
                System.out.println("    Salário da diária: " + Domestica.listaVagas[i].salarioDiaristas);
                System.out.println("    Dias trabalhados: " + Domestica.listaVagas[i].diasTrabalhados);
            }
        }
        if (j == 0) {
            System.out.println("Não existe vagas disponiveis!");
        } else {
            subMenuVagas();
        }
    }

    //EXIBE O SUBMENU - CASE 2 - 
    static void subMenuVagas() {
        System.out.print("\n----------------Menu Vagas----------------\n");
        System.out.println("(1) - Ler detalhes de uma vaga");
        System.out.println("(2) - Aceitar uma vaga");
        System.out.println("(0) - Voltar");
        //VALIDA METODO  
        CaseSubMenuVagas();
    }

    //METODO VALIDAR E RETORNAR O VALOR
    static int validarSubMenu() {
        do {
        // Verifica se a opção menu inicial é válida - 0 até 2 = São as opções do menu 
            Menu.validarOp();
            if ((Domestica.auxiliarTeclado < 0) || (Domestica.auxiliarTeclado > 2)) {
                System.out.println("Opção de 0 a 2!");
            }
        } while ((Domestica.auxiliarTeclado < 0) || (Domestica.auxiliarTeclado > 2));
        return Domestica.auxiliarTeclado;
    }

    //CRIA OPÇÃO MENU DENTRO SUBMENU
    static void CaseSubMenuVagas() {
        Domestica.auxiliarTeclado = validarSubMenu();
        
        int opcaoInt; // VARIAVEL PARA O CASE
        switch (Domestica.auxiliarTeclado) {
            case 1:
                opcaoInt = Pesquisar.validarCaseId();
                Pesquisar.psqId(opcaoInt);
                break;
            case 2:
                opcaoInt = Pesquisar.validarCaseId();
                Pesquisar.psqId(opcaoInt);
                break;
            default:
                System.out.println();
                break;
        }
    }
}
