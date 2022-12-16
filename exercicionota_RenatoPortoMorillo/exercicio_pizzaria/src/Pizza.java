import java.util.ArrayList;
import java.util.List;

public class Pizza extends Produto{
    private boolean bordaRecheada;
    private List<Ingrediente> ingredientes = new ArrayList<>();

    public Pizza(String descrição, double preço, boolean bordaRecheada) {
        super(descrição, preço);
        this.bordaRecheada = bordaRecheada;
    }

    public void adicionarIngrediente(Ingrediente ingrediente)
    {
        ingredientes.add(ingrediente);
    }
    public void removerIngrediente(Ingrediente ingrediente)
    {
        ingredientes.remove(ingrediente);
    }

    public void listarIngredientes()
    {
        System.out.println("\nIngredientes da pizza:");
        for(Ingrediente i : ingredientes)
        {
            System.out.println(i.getNome());
        }
    }


    public boolean isBordaRecheada() {
        return bordaRecheada;
    }

    public void setBordaRecheada(boolean bordaRecheada) {
        this.bordaRecheada = bordaRecheada;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    @Override
    public void mostrarDados()
    {
        System.out.println("\nDescrição:" + this.getDescrição() + "\nPreço:" + this.getPreço() + "\nBorda Recheada:" + bordaRecheada);
    }

}
