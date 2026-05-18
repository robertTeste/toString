public class TesteStringPool {
    public static void main(String[] args) {
        String a = "Java";
        String b = "Java";
        String c = new String("Java");

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a.equals(c));

        // Resposta 1: 'a == b' é true porque ambas usam literais. O Java aponta as duas para a mesma referência no String Pool. [cite: 43]
        // Resposta 2: 'a == c' é false porque o operador 'new' força a criação de um novo objeto em outro endereço de memória. [cite: 44]
        // Resposta 3: String Pool é uma área de memória onde o Java armazena Strings literais de forma única para economizar espaço. [cite: 45]
    }
}