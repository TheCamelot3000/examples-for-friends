package br.com.example.mariano;

import br.com.example.mariano.coletor.ColetaHTMLImpl;
import br.com.example.mariano.coletor.ColetorConteudo;
import br.com.example.mariano.coletor.ColetorConteudoImpl;
import br.com.example.mariano.coletor.ColetorHTML;

import java.io.IOException;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        validarArgumentos(args);
        String url = args[0];

        ColetorHTML coletor = new ColetaHTMLImpl();

        String html = coletor.coletar(url);
        System.out.println("*** HTML ***");
        System.out.println(html);
        System.out.println("Iniciando a análise das tags HTML....");

        ColetorConteudo coletorConteudo = new ColetorConteudoImpl();
        Map<String, String> conteudo = coletorConteudo.coletar(html);

        System.out.println("*** Conteudo com HTML ***");
        conteudo.forEach((key, value) -> System.out.println(key + ": " + value));

    }

    private static void validarArgumentos(String[] args) {
        int quantidade = args.length;
        if (quantidade == 0) {
            System.err.println("É necessário pelo menos uma url");
        } else if (quantidade > 1) {
            System.err.println("Apenas uma url pode ser análisada por vez");
        }
    }
}