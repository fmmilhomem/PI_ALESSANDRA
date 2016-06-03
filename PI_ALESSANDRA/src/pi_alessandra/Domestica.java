package pi_alessandra;

import java.util.Scanner;

public class Domestica {

    // Variaveis Globais
    static Scanner entrada = new Scanner(System.in);
    static Vagas[] listaVagas = new Vagas[2];

    static void imprimirRelatorio() {

        for (int i = 0; i < listaVagas.length; i++) {
            System.out.println("Localidade: " + listaVagas[i].localVagas);
            System.out.println("Salário da diarista: " + listaVagas[i].salarioDiaristas);
            System.out.println("Dias trabalhados: " + listaVagas[i].diasTrabalhados);
            System.out.println("Detalhes da Vaga: " + listaVagas[i].detalhesVagas);
        }
    }
    
    static void getMenu() {
        System.out.print("\n---------- Menu -------------\n");
        System.out.println(" 1 - Cadastro de vagas:");
        System.out.println(" 2 - Relatório");
        System.out.println(" 3 - Lêr detalhes da vaga");
        System.out.println(" 4 - Aceitar a vaga");// precisa elaborar algoritmo
        System.out.println(" 5 - Sair "); //precisa elaborar algoritmo
        System.out.print("-----------------------------\n");
    }

    public static void main(String[] args) {

        boolean validarMenu = false;
        boolean flagValidaMenu, auxCase = false;
        String opcaoTeclado;
        int auxiliarTeclado = 0;        

        do {
            // Apresentação do menu
            getMenu();            
            flagValidaMenu = false;
            while (flagValidaMenu == false) {
                //VALIDA SE DIGITOU ENTRE 1 E 5
                try {
                    System.out.print("Informe uma opção do menu: ");
                    opcaoTeclado = entrada.next();
                    auxiliarTeclado = Integer.parseInt(opcaoTeclado);
                    flagValidaMenu = true;
                } catch (Exception error) {
                    //VERIFICA SE O USUARIO DIGIOU LETRA, RETORNA PARA O MENU E PEDE QUE DIGITE UM NUMERO
                    System.out.println("Valor Inválido!");
                }
            }

            // Verifica se a opção menu inicial é válida - 1 até 5 = São as opções do menu 
            while ((auxiliarTeclado > 5) || (auxiliarTeclado < 1)) {
                System.out.printf("\nOpção inválida, tente novamente: ");

                try {
                    opcaoTeclado = entrada.next();
                    auxiliarTeclado = Integer.parseInt(opcaoTeclado);

                } catch (Exception error) {
                    //VERIFICA SE O USUARIO DIGIOU LETRA, RETORNA PARA O MENU E PEDE QUE DIGITE UM NUMERO
                    System.out.println("Valor Inválido!");
                }
            }

            switch (auxiliarTeclado) {
                case 1:
                    Cadastro.cadastro();
                    break;
                case 2:
                    System.out.printf("\n----------- Relatório -----------\n\n");
                    imprimirRelatorio();
                    break;

                case 3:
                    System.out.printf("\n----------- Lêr detalhes da vaga -----------\n\n");
                    for (int i = 0; i < listaVagas.length; i++) {
                        System.out.println("--Detalhe da vaga: " + listaVagas[i].detalhesVagas);
                    }
                    break;

                case 4:
                    System.out.printf("\n----------- Aceitar a vaga -----------\n\n");                    
                    imprimirRelatorio();
                    System.out.print("Deseja aceitar a vaga? ");
                    
                    do {
                        System.out.println("S para SIM ou N para NÃO");
                        opcaoTeclado = entrada.next();

                        if ((opcaoTeclado.equalsIgnoreCase("S") || (opcaoTeclado.equalsIgnoreCase("N")))) {
                            if (opcaoTeclado.equalsIgnoreCase("S")) {
                                System.out.println("A vaga está aceita!");
                                auxCase = true;
                            } else {
                                System.out.println("A vaga não está aceita!");
                            }
                        } else {
                            System.out.println("Caractere inválido, favor tente de novo!");
                        }
                    } while (auxCase == false);

                    break;
                case 5:
                    validarMenu = true;
                    break;

                default:
                    System.out.println("Valor Inválido, favor digita um número entre 1 e 5");
                    break;
            }
        } while (validarMenu == false);
        System.out.printf("\nObrigado volte sempre!\n"); // Finalizando programa
    }
}
