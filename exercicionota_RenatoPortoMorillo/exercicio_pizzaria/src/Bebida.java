public abstract class Bebida extends Produto{
    private int quantidadeEstoque;

    public Bebida(String descrição, double preço, int quantidadeEstoque) {
        super(descrição, preço);
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
}
