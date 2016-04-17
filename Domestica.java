package pi_alessandra;

import java.util.Scanner;

public class Domestica {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        boolean opcaoMenu = false;
        int aux;
        do {
            System.out.println(" 1 - Lêr detalhes da vaga");
            System.out.println(" 2 - Visualizar endereço para serviço");
            // Informa o que deseja do menu
            System.out.println("Informe a opção do menu:");
            aux = entrada.nextInt();
            if ((aux == 1) || (aux == 2)) {
                opcaoMenu = true;
            } else {
                // Se numero digitado estivr fora do range retorna a msg e pede p digitar novamente
                System.out.println("Opção inválida, tente novamente");
                aux = entrada.nextInt();
            }   // Se numero digitado estiver no range cai no switch
        } while (opcaoMenu == false);
        switch (aux) {
            case 1:
                System.out.println("Lêr detalhes da vaga");
                break;
            case 2:
                System.out.println("Visualizar endereço para serviço");
                break;
        }
    }

}
