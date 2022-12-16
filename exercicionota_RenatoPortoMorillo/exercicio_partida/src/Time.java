import java.util.ArrayList;
import java.util.List;

public class Time {
    private String pais;
    private int quantidadeTitulos;
    private List<Jogador> jogadores = new ArrayList<>();

    public Time(String pais, int quantidadeTitulos) {
        this.pais = pais;
        this.quantidadeTitulos = quantidadeTitulos;
    }

    public void adicionarJogador(Jogador jogador)
    {
        this.jogadores.add(jogador);
    }

    public void removerJogador(Jogador jogador)
    {
        this.jogadores.remove(jogador);
    }



    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getQuantidadeTitulos() {
        return quantidadeTitulos;
    }

    public void setQuantidadeTitulos(int quantidadeTitulos) {
        this.quantidadeTitulos = quantidadeTitulos;
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    public void mostrarTime()
    {
        System.out.println("\nPaís:" + this.pais + "\nQuantidade de títulos:" + this.quantidadeTitulos);
        System.out.println("\nJogadores do time:");

        for(Jogador j : jogadores)
        {
            System.out.println("\nNome:" + j.getNome() + "\nPosição:" + j.getPosição() + "\nNúmero da camisa:" + j.getNumeroCamisa());
        }
    }

}
