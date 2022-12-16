public class Principal {
    public static void main(String[] args) {
        Jogador j1 = new Jogador("Renato","Atacante",9);
        Jogador j2 = new Jogador("Roberto","Zagueiro",10);
        Jogador j3 = new Jogador("Pedro","Atacante",12);
        Jogador j4 = new Jogador("Weverton","Goleiro",41);


        Time time1 = new Time("Brasil",10);
        Time time2 = new Time("Argentina",4);

        time1.adicionarJogador(j1);
        time1.adicionarJogador(j2);
        time2.adicionarJogador(j3);
        time2.adicionarJogador(j4);

        time1.mostrarTime();
        time2.mostrarTime();

        Estadio estadio = new Estadio("Allianz Parque","São Carlos");

        Partida partida = new Partida("13/09/2022","16h00",2,1,time1,time2,estadio);

        partida.atualizarResultado(10,1);
        partida.mostrarDados();

    }
}
