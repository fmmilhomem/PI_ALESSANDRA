package pi_alessandra;

import java.util.Scanner;

public class Domestica {

    static Scanner entrada = new Scanner(System.in);

    static void getMenu() {
        System.out.printf("\n---------- Menu -------------\n\n");
        System.out.println(" 1 - Cadastro de vagas:");
        System.out.println(" 2 - Relatório");
        System.out.println(" 3 - Lêr detalhes da vaga");
        System.out.println(" 4 - Aceitar a vaga");// precisa elaborar algoritmo
        System.out.println(" 5 - Sair "); //precisa elaborar algoritmo
    }

    public static void main(String[] args) {

        boolean validarMenu = false;
        boolean flagValidaMenu = false;
        String opTeclado;
        String opcaoTeclado;
        int auxiliarTeclado = -1;

        Vagas[] listaVagas;
        listaVagas = new Vagas[1];

        while (validarMenu == false) {
            // Apresentação do menu
            getMenu();
            flagValidaMenu = false;
            while (flagValidaMenu == false) {
                //VALIDA SE DIGITOU ENTRE 1 E 5
                try {
                    System.out.println("Informe uma opção do menu:");
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
                    System.out.printf("\n----------- Cadastro de vagas -----------\n\n");
                    for (int i = 0; i < listaVagas.length; i++) {
                        //Iinicializando a posição do vetor
                        listaVagas[i] = new Vagas();
                        //Esvazia a entrada
                        entrada.nextLine();

                        System.out.println("Qual a localidade?");
                        listaVagas[i].localVagas = entrada.nextLine();

                        System.out.println("Quanto será o salário da diarista?");
                        listaVagas[i].salarioDiaristas = entrada.nextDouble();

                        System.out.println("Informe um detalhe da vaga? (Procure utilizar palavras chave)");
                        listaVagas[i].detalhesVagas = entrada.next();
                        //Esvazia a entrada
                        entrada.nextLine();

                        System.out.println("Quantos dias serão trabalhados?");
                        listaVagas[i].diasTrabalhados = entrada.nextByte();
                        // Valida dias trabalhados for maiaor que 7
                        while ((listaVagas[i].diasTrabalhados > 7) || (listaVagas[i].diasTrabalhados < 1)) {
                            System.out.println("Valor inválido, digite um número entre 1 e 7");
                            System.out.println("Quantos dias serão trabalhados?");
                            listaVagas[i].diasTrabalhados = entrada.nextByte();
                        }
                    }
                    break;

                case 2:
                    System.out.printf("\n----------- Relatório -----------\n\n");
                    for (int i = 0; i < listaVagas.length; i++) {

                        System.out.println("Localidade: " + listaVagas[i].localVagas);
                        System.out.println("Salário da diarista: " + listaVagas[i].salarioDiaristas);
                        System.out.println("Dias trabalhados: " + listaVagas[i].diasTrabalhados);
                        System.out.println("Detalhes da Vaga: " + listaVagas[i].detalhesVagas);
                    }
                    break;

                case 3:
                    System.out.printf("\n----------- Lêr detalhes da vaga -----------\n\n");
                    for (int i = 0; i < listaVagas.length; i++) {
                        System.out.println("Detalhe da vaga: " + listaVagas[i].detalhesVagas);
                    }
                    break;

                case 4:
                    System.out.printf("\n----------- Aceitar a vaga -----------\n\n");

                    for (int i = 0; i < listaVagas.length; i++) {

                        System.out.println("Localidade: " + listaVagas[i].localVagas);
                        System.out.println("Salário da diarista: " + listaVagas[i].salarioDiaristas);
                        System.out.println("Dias trabalhados: " + listaVagas[i].diasTrabalhados);
                        System.out.println("Detalhes das Vagas: " + listaVagas[i].detalhesVagas);
                    }

                    System.out.print("Deseja aceitar a vaga? ");
                    System.out.println("S para SIM ou N para NÃO");

                    opTeclado = entrada.next();
                    if ((opTeclado.equalsIgnoreCase("S") || (opTeclado.equalsIgnoreCase("N")))) {

                        if (opTeclado.equalsIgnoreCase("S")) {
                            System.out.println("A vaga está aceita!");

                        } else {
                            System.out.println("A vaga não está aceita!");
                        }

                    } else {
                        do {
                            System.out.println("Caractere inválido, favor digitar: ");
                            opTeclado = entrada.next();
                        } while ((opTeclado.equalsIgnoreCase("S")) || (opTeclado.equalsIgnoreCase("N")));
                    }

                    break;
                case 5:
                    validarMenu = true;
                    break;

                default:
                    System.out.println("Valor Inválido, favor digita um número entre 1 e 5");
                    break;
            }
        }
        System.out.printf("\nObrigado volte sempre!\n"); // Finalizando programa
    }
}
