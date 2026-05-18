import java.util.HashSet;

public class BibliotecaTeste {
    public static void main(String[] args) {
        HashSet<Livro> biblioteca = new HashSet<>();

        Livro l1 = new Livro("Clean Code", "978-0132350884");
        Livro l2 = new Livro("Clean Code", "978-0132350884");

        biblioteca.add(l1);
        biblioteca.add(l2);

        System.out.println("Tamanho do Set: " + biblioteca.size());

        /*rodada A (Com equals e hashCode ativos): O tamanho do Set será 1. Como ambos os métodos estão implementados,
           o HashSet descobre que o livro é duplicado e barra a segunda inserção.
        rodada B (Se comentar o hashCode): O tamanho muda para 2. Mesmo com o equals ativo,
           sem o hashCode o Java joga os livros em "gavetas" diferentes na memória, fazendo o HashSet aceitar a duplicata.
        detecção de duplicatas: O HashSet usa internamente uma tabela de espalhamento (HashMap).
          Para detectar duplicatas, ele primeiro calcula o hashCode() para achar a posição na tabela; se houver um empate nessa posição, e
          le usa o equals() como critério de desempate para confirmar se o conteúdo é estritamente igual.
        */
    }
}