import java.util.ArrayList;
import java.util.List;

public class MochilaForcaBruta {

    public static List<Item> mochilaForcaBruta(List<Item> itens, int capacidadeMochila) {
        int numItens = itens.size();
        int maxValor = 0;
        List<Item> melhorMochila = new ArrayList<>();

        for (int i = 0; i < (1 << numItens); i++) {
            List<Item> mochilaAtual = new ArrayList<>();
            int pesoAtual = 0;
            int valorAtual = 0;

            for (int j = 0; j < numItens; j++) {
                if ((i & (1 << j)) > 0) {
                    mochilaAtual.add(itens.get(j));
                    pesoAtual += itens.get(j).peso;
                    valorAtual += itens.get(j).valor;
                }
            }

            if (pesoAtual <= capacidadeMochila && valorAtual > maxValor) {
                maxValor = valorAtual;
                melhorMochila = new ArrayList<>(mochilaAtual);
            }
        }

        return melhorMochila;
    }
}