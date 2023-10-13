import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Item> itens = new ArrayList<>();
        itens.add(new Item(2, 10));
        itens.add(new Item(5, 8));
        itens.add(new Item(3, 15));
        itens.add(new Item(7, 7));
        itens.add(new Item(1, 6));

        int capacidadeMochila = 2;

        List<Item> mochila = mochilaForcaBruta(itens, capacidadeMochila);
        System.out.println("Itens na mochila (Peso, Valor):");
        for (Item item : mochila) {
            System.out.println("(" + item.peso + ", " + item.valor + ")");
        }
    }

    private static List<Item> mochilaForcaBruta(List<Item> itens, int capacidadeMochila) {
        return MochilaForcaBruta.mochilaForcaBruta(itens, capacidadeMochila);
    }
}
