package pi_alessandra;

public class AceitarVaga {

    static void aceitarVaga() {
        boolean vagaSelecionada = false;
        int auxSelecionar;
        auxSelecionar = Pesquisar.validarCaseId();
        Pesquisar.psqId(auxSelecionar);
        
        do {
            for (int i = 0; i < Domestica.listaVagas.length; i++) {
                auxSelecionar = Integer.parseInt(Domestica.opcaoTeclado);

                if (Domestica.auxiliarTeclado == Domestica.listaVagas[i].id) {
                    Domestica.listaVagas[i].id = 0;
                }
            }
        } while ((vagaSelecionada == false) || Domestica.auxiliarTeclado == 0);
    }
    
    static void aceitarVagaPsq() {
        boolean vagaSelecionada = false;
        int auxSelecionar;
        auxSelecionar = Pesquisar.validarCaseId();
        Pesquisar.psqId(auxSelecionar);
        
        do {
            for (int i = 0; i < Domestica.listaVagas.length; i++) {
                auxSelecionar = Integer.parseInt(Domestica.opcaoTeclado);

                if (Domestica.auxiliarTeclado == Domestica.listaVagas[i].id) {
                    Domestica.listaVagas[i].id = 0;
                }
            }
        } while ((vagaSelecionada == false) || Domestica.auxiliarTeclado == 0);
    }
}
