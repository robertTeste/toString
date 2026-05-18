public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Caneta", 2.50);
        Produto produto2 = new Produto("Caderno", 15.90);

        System.out.println(produto1);
        System.out.println(produto2);

        System.out.println("Item: " + produto1);

        /*
         O que mudou na saída?
         Agora, em vez de exibir aquele código confuso com o endereço de memória
         (Ex: Produto@1540e19d), o console exibe o texto formatado e legível que
         definimos dentro do método toString():
         Produto{nome='Caneta', preco=2.5}
         Produto{nome='Caderno', preco=15.9}
         O toString() é chamado automaticamente?
         Sim! O método toString() é invocado de forma automática pelo Java em três
         situações principais demonstradas aqui:
         1. Dentro do método System.out.println(objeto), pois ele precisa converter
         o objeto em texto antes de exibir.
         2. Na concatenação usando o operador '+' ("Item: " + produto1). O Java
         chama o toString() por debaixo dos panos para unir o texto com o objeto.
         3. No painel de variáveis da IDE/Debugger durante a inspeção de código.
         */
    }
}