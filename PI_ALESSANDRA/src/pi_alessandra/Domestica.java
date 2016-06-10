package pi_alessandra;

import java.util.Scanner;

public class Domestica {

    // Variaveis Globais
    static Scanner entrada = new Scanner(System.in);
    static Vagas[] listaVagas = new Vagas[5];
    static String opcaoTeclado;

    static void imprimirRelatorio() {
        for (int i = 0; i < listaVagas.length; i++) {
            if (listaVagas[i] == null) {
                i = listaVagas.length;
            } else {
                System.out.println("Código da vaga: " + (listaVagas[i].id+1));
                System.out.println("Localidade: " + listaVagas[i].localVagas);
                System.out.println("Salário da diarista: " + listaVagas[i].salarioDiaristas);
                System.out.println("Dias trabalhados: " + listaVagas[i].diasTrabalhados);
                System.out.println("Detalhes da Vaga: " + listaVagas[i].detalhesVagas);
                System.out.println();
            }
        }
    }


    public static void main(String[] args) {

        boolean validarMenu = false;
        boolean flagValidaMenu;
        int auxiliarTeclado = 0;

        do {
            // Apresentação do menu
            Menu.getMenu();
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
                    Cadastro.cadastrarVagas();
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
                    AceitarVaga.aceitarVaga();
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


/*   EXEMPLO DE COMO DESPOPULAR O VETOR

 package teste;
 public class Teste {

 private static int[] vetor;

 public static void main(String[] args) {
 vetor = new int[]{1, 6, 3, 2, 5};
 remove(3);
 remove(6);
 for (int i = 0; i < vetor.length; i++) {
 System.out.println(vetor[i]);
 }
 }

 public static void remove(int y) {
 int[] vetorAux = new int[vetor.length - 1];
 int index = 0;
 for (int i = 0; i < vetor.length; i++) {
 if (vetor[i] != y) {
 vetorAux[index] = vetor[i];
 index++;
 }
 }
 vetor = vetorAux;
 }

 }
 */
