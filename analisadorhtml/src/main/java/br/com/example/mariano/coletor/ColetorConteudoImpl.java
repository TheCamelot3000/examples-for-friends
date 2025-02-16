package br.com.example.mariano.coletor;

import br.com.example.mariano.util.HTMLParser;

import java.util.Map;

public class ColetorConteudoImpl implements ColetorConteudo {
    @Override
    public Map<String, String> coletar(String html) {
        return HTMLParser.coletarConteudo(html);
    }
}



