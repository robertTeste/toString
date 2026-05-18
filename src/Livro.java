class Livro {
    private String titulo;
    private String isbn;

    public Livro(String titulo, String isbn) {
        this.titulo = titulo;
        this.isbn = isbn;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // [cite: 78]
        if (!(obj instanceof Livro)) return false; // [cite: 79]
        Livro outro = (Livro) obj; // [cite: 80]
        return this.isbn.equals(outro.isbn); // [cite: 81]
    }
}