/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.mycompany.leituraboleto.model.Boleto;
import com.mycompany.leituraboleto.model.ProcessarBoleto;
import java.util.List;

/**
 *
 * @author aluno
 */
public class ProcessarBoletoBradesco extends ProcessarBoleto {


    @Override
    protected List<Boleto> lerArquivo(String nomeArquivo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
