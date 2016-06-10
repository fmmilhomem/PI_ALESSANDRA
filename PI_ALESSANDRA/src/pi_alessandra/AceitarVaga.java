package pi_alessandra;

public class AceitarVaga {

    static void psqVagas(int pesquisar) {
        int j = 0; // CONTADOR 
        for (int i = 0; i < Domestica.listaVagas.length; i++) {
            if (pesquisar == (i + 1)) {
                j++;
                System.out.println("ID da vaga: " + (Domestica.listaVagas[i].id + 1));
                System.out.println("    Localidade: " + Domestica.listaVagas[i].localVagas);
                System.out.println("    Detalhes da Vaga: " + Domestica.listaVagas[i].detalhesVagas);
                System.out.println("    Salário da diarista: " + Domestica.listaVagas[i].salarioDiaria);
                System.out.println("    Dias trabalhados: " + Domestica.listaVagas[i].diasTrabalho);
                System.out.println();
            } else if (Domestica.listaVagas[i] == null) {
                i = Domestica.listaVagas.length;
            }
        }
        if (j == 0) {
            System.out.println("Vaga não encontrada");
        } else {
            ListarVaga.subMenuVagas();
        }
    }
    
    static void aceitarVaga(){
        int auxTeclado;

        //VALIDA DE ACORDO COM METODO CRIADO NA CLASSE DO MENU
        Menu.validarOp();
        // LISTA DE VAGAS POR PESQUISA

    }
}
