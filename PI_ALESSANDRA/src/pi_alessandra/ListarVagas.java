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
        //VALIDA METODO        
        Menu.validarOp();        
        ListarVagas.CaseSubMenuVagas();
    }
    
    //METODO VALIDAR E RETORNAR O VALOR
    static int validarSubMenu() {
        // Verifica se a opção menu inicial é válida - 1 até 5 = São as opções do menu 
        while ((Domestica.auxiliarTeclado < 1) || (Domestica.auxiliarTeclado > 2)) {
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
    
    //CRIA OPÇÃO MENU DENTRO SUBMENU
    static void CaseSubMenuVagas() {
        Domestica.auxiliarTeclado = ListarVagas.validarSubMenu();

        int opcaoInt; // VARIAVEL PARA O CASE
        switch (Domestica.auxiliarTeclado) {
            case 1:
                System.out.print("Digite o ID da vaga: ");
                opcaoInt = Domestica.entrada.nextInt();
                break;
            case 2:
                System.out.print("Digite o ID da vaga: ");
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
}
