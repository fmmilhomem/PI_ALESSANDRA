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

            //Validando se opção escolhida existe no menu
            while ((aux != 1) && (aux != 2)) {
                //Se a opção escolhida não tive no menu, a mensagem pede para digitar novamente
                System.out.println("Opção inválida, tente novamente: ");
                aux = entrada.nextInt();
            }
            opcaoMenu = true; //Recebe valor verdadeiro após passar pela validação

        } while (opcaoMenu == false);
        
        //Caso 1 e 2 do menu
        switch (aux) {
            case 1:
                System.out.println("Lêr detalhes da vaga");
                break;
            default:
                System.out.println("Visualizar endereço para serviço");
        }
    }
}
