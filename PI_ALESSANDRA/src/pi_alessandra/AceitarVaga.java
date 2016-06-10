package pi_alessandra;

public class AceitarVaga {

    static void aceitarVaga() {        
        int auxTeclado;
        
        //VALIDA DE ACORDO COM METODO CRIADO NA CLASSE DO MENU
        Menu.validarOp();
        
        for (int i = 0; i < Domestica.listaVagas.length; i++) {
            auxTeclado = Integer.parseInt(Domestica.opcaoTeclado);

            if (auxTeclado == Domestica.listaVagas[i].id) {
                Domestica.listaVagas[i].id = 0;
            }
        }
    }
}