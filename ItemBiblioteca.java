interface ItemBiblioteca {
    void emprestar() throws ItemNaoDisponivelException;
    void devolver();
    boolean isDisponivel();
}
