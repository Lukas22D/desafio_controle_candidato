import processo_seletivo.CadastroCandidato;
import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;
public class App {
    public static void main(String[] args) throws Exception {
        selecaoCandidato();

    }

    static void selecaoCandidato() {
        String [] candidatos = {"João", "Maria", "José", "Ana", "Carlos", "Mariana", "Pedro", "Paula", "Lucas", "Juliana"};
        var selecionados = new ArrayList<CadastroCandidato>();
        for(var i : candidatos) {
            var candidato = new CadastroCandidato(i, ValorPretendido());
            if(candidato.analisarCandidato()) {
                selecionados.add(candidato);
            } else {
                System.out.println("Candidato " + i + " não selecionado");
            }
            
        }
        for(var selecionado: selecionados) {
            System.out.println("Candidato selecionado: " + selecionado.name + "\n Salário pretendido: " + selecionado.desiredSalary);
        }
        
        }

    static double ValorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 3000);
    }
        
}
