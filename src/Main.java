public class Main {
    public static void main(String[] args) {
    Livro l1 = new Livro("Clean Code - Edição Antiga", "978-0132350884");
    Livro l2 = new Livro("Clean Code - Edição Nova", "978-0132350884");

        System.out.println("Mesmo ISBN, títulos diferentes: " + l1.equals(l2)); // true

    // 2. Teste passando null e uma String para o equals()
        System.out.println("Passando null: " + l1.equals(null)); // false
        System.out.println("Passando uma String: " + l1.equals("Texto Qualquer")); // false

    // Resposta 1: Sim, são considerados iguais. Como o método 'equals' compara apenas o ISBN, a diferença nos títulos é ignorada pelo Java.
    // Resposta 2: Não lança exceção. A verificação 'instanceof' protege o código, retornando falso imediatamente se o objeto for nulo ou de outra classe.
    // Resposta 3: Comparamos pelo ISBN porque ele é um identificador único universal para livros. Títulos podem se repetir ou ter variações de escrita,
    // enquanto o ISBN garante que se trata rigorosamente da mesma obra literária.
}
}