class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        // Retorna a String no formato exatamente pedido: Produto{nome='Caneta', preco=2.50}
        return "Produto{nome='" + this.nome + "', preco=" + this.preco + "}";
    }
}