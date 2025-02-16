package br.com.example.mariano.coletor;

import java.util.Map;

public interface ColetorConteudo {
    Map<String, String> coletar(String html);
}
