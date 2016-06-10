package pi_alessandra;

import java.util.Scanner;

public class Domestica {
        
    // VARIAVEIS GLOBAIS
    static Scanner entrada = new Scanner(System.in);
    static Vagas[] listaVagas = new Vagas[10];
    static String opcaoTeclado;
    static boolean flagValidaMenu;
    static int auxiliarTeclado;

    public static void main(String[] args) {
        //VARIAVEIS
        boolean validarMenu = false; //LAÇO DO MENU RECEBE FALSO     
        //LAÇO
        do {
            //APRESENTAÇÃO DO MENU (classe)
            Menu.getMenu();
            auxiliarTeclado = Menu.validarMenu();

            switch (auxiliarTeclado) {
                case 1:
                    Cadastro.cadastrarVagas();
                    break;
                case 2:
                    ListarVagas.imprimirVagas();
                    break;
                case 3:
                    Pesquisar.menuPesquisar();
                    break;
                default:
                    validarMenu = true;
            }
        } while (validarMenu == false);
        System.out.printf("\nObrigado volte sempre!\n"); // Finalizando programa
    }
}