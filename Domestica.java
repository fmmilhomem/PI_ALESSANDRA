package pi_alessandra;

import java.util.Scanner;

public class Domestica {

    static int aux;
    static String vetorLocal[] = new String[1];
    static double vetorAuxNumero[] = new double[2];

    static Scanner entrada = new Scanner(System.in);

    static void mostrarMenu() {
        System.out.println();
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
        System.out.println("Quantos dias da semana precisará ser trabalhado?");//int= diasdeTrabalho;
        vetorAuxNumero[0] = entrada.nextDouble();

        System.out.println("Quanto deseja pagar para a diarista?"); //double=valorDiarista;
        vetorAuxNumero[1] = entrada.nextDouble();

        System.out.println("Qual a localidade?");
        vetorLocal[0] = entrada.nextLine();

    }

    static void metodoPrintf() {
        System.out.printf("\nA vaga está localizada em  " + vetorLocal[0]);
        System.out.printf("\nA vaga é para trabalhar  dias da semana " + vetorAuxNumero[0]);
        System.out.printf("\nO salário da empregada será de  " + vetorAuxNumero[1]);

    }

    public static void main(String[] args) {
        boolean opcaoMenu = false;
        

        // Apresentação 
        mostrarMenu();

        // Informar opção do menu acima
        System.out.print("Informe a opção do menu: ");
        aux = entrada.nextInt();

        // Verifica se a opção menu inicial é válida
        // 5 = numero maximo de opcoes do menu
        while ((aux > 5) || (aux < 1)) {
            System.out.println("Opção inválida, tente novamente: ");
            aux = entrada.nextInt();
        }
//Array - jasouCadastrado[i].length
        //Caso do menu
        switch (aux) {
            case 1:
                System.out.println("Cadastro de vagas:");
                switchCase1();
                // metodoPrintf();

                break;
            case 2:
                System.out.println("Relatório");
                //aqui entra o comando para gerar relatórios
                // COMO FAZER? QUE TIPO DE RELATORIO ?
                break;
            case 3:
                System.out.println("Lêr detalhes da vaga");
                //3.1 : Pesquisar a vaga 
                //criar case 1 e jogar aqui com localVaga
                String auxLocal;
                auxLocal = vetorLocal[0];

                break;

            case 4:
                System.out.println("Aceitar a vaga:");
                //4.1 : pesqisar a vaga 
                // procurar por localVaga case 1
                break;
            case 5:
                //Criar metodo para sair
                break;

        }
        System.out.println("Obrigado volte sempre!"); // Finalizando programa
    }
}
