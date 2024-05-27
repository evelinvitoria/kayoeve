class Revista extends Item {
    private int edicao;

    public Revista(String titulo, int edicao) {
        super(titulo);
        this.edicao = edicao;
    }

    public int getEdicao() {
        return edicao;
    }

    @Override
    public String toString() {
        return "Revista: " + titulo + " Edição " + edicao;
    }
}
