package pi_alessandra;

public class DadosVagas {

    public int id = 0;
    public String categoria;
    public String localVagas;
    public double salarioDiaristas;
    public int diasTrabalhados;
    public String detalhesVagas;

    static void cadastroTresVagas() {
        //VAGA 1
        //INICIALIZA A POSIÇÃO DO VETOR
        Domestica.listaVagas[0] = new DadosVagas();
        
        Domestica.listaVagas[0].id = 1;
        Domestica.listaVagas[0].categoria = "Domestica";
        Domestica.listaVagas[0].localVagas = "SUL";
        Domestica.listaVagas[0].salarioDiaristas = 120;
        Domestica.listaVagas[0].detalhesVagas = "Vaga para limpar um apartamento. Rua zero, nº 0, bl 10";
        Domestica.listaVagas[0].diasTrabalhados = 1;
        //VAGA 2
        //INICIALIZA A POSIÇÃO DO VETOR
        Domestica.listaVagas[1] = new DadosVagas();
        
        Domestica.listaVagas[1].id = 2;
        Domestica.listaVagas[1].categoria = "Eletrica";
        Domestica.listaVagas[1].localVagas = "NORTE";
        Domestica.listaVagas[1].salarioDiaristas = 120;
        Domestica.listaVagas[1].detalhesVagas = "Vaga de eletricista para trocar disjuntores. Rua um, nº 1";
        Domestica.listaVagas[1].diasTrabalhados = 2;
        //VAGA 3
        //INICIALIZA A POSIÇÃO DO VETOR
        Domestica.listaVagas[2] = new DadosVagas();
        
        Domestica.listaVagas[2].id = 3;
        Domestica.listaVagas[2].categoria = "Pintor";
        Domestica.listaVagas[2].localVagas = "CENTRO";
        Domestica.listaVagas[2].salarioDiaristas = 120;
        Domestica.listaVagas[2].detalhesVagas = "Vaga para pintar um apartamento, 2 m². Rua dois, nº 2, bl 20";
        Domestica.listaVagas[2].diasTrabalhados = 5;
    }
}
