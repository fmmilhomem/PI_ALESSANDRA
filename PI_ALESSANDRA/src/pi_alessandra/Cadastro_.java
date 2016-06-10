package pi_alessandra;

import static pi_alessandra.Domestica.*;

public class Cadastro_ {

    public static void cadastrarVagas() {
        // VARIAVEIS
        String opcaoS = "";
        boolean opcaoB = true, opcaoBAux;

        System.out.println("------------Cadastro de produtos------------");

        do {
            //LA�O PARA CADASTRO DE PRODUTO	
            for (int i = 0; opcaoB == true; i++) {
                // LAÇO PARA VERIFICAR ONDE PAROU O CADASTRO
                for (int j = 0; j < listaVagas.length; j++) {
                    if (listaVagas[j] == null) {
                        i = j;
                        break;
                    }
                }

                listaVagas[i] = new Vagas(); // INICIALIZA A POSIÇÃO DO VETOR

                // INFORMAÇÕES DO PRODUTO
                System.out.print("--------------------------------------------");

                //Esvazia a entrada
                entrada.nextLine();
                System.out.println("\nID da " + (i + 1) + "º vaga");
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

                System.out.print("\n--------------------------------------------");
                System.out.print("\nProduto cadastrado com sucesso!");
                System.out.print("\n\n--------------------------------------------");

                System.out.println("\nDeseja cadastrar novo produto? (S / N)");
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
