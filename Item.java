abstract class Item implements ItemBiblioteca {
    protected String titulo;
    protected boolean disponivel;

    public Item(String titulo) {
        this.titulo = titulo;
        this.disponivel = true;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public void emprestar() throws ItemNaoDisponivelException {
        if (!disponivel) {
            throw new ItemNaoDisponivelException("Item não está disponível para empréstimo.");
        }
        disponivel = false;
    }

    @Override
    public void devolver() {
        disponivel = true;
    }

    @Override
    public boolean isDisponivel() {
        return disponivel;
    }
}
