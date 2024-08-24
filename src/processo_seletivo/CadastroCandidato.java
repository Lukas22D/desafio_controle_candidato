package processo_seletivo;

public class CadastroCandidato {
     public String name;
     public double desiredSalary;

    public CadastroCandidato(String name, double desiredSalary) {
        this.name = name;
        this.desiredSalary = desiredSalary;
    }

    public boolean analisarCandidato() {
        var baseSalary = 2000;

        if (this.desiredSalary < baseSalary) {
            return false;
        } else if (this.desiredSalary == baseSalary) {
            return true;
        } else {
            return true;
        }

    }
}