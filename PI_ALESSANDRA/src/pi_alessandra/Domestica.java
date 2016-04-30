package pi_alessandra;

import java.util.Scanner;

public class Domestica {

    /**
     * Este metodo exibe o menu principal
     */
    static void mostrarMenu() {
        System.out.printf("\n---------- Menu -------------\n\n");
        System.out.println(" 1 - Cadastro de vagas:");
        System.out.println(" 2 - Relatório");
        System.out.println(" 3 - Lêr detalhes da vaga");
        System.out.println(" 4 - Aceitar a vaga");// precisa elaborar algoritmo
        System.out.println(" 5 - Sair "); //precisa elaborar algoritmo
    }

    static String pesquisaVaga(String localVaga) {
        return localVaga;
    }

    static void switchCase1() {

        // aqui entra o comando para cadastrar a vaga
        i++;
        System.out.println("Qual a localidade?");
        vetorLocal[i] = entrada.next();
        System.out.println("Quantos dias da semana precisará ser trabalhado?");//int= diasdeTrabalho;
        vetorAuxDiaria[i] = entrada.nextInt();
        System.out.println("Quanto deseja pagar para a diarista?"); //double=valorDiarista;
        vetorAuxValor[i] = entrada.nextDouble();
        System.out.printf("\n--------- Cadastrado seguinte informações ------------\n\n");

    }

    static void metodoPrintf() {
        System.out.println("A vaga está localizada em  " + vetorLocal[i]);
        System.out.println("A vaga é para trabalhar " + vetorAuxDiaria[i] + " dias da semana ");
        System.out.println("O salário da empregada será de  " + vetorAuxValor[i]);

    }

    // Variavel para ler entrada do usuarios 
    static Scanner entrada = new Scanner(System.in);

    // Variaveis
    static int aux, i;
    static String auxS;
    static String vetorLocal[] = new String[10];
    static int vetorAuxDiaria[] = new int[10];
    static double vetorAuxValor[] = new double[10];

    //------------------------- Execução do programa -------------------------//
    public static void main(String[] args) {
        boolean validarMenu = false;

        while (validarMenu == false) {
            // Apresentação do menu
            mostrarMenu();

            // Informar opção do menu acima
            System.out.printf("\nInforme a opção do menu: ");
            aux = entrada.nextInt();

            // Verifica se a opção menu inicial é válida - 1 até 5 = São as opções do menu 
            while ((aux > 5) || (aux < 1)) {
                System.out.printf("\nOpção inválida, tente novamente: ");
                aux = entrada.nextInt();
            }
            //Array - jasouCadastrado[i].length
            //Caso do menu
            switch (aux) {
                case 1:
                    System.out.printf("\n----------- Cadastro de vagas -----------\n\n");
                        i++;
                        switchCase1();
                        metodoPrintf();
                    break;

                case 2:
                    System.out.printf("\n----------- Relatório -----------\n\n");
                    //aqui entra o comando para gerar relatórios
                    // COMO FAZER? QUE TIPO DE RELATORIO ?
                    break;
                case 3:
                    System.out.printf("\n----------- Lêr detalhes da vaga -----------\n\n");
                    //3.1 : Pesquisar a vaga 
                    //criar case 1 e jogar aqui com localVaga
                    String auxLocal;
                    auxLocal = vetorLocal[0];

                    break;

                case 4:
                    System.out.printf("\n----------- Aceitar a vaga -----------\n\n");
                    //4.1 : pesqisar a vaga 
                    // procurar por localVaga case 1
                    break;
                default:
                    //Criar metodo para sair
                    validarMenu = true;
                    break;
            }
        }
        System.out.printf("\nObrigado volte sempre!\n"); // Finalizando programa
    }
}
