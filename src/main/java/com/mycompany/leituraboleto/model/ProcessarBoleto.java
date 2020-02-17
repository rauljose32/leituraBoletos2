package com.mycompany.leituraboleto.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aluno
 */
public abstract class ProcessarBoleto {

    public static final DateTimeFormatter FORMATER_DATA = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public static final DateTimeFormatter FORMATER_DATA_HORA = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
    private BufferedReader reader;

    public BufferedReader getReader() {
        return reader;
    }

    protected List<Boleto> lerArquivo(String nomeArquivo) {

        List<Boleto> lista = new ArrayList();
        try {
            reader = Files.newBufferedReader(Paths.get(nomeArquivo));
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

        return lista;
    }

    public void processar(String nomeArquivo) {
        List<Boleto> boletos = lerArquivo(nomeArquivo);
        for (Boleto b : boletos) {
            System.out.println("Id: " + b.getId() + "\nBanco: " + b.getCodBanco());
        }
    }

}
