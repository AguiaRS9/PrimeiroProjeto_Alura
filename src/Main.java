public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de Lançamento: "+ anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        //Média calculada pelas 3 notas de Gustavo, Paula e Suelem
        double media = (9.0 + 9.0 + 8.0) / 3;
        System.out.println("Média: " + media);
        String sinopse;
        sinopse = """
                Filme Top Gun
                Filme de Aventura com galã dos anos 80
                Muito Bom!
                Ano de Lancamento
                """ + anoDeLancamento;
        System.out.println(sinopse);

        int classificacao;
        classificacao = (int) (media/2);
                System.out.println("Classificação: " + classificacao);
    }
}