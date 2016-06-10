package pi_alessandra;

public class AceitarVaga {

    static void aceitarVaga() {
        boolean flagValidaMenu = false;
        int auxTeclado;

        flagValidaMenu = false;

        while (flagValidaMenu == false) {
            try {
                System.out.print("\nDigite o ID da vaga para aceita-la: ");
                Domestica.opcaoTeclado = Domestica.entrada.next();
                auxTeclado = Integer.parseInt(Domestica.opcaoTeclado);
                flagValidaMenu = true;
            } catch (Exception error) {
                //VERIFICA SE O USUARIO DIGIOU LETRA, RETORNA PARA O MENU E PEDE QUE DIGITE UM NUMERO
                System.out.println("Valor Inválido!");
            }
        }
        for (int i = 0; i < Domestica.listaVagas.length; i++) {
            auxTeclado = Integer.parseInt(Domestica.opcaoTeclado);

            if (auxTeclado == Domestica.listaVagas[i].id) {
                Domestica.listaVagas[i].id = 0;
            }
        }
    }
}
