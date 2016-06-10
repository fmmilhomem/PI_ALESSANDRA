package pi_alessandra;

import static pi_alessandra.Domestica.*;

public class Cadastro_old {

    static void cadastrarVagas1() {
        /**boolean opcaoB = true, opcaoBAux;
        
        System.out.printf("\n----------- Cadastro de vagas -----------\n\n");
        
        for (int i = 0; i < listaVagas.length; i++) {
            //Iinicializando a posição do vetor
            listaVagas[i] = new Vagas();
            //Esvazia a entrada
            entrada.nextLine();
            System.out.println("Código da " + (i + 1) + "º vaga");
            listaVagas[i].id = i;
            System.out.println("\nQual a localidade da " + (i + 1) + "º vaga?");
            listaVagas[i].localVagas = entrada.nextLine();
            System.out.println("Quanto será o salário da diarista?");
            listaVagas[i].salarioDiaristas = entrada.nextDouble();
            System.out.println("Informe um detalhe da vaga? (Procure utilizar palavras chave)");
            listaVagas[i].detalhesVagas = entrada.nextLine();
            //Esvazia a entrada
            entrada.nextLine();

            System.out.println("Quantos dias serão trabalhados?");
            listaVagas[i].diasTrabalhados = entrada.nextByte();
            System.out.println();
            // Valida dias trabalhados for maiaor que 7
            while ((listaVagas[i].diasTrabalhados > 7) || (listaVagas[i].diasTrabalhados < 1)) {
                System.out.println("Valor inválido, digite um número entre 1 e 7");
                System.out.println("Quantos dias serão trabalhados?");
                listaVagas[i].diasTrabalhados = entrada.nextByte();
            }
            opcaoBAux = true;
            do {
                opcaoS = Bar.entrada.next();
                if ("s".equalsIgnoreCase(opcaoS)) {
                    opcaoBAux = false; // SAIR DO LAÇO
                } else if ("n".equalsIgnoreCase(opcaoS)) {
                    System.out.print("\n--------------------------------------------\n");
                    System.out.println("Cadastro Finalizado!");
                    opcaoB = false; // SAIR DO MENU CADASTRO
                    opcaoBAux = false; // SAIR DO LAÇO
                } else {
                    System.out.print("Opção inválida! Tente novamente: ");
                }
            } while (opcaoBAux == true);
        }*/
    }
}
