/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.leituraboleto.model;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author aluno
 */
public class ProcessarBoletoBancoBrasil extends ProcessarBoleto {

    @Override
    protected List<Boleto> lerArquivo(String nomeArquivo) {
        List<Boleto> lista = super.lerArquivo(nomeArquivo);
        String ln;
        try {
            while ((ln = getReader().readLine()) != null) {
                String[] vetor = ln.split(";");
                Boleto b = new Boleto();
                b.setId(Integer.parseInt(vetor[0]));
                b.setCodBanco(vetor[1]);
                b.setDataVencimento(LocalDate.parse(vetor[2], FORMATER_DATA));
                b.setDatePagamento(LocalDate.parse(vetor[3], FORMATER_DATA).atTime(0, 0));
                b.setCpfCliente(vetor[4]);
                b.setValor(Double.parseDouble(vetor[5]));
                b.setMulta(Double.parseDouble(vetor[6]));
                b.setJuros(Double.parseDouble(vetor[7]));
                lista.add(b);
            }
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

        return lista;
    }

}
