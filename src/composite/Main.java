package composite;

public class Main {
    public static void main(String[] args) {
        Angajat membru1 = new Angajat("Alin Iorga", "membru echipa", 3800);
        Angajat membru2 = new Angajat("Andrei Firoi", "membru echipa", 3800);
        Angajat membru3 = new Angajat("Gabriel Clandestin", "membru echipa", 3800);
        Angajat teamManager1 = new Angajat("Cristian Niculescu", "team manager", 4800);
        Angajat teamManager2 = new Angajat("Alexandru Dragut", "team manager", 4800);
        Angajat sefDepartament = new Angajat("Andrei Niculescu", "sef departament", 5800);
        Angajat ceo = new Angajat("Alexandru Basnaru", "CEO", 10000);
        
        teamManager1.addSubordonat(membru1);
        teamManager1.addSubordonat(membru3);
        teamManager2.addSubordonat(membru2);
        sefDepartament.addSubordonat(teamManager1);
        sefDepartament.addSubordonat(teamManager2);
        ceo.addSubordonat(teamManager1);
        ceo.addSubordonat(teamManager2);

        teamManager1.printSubordonati();
        teamManager1.delSubordonat(membru3);

        System.out.println("-------------------------");

        ceo.printSubordonati();
    }
}
