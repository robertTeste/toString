public class ValidadorSenha {
    public static void main(String[] args) {
        String senhaCorreta = new String("1234");
        String tentativa = "1234";

        if (tentativa.equals(senhaCorreta)) {
            System.out.println("Acesso liberado");
        } else {
            System.out.println("Acesso negado");
        }

        // Resposta 1: O acesso original foi negado porque o '=='
        // comparou os endereços de memória. Como 'senhaCorreta' usou 'new', ela foi criada fora do String Pool, resultando em referências diferentes.
        // Resposta 2: O risco de usar '==' em sistemas reais é gerar falhas graves de lógica, como bloquear usuários legítimos com dados corretos vindos de bancos de dados ou APIs,
        // que criam novas instâncias na memória.
    }
}