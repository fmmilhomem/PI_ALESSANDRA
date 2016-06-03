package pi_alessandra;

import static pi_alessandra.Domestica.*;

public class AceitarVaga {

    static void aceitarVaga() {
        do {
            System.out.println("S para SIM ou N para NÃO");
            opcaoTeclado = entrada.next();

            if ((opcaoTeclado.equalsIgnoreCase("S") || (opcaoTeclado.equalsIgnoreCase("N")))) {
                if (opcaoTeclado.equalsIgnoreCase("S")) {
                    System.out.println("A vaga está aceita!");
                    auxCase = true;
                } else {
                    System.out.println("A vaga não está aceita!");
                }
            } else {
                System.out.println("Caractere inválido, favor tente de novo!");
            }
        } while (auxCase == false);

    }
}
