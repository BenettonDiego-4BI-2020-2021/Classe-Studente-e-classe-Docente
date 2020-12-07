package test;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Studente a = new Studente();
        Studente b = new Studente();
        Docente c = new Docente();
        Docente d = new Docente();
        Scanner inp = new Scanner(System.in);
        String nome,cognome,classe;
        int anni;
        
        //STUDENTE 1
        System.out.println("Dichiarazione studente 1");
        System.out.println("inserire nome studente 1");
        nome= inp.nextLine();
        a.setNome(nome);
        a.getNome();
        System.out.println("inserire cognome studente 1");
        cognome= inp.nextLine();
        a.setCognome(cognome);
        a.getCognome();
        System.out.println("inserire classe studente 1");
        classe= inp.nextLine();
        a.setClasse(classe);
        a.getClasse();
        System.out.println("studente 1 "+a);
        
        //STUDENTE 2
        System.out.println("Dichiarazione studente 2");
        System.out.println("inserire nome studente 2");
        nome= inp.nextLine();
        b.setNome(nome);
        b.getNome();       
        System.out.println("inserire cognome studente 2");
        cognome= inp.nextLine();
        b.setCognome(cognome);
        b.getCognome();        
        System.out.println("inserire classe studente 2");
        classe= inp.nextLine();
        b.setClasse(classe);
        b.getClasse();        
        System.out.println("studente 2 "+b);
        
        //DOCENTE 1
        System.out.println("Dichiarazione docente 1");
        System.out.println("inserire nome docente 1");       
        nome= inp.nextLine();
        c.setNome(nome);
        c.getNome();       
        System.out.println("inserire cognome docente 1");
        cognome= inp.nextLine();
        c.setCognome(cognome);
        c.getCognome();       
        System.out.println("inserire classe docente 1");
        classe= inp.nextLine();
        c.setClasse(classe);
        c.getClasse(); 
        System.out.println("inserire gli anni di insegnamente del docente 1");
        anni= inp.nextInt();
        c.setAnni(anni);
        c.getAnni();
        System.out.println("docente 1 "+c);
        
        //DOCENTE 2
        System.out.println("Dichiarazione docente 2");
        System.out.println("inserire nome docente 2");      
        nome= inp.nextLine();
        d.setNome(nome);
        d.getNome();      
        System.out.println("inserire cognome docente 2");
        cognome= inp.nextLine();
        d.setCognome(cognome);
        d.getCognome();      
        System.out.println("inserire classe docente 2");
        classe= inp.nextLine();
        d.setClasse(classe);
        d.getClasse();
        System.out.println("inserire gli anni di insegnamente del docente 2");
        anni= inp.nextInt();
        d.setAnni(anni);
        d.getAnni();
        System.out.println("docente 2 "+d);
        
        
    }
    
}
