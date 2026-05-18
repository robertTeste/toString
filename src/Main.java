public class Main {
    public static void main(String[] args) {
        // Instanciando dois objetos com os mesmos dados
        Livro l1 = new Livro("Clean Code", "978-0132350884");
        Livro l2 = new Livro("Clean Code", "978-0132350884");

        System.out.println(l1 == l2);       // false
        System.out.println(l1.equals(l2));  // false

        // Resposta 1: Ambas as saídas são 'false' porque 'l1' e 'l2' são dois objetos diferentes criados em posições distintas da memória Heap.
        // Resposta 2: O método '.equals()' sem override (padrão herdado da classe Object) se comporta exatamente como o operador '==', comparando apenas os endereços de memória dos objetos, ignorando o conteúdo dos atributos.
    }
}