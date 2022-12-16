public class Cerveja extends Bebida{
    private double teorAlcoolico;

    public Cerveja(String descrição, double preço, int quantidadeEstoque, double teorAlcoolico) {
        super(descrição, preço, quantidadeEstoque);
        this.teorAlcoolico = teorAlcoolico;
    }

    public double getTeorAlcoolico() {
        return teorAlcoolico;
    }

    public void setTeorAlcoolico(double teorAlcoolico) {
        this.teorAlcoolico = teorAlcoolico;
    }


    @Override
    public void mostrarDados()
    {
        System.out.println("\nDescrição:" + this.getDescrição() + "\nPreço:" + this.getPreço()  + "\nQuantidade no estoque:" + this.getQuantidadeEstoque() +"\nTeor Alcoolico:" + teorAlcoolico);
    }

}
