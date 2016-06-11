package pi_alessandra;

public class Cadastro {

    public static void cadastrarVagas() {
        // VARIAVEIS
        String opcaoS = "";
        boolean opcaoB = true, opcaoBAux;

        System.out.print("\n-----------------Cadastro-----------------\n");

        do {
            //LAÇO PARA CADASTRO DE VAGAS	
            for (int i = 0; ((opcaoB == true) && (i < Domestica.listaVagas.length)); i++) {
                             
                //INICIALIZA A POSIÇÃO DO VETOR
                Domestica.listaVagas[i] = new DadosVagas();
                
                //ADICONA 
                Domestica.listaVagas[i].id = 1 + i; //= Domestica.listaVagas[i].id + 1;

                // INFORMAÇÕES DA VAGA
                System.out.print("------------------------------------------\n");

                //ESVAZIA A ENTRADA
                Domestica.entrada.nextLine();                
                
                //INICIANDO INFORMAÇÕES DO CADASTRO DA VAGA                
                System.out.println("Cadastrando vaga ID: " + Domestica.listaVagas[i].id);  //INFORMA O ID DA VAGA              
                System.out.println("\nQual a categoria?"); //SOLICITA A CATEGORIA
                System.out.println("Domestica / Pintor / Pedreiro / Eletrica");
                Domestica.listaVagas[i].categoria = Domestica.entrada.nextLine();   
                System.out.println("Qual a localidade?");
                Domestica.listaVagas[i].localVagas = Domestica.entrada.nextLine();
                System.out.println("Quanto será o salário da diaria?");//SOLICITA O SALARIO
                Domestica.listaVagas[i].salarioDiaristas = Domestica.entrada.nextDouble();
                //ESVAZIA A ENTRADA
                Domestica.entrada.nextLine();
                System.out.println("Informe os detalhes da vaga?"); //SOLICITA OS DETALHES
                Domestica.listaVagas[i].detalhesVagas = Domestica.entrada.nextLine();
                System.out.println("Quantos dias serão trabalhados? (1 a 7)"); //SOLICITA O LOCAL
                Domestica.listaVagas[i].diasTrabalhados = Domestica.entrada.nextInt();
                // VALIDA SE FOR MAIOR QUE 7 E MENOR QUE 1 DIA
                while ((Domestica.listaVagas[i].diasTrabalhados < 1) || (Domestica.listaVagas[i].diasTrabalhados > 7)) {
                    System.out.println("Valor inválido, digite um número entre 1 e 7");
                    System.out.println("Quantos dias serão trabalhados?");
                    Domestica.listaVagas[i].diasTrabalhados = Domestica.entrada.nextInt();
                }

                System.out.println("------------------------------------------");
                System.out.print("!Vaga cadastrada com sucesso!");
                System.out.print("\n------------------------------------------");

                System.out.println("\nDeseja cadastrar nova vaga? (S / N)");
                // LAÇO PARA VERIFICAR A OPÇÕES E SE OPÇÕES FORAM DIGITAS CORRETAS 
                opcaoBAux = true;
                do {
                    opcaoS = Domestica.entrada.next();
                    if ("s".equalsIgnoreCase(opcaoS)) {
                        opcaoBAux = false; // SAIR DO LAÇO
                    } else if ("n".equalsIgnoreCase(opcaoS)) {
                        System.out.print("------------------------------------------\n");
                        System.out.println("Cadastro Finalizado!");
                        opcaoBAux = false; // SAIR DO LAÇO
                        opcaoB = false; // SAIR DO MENU CADASTRO
                        i = 0;
                    } else {
                        System.out.print("Opção inválida! Tente novamente: ");
                    }
                } while (opcaoBAux == true);
            }
        } while (opcaoB == true);
    }
}
