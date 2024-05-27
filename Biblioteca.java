import java.util.ArrayList;
import java.util.List;

class Biblioteca {
    private List<Item> itens;

    public Biblioteca() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public void listarItens() {
        for (Item item : itens) {
            System.out.println(item);
        }
    }

    public Item buscarItem(String titulo) {
        for (Item item : itens) {
            if (item.getTitulo().equalsIgnoreCase(titulo)) {
                return item;
            }
        }
        return null;
    }
}
