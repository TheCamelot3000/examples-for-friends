package br.com.example.mariano.coletor;

import java.io.IOException;

public interface ColetorHTML {
    String coletar(String url) throws IOException, InterruptedException;
}
