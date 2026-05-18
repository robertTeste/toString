public class Main {
    public static void main(String[] args) {
        //Instanciando dois produtos na Main
        Produto produto1 = new Produto("Caneta", 2.50);
        Produto produto2 = new Produto("Caderno", 15.90);

        //Imprimindo cada um com System.out.println()
        System.out.println(produto1);
        System.out.println(produto2);

        /*
         O que aparece?
         A saída exibida no console será semelhante a isto:
         Produto@5f184fc6
         Produto@3feba861
         É legível?
         Não, não é nada legível para um usuário humano. O que está acontecendo aqui
         é o comportamento padrão da classe 'Object' do Java. Quando tentamos imprimir
         um objeto que não possui o método 'toString()' customizado, o Java exibe o
         nome da classe, seguido por um caractere '@' e a representação hexadecimal
         do código hash (hashCode) daquele objeto na memória.
         */
    }
}