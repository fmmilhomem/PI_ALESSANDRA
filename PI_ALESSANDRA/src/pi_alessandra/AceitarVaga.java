package pi_alessandra;

public class AceitarVaga {

    static void aceitarVaga() {
    }

    static void aceitarVagaPsq() {
        boolean vagaSelecionada = false;
        String auxString;

        System.out.println("Deseja aceitar a vaga? (S / N)");
        while (vagaSelecionada == false) {
            //LIMPANDO ENTRADA SCANNER
            Domestica.entrada.nextLine();
            auxString = Domestica.entrada.next();
            //VERIFICA SE VAGA FOI ACEITA OU NÃO
            //SE FOI SUBSTITUI O VALOR PELO PROXIMO
            if ("s".equalsIgnoreCase(auxString)) {
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
            } else if ("n".equalsIgnoreCase(auxString)) {
                System.out.println();
                vagaSelecionada = true;
            } else {
                System.out.println("Valor inválido (S)sim / (N)não!");
            }
        }
    }
}
