package pi_alessandra;

import static pi_alessandra.Domestica.*;

public class Cadastro {

    public static void cadastrarVagas() {
        // VARIAVEIS
        String opcaoS = "";
        boolean opcaoB = true, opcaoBAux;

        System.out.println("------------Cadastro------------");

        do {
            //LAÇO PARA CADASTRO DE VAGAS	
            for (int i = 0; opcaoB == true; i++) {
                // LAÇO PARA VERIFICAR ONDE PAROU O CADASTRO
                for (int j = 0; j < listaVagas.length; j++) {
                    if (listaVagas[j] == null) {
                        i = j;
                        break;
                    }
                }

                listaVagas[i] = new Vagas(); // INICIALIZA A POSIÇÃO DO VETOR

                // INFORMAÇÕES DA VAGA
                System.out.print("--------------------------------------------");

                //ESVAZIA A ENTRADA
                entrada.nextLine();
                System.out.println("\nID da " + (i + 1) + "º vaga");
                listaVagas[i].id = i;
                System.out.println("\nQual a localidade da " + (i + 1) + "º vaga?");
                listaVagas[i].localVagas = entrada.nextLine();
                System.out.println("Quanto será o salário da diarista?");
                listaVagas[i].salarioDiaristas = entrada.nextDouble();
                System.out.println("Informe um detalhe da vaga? (Procure utilizar palavras chave)");
                listaVagas[i].detalhesVagas = entrada.nextLine();
                //ESVAZIA A ENTRADA
                entrada.nextLine();
                System.out.println("Quantos dias serão trabalhados?");
                listaVagas[i].diasTrabalhados = entrada.nextByte();
                System.out.println();
                // VALIDA SE FOR MAIOR QUE 7 E MENOR QUE 1 DIA
                while ((listaVagas[i].diasTrabalhados > 7) || (listaVagas[i].diasTrabalhados < 1)) {
                    System.out.println("Valor inválido, digite um número entre 1 e 7");
                    System.out.println("Quantos dias serão trabalhados?");
                    listaVagas[i].diasTrabalhados = entrada.nextByte();
                }

                System.out.print("\n--------------------------------------------");
                System.out.print("\nVaga cadastrada com sucesso!");
                System.out.print("\n\n--------------------------------------------");

                System.out.println("\nDeseja cadastrar nova vaga? (S / N)");
                // LAÇO PARA VERIFICAR A OPÇÕES E SE OPÇÕES FORAM DIGITAS CORRETAS 
                opcaoBAux = true;
                do {
                    opcaoS = entrada.next();
                    if ("s".equalsIgnoreCase(opcaoS)) {
                        opcaoBAux = false; // SAIR DO LAÇO
                    } else if ("n".equalsIgnoreCase(opcaoS)) {
                        System.out.print("\n--------------------------------------------\n");
                        System.out.println("Cadastro Finalizado!");
                        opcaoB = false; // SAIR DO MENU CADASTRO
                        opcaoBAux = false; // SAIR DO LAÇO
                        i = 0;
                    } else {
                        System.out.print("Opção inválida! Tente novamente: ");
                    }
                } while (opcaoBAux == true);
            }
        } while (opcaoB == true);
    }
}
