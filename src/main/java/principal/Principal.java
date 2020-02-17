package principal;

import com.mycompany.leituraboleto.model.ProcessarBoleto;
import com.mycompany.leituraboleto.model.ProcessarBoletoBancoBrasil;
import model.ProcessarBoletoBradesco;

/**
 *
 * @author aluno
 */
public class Principal {

    public static void main(String[] args) {
        ProcessarBoleto processarBB = new ProcessarBoletoBancoBrasil();
        String nomeArquivoBB = "banco-brasil-1.csv";
        processarBB.processar(nomeArquivoBB);

        /*ProcessarBoleto processarBradesco = new ProcessarBoletoBradesco();
        String nomeArquivoBradesco = "banco-brasil-1.csv";
        processarBradesco.processar(nomeArquivoBradesco);*/
    }

}
