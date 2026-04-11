public class CondicaoTernaria {
    public static void main(String[] args) {
        int nota = 6;
        // condição ternária tem a seguinte estrutura
        // condicao ? valorSeVerdadeiro : valorSeFalso;
        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";
        // condicao ? valorSeVerdadeiro : valorSenaoSe : valorSeFalso;
        System.out.println(resultado);
    }
}
