package pi_alessandra;

public class AceitarVaga {

    static boolean vagaSelecionada;

    static void vagaAceita() {
        System.out.println("A vaga foi aceita!");
        vagaSelecionada = true;
        Domestica.listaVagas[Pesquisar.vagaSelecionada] = null;
        for (int i = Pesquisar.vagaSelecionada; i < Domestica.listaVagas.length; i++) {
            if (Domestica.listaVagas[i + 1] == null) {
                i = Domestica.listaVagas.length;
            } else {
                Domestica.listaVagas[i] = Domestica.listaVagas[i + 1];
                Domestica.listaVagas[i + 1] = null;
            }
        }
    }

    static void aceitarVagaPsqString() {
        int opcaoInt;
        opcaoInt = Pesquisar.validarCaseId();
        //LAÇO BUSCAR 
        int j = 0; // CONTADOR 

        for (Pesquisar.i = 0; Pesquisar.i < Domestica.listaVagas.length; Pesquisar.i++) {

            if (Domestica.listaVagas[Pesquisar.i] == null) {
                Pesquisar.i = Domestica.listaVagas.length;
            } else if (opcaoInt == Domestica.listaVagas[Pesquisar.i].id) {
                j++;
                Pesquisar.vagaSelecionada = Pesquisar.i;
                aceitarVagaPsqId();
            }
        }
        if (j == 0) {
            System.out.println("Vaga não encontrada com este ID");
        } else {
            
        }
    }

    static void aceitarVagaPsqId() {
        String auxString;
        vagaSelecionada = false;

        System.out.println("Deseja aceitar a vaga? (S / N)");
        while (vagaSelecionada == false) {
            //LIMPANDO ENTRADA SCANNER
            Domestica.entrada.nextLine();
            auxString = Domestica.entrada.next();
            //VERIFICA SE VAGA FOI ACEITA OU NÃO //SE FOI, SUBSTITUI O VALOR PELA PROXIMA VAGA
            if ("s".equalsIgnoreCase(auxString)) {
                vagaAceita();
            } else if ("n".equalsIgnoreCase(auxString)) {
                System.out.println();
                vagaSelecionada = true;
            } else {
                System.out.println("Valor inválido (S)sim / (N)não!");
            }
        }
    }
}
