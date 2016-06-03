package pi_alessandra;

import static pi_alessandra.Domestica.*;

public class Cadastro {

    static void cadastrarVagas() {
        System.out.printf("\n----------- Cadastro de vagas -----------\n\n");
        for (int i = 0; i < listaVagas.length; i++) {
            //Iinicializando a posição do vetor
            listaVagas[i] = new Vagas();
            //Esvazia a entrada
            entrada.nextLine();
            System.out.println("Você irá para o cadastro da " + (i + 1) + "º vaga");
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
        }
    }

}
