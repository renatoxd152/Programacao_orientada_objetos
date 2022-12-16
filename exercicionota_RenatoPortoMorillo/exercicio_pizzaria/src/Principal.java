import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

        Cerveja c1 = new Cerveja("Skol 250ml",5.00,100,4.6);
        Vinho v1 = new Vinho("Vinho Tinto",59.90, 200, "Uva francesa", "França");
        Pizza p1 = new Pizza("Pizza de frango e catupiry",30.00, true);

        Ingrediente i1 = new Ingrediente("Frango");
        Ingrediente i2 = new Ingrediente("Catupiry");
        Ingrediente i3 = new Ingrediente("Molho de Tomate");
        Ingrediente i4 = new Ingrediente("Mussarela");
        Ingrediente i5 = new Ingrediente("Tomate");

        p1.adicionarIngrediente(i1);
        p1.adicionarIngrediente(i2);
        p1.adicionarIngrediente(i3);
        p1.adicionarIngrediente(i4);


        List<Produto> produtos = new ArrayList<>();
        produtos.add(c1);
        produtos.add(v1);
        produtos.add(p1);

        for(Produto p : produtos)
        {
            p.mostrarDados();
        }

        p1.listarIngredientes();


    }
}
