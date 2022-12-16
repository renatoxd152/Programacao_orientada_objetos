public abstract class Produto {
    private String descrição;
    private double preço;

    public Produto(String descrição, double preço) {
        this.descrição = descrição;
        this.preço = preço;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    public abstract void mostrarDados();
}
