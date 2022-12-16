public class Vinho extends Bebida{
    private String uva;
    private String paisOrigem;

    public Vinho(String descrição, double preço, int quantidadeEstoque, String uva, String paisOrigem) {
        super(descrição, preço, quantidadeEstoque);
        this.uva = uva;
        this.paisOrigem = paisOrigem;
    }

    public String getUva() {
        return uva;
    }

    public void setUva(String uva) {
        this.uva = uva;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    @Override
    public void mostrarDados()
    {
        System.out.println("\nDescrição:" + this.getDescrição() + "\nPreço:" + this.getPreço()  + "\nQuantidade no estoque:" + this.getQuantidadeEstoque() + "\nUva utilizada:" + uva + "\nPaís de Origem:" + this.paisOrigem);
    }

}
