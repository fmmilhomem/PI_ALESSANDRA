package pi_alessandra;

public class Menu {
    
    //METODO VALIDAR OPÇÃO
    static void validarOp() {
        do {
            Domestica.flagValidaMenu = false;
            //VALIDA SE DIGITOU NUMERO
            try {
                System.out.print("Informe uma opção: ");
                Domestica.opcaoTeclado = Domestica.entrada.next();
                Domestica.auxiliarTeclado = Integer.parseInt(Domestica.opcaoTeclado);
                Domestica.flagValidaMenu = true;
            } catch (Exception error) {
                //VERIFICA SE O USUARIO DIGIOU LETRA, RETORNA PARA O MENU E PEDE QUE DIGITE UM NUMERO
                System.out.println("Valor Inválido!");
            }
        } while (Domestica.flagValidaMenu == false);
    }

   //MENU
    static void getMenu() {
        //ATRIBUINDO VALOR FLAG PARA VALIDAR O LAÇO
        Domestica.flagValidaMenu = false;
                
        System.out.print("\n------------------ Menu ------------------\n");
        System.out.println("        (1) - Cadastro de vagas");
        System.out.println("        (2) - Vagas disponiveis");
        System.out.println("        (3) - Pesquisar");
        System.out.println("        (0) - Sair ");
        System.out.print("------------------------------------------\n");
    }
   
    //METODO VALIDAR E RETORNAR O VALOR
    static int validarMenu() {
        // Verifica se a opção menu inicial é válida - 1 até 5 = São as opções do menu 
        do {     
            validarOp();
            if ((Domestica.auxiliarTeclado < 0) || (Domestica.auxiliarTeclado > 3)) {
                System.out.println("Opção de 0 a 3!");
            }
        } while ((Domestica.auxiliarTeclado < 0) || (Domestica.auxiliarTeclado > 3));
        return Domestica.auxiliarTeclado;
    }
}
