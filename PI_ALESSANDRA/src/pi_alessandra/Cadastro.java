package pi_alessandra;

public class Cadastro {

    static void cadastrarVagas() {
        // VARIAVEIS
        String opcaoS;
        boolean opcaoB = true, opcaoBAux, validaValor, validaDias, validaRegiao, validaCategoria;

        System.out.print("\n-----------------Cadastro-----------------\n");

        do {
            //LAÇO PARA CADASTRO DE VAGAS	
            for (int i = 3; ((opcaoB == true) && (i < Domestica.listaVagas.length)); i++) {

                //INICIALIZA A POSIÇÃO DO VETOR
                Domestica.listaVagas[i] = new DadosVagas();

                // INFORMAÇÕES DA VAGA
                System.out.print("------------------------------------------\n");
                //ADICONA O ID
                Domestica.listaVagas[i].id = 1 + i;
                //ESVAZIA A ENTRADA
                Domestica.entrada.nextLine();

                //INICIANDO INFORMAÇÕES DO CADASTRO DA VAGA                
                System.out.println("Cadastrando vaga ID: " + Domestica.listaVagas[i].id);  //INFORMA O ID DA VAGA              
                System.out.println("\nQual a categoria?"); //SOLICITA A CATEGORIA                
                //VALIDANDO SE OPÇÃO É VALIDA 
                do {
                    System.out.println("(Domestica / Pintor / Pedreiro / Eletricista)");
                    validaCategoria = false;
                    Domestica.listaVagas[i].categoria = Domestica.entrada.nextLine();
                    if ("DOMESTICA".equalsIgnoreCase(Domestica.listaVagas[i].categoria)) {
                        validaCategoria = true;
                    } else if ("PINTOR".equalsIgnoreCase(Domestica.listaVagas[i].categoria)) {
                        validaCategoria = true;
                    } else if ("PEDREIRO".equalsIgnoreCase(Domestica.listaVagas[i].categoria)) {
                        validaCategoria = true;
                    } else if ("ELETRICISTA".equalsIgnoreCase(Domestica.listaVagas[i].categoria)) {
                        validaCategoria = true;
                    } else {
                        System.out.println("Categoria Inválida.");
                    }
                } while (validaCategoria == false);
                
                //VALIDANDO SE OPÇÃO É VALIDA 
                do {
                    System.out.println("Qual a região? \n(CENTRO / LESTE / NORTE / OESTE / SUL)");
                    validaRegiao = false;
                    Domestica.listaVagas[i].localVagas = Domestica.entrada.nextLine();
                    if ("CENTRO".equalsIgnoreCase(Domestica.listaVagas[i].localVagas)) {
                        validaRegiao = true;
                    } else if ("LESTE".equalsIgnoreCase(Domestica.listaVagas[i].localVagas)) {
                        validaRegiao = true;
                    } else if ("NORTE".equalsIgnoreCase(Domestica.listaVagas[i].localVagas)) {
                        validaRegiao = true;
                    } else if ("OESTE".equalsIgnoreCase(Domestica.listaVagas[i].localVagas)) {
                        validaRegiao = true;
                    } else if ("SUL".equalsIgnoreCase(Domestica.listaVagas[i].localVagas)) {
                        validaRegiao = true;
                    } else {
                        System.out.println("Região Inválida.");
                    }
                } while (validaRegiao == false);
                //VALIDAR SE FOI DIGITADO UM VALOR MAIOR QUE 0
                do {
                System.out.println("Quanto será o valor da diaria?");//SOLICITA O SALARIO
                System.out.print("R$ ");                
                    validaValor = false;
                    Domestica.listaVagas[i].salarioDiaristas = Domestica.entrada.nextDouble();
                    if (Domestica.listaVagas[i].salarioDiaristas <= 0) {
                        System.out.println("Insira um valor maior que 0!");
                    } else {
                        validaValor = true;
                    }
                } while (validaValor == false);
                //ESVAZIA A ENTRADA
                Domestica.entrada.nextLine();
                System.out.println("Informe os detalhes da vaga?"); //SOLICITA OS DETALHES
                Domestica.listaVagas[i].detalhesVagas = Domestica.entrada.nextLine();

                System.out.println("Quantos dias serão trabalhados? (1 a 7)");
                //LAÇO VALIDA SE OPÇÂO FOI DIGITADO CORRETA OPÇÃO DIAS
                do {
                    validaDias = false;
                    Domestica.listaVagas[i].diasTrabalhados = Domestica.entrada.nextInt();
                    if (((Domestica.listaVagas[i].diasTrabalhados < 1) || (Domestica.listaVagas[i].diasTrabalhados > 7))) {
                        System.out.println("Valor inválido, digite um número entre 1 e 7");
                    } else {
                        validaDias = true;
                    }
                } while (validaDias == false);
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
