package pi_alessandra;

import java.util.Scanner;

public class Domestica {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        boolean opcaoMenu = false;
        int aux;

        // Apresentação 
        System.out.println(" -- Vagas -- ");
        System.out.println(" 1 - Lista de vagas diárias ");
        System.out.println(" 2 - Sair ");

        // Informar opção do menu acima
        System.out.print("Informe a opção do menu: ");
        aux = entrada.nextInt();
        
        // Verifica se a opção menu inicial é válida
        while ((aux != 1) && (aux != 2)) {
            System.out.println("Opção inválida, tente novamente: ");
            aux = entrada.nextInt();
        }
        
        // Se var for igual a 1 faça o seguinte abaixo senão finaliza o programa
        if (aux == 1) {
            // Validando submenu
            do {
                System.out.println();
                System.out.println(" 1 - Lêr detalhes da vaga");
                System.out.println(" 2 - Visualizar endereço para serviço");

                // Informa o que deseja do submenu
                System.out.print("Informe a opção do menu: ");
                aux = entrada.nextInt();

                // Validando se opção escolhida existe no submenu
                while ((aux != 1) && (aux != 2)) {
                    // Se a opção escolhida não tive no submenu, a mensagem pede para digitar novamente
                    System.out.println("Opção inválida, tente novamente: ");
                    aux = entrada.nextInt();
                }
                opcaoMenu = true; //Recebe valor verdadeiro após passar pela validação

            } while (opcaoMenu == false);

            //Caso 1 e 2 do submenu
            switch (aux) {
                case 1:
                    System.out.println("Lêr detalhes da vaga");
                    break;
                default:
                    System.out.println("Visualizar endereço para serviço");
            }
        }
        System.out.println();
        System.out.println("Obrigado volte sempre!"); // Finalizando programa
    }
}