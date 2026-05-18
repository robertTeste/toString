public class Main {
    public static void main(String[] args) {
        // 1. Instanciando dois livros com o mesmo ISBN
        Livro l1 = new Livro("Clean Code", "978-0132350884");
        Livro l2 = new Livro("Clean Code", "978-0132350884");

        // 2. Instanciando um livro com ISBN diferente
        Livro l3 = new Livro("Design Patterns", "978-0201633610");

        System.out.println("hashCode Livro 1: " + l1.hashCode());
        System.out.println("hashCode Livro 2: " + l2.hashCode());
        System.out.println("hashCode Livro 3: " + l3.hashCode());

        // Resposta 1: Sim, os hashCodes de dois livros com o mesmo ISBN são rigorosamente iguais. Isso cumpre o contrato do Java, pois se l1.equals(l2) é true, seus hashCodes devem coincidir.
        // Resposta 2: Sim, os hashCodes de livros com ISBNs diferentes são diferentes. O método Objects.hash() gera valores numéricos distintos para cadeias de texto diferentes.
    }
}