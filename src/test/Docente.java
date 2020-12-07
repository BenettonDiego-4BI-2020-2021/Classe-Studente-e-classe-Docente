package test;

public class Docente {
    private String nome;
    private String cognome;
    private String classe;
    private int anni_insegnamento;
    public Docente(){
        nome=null;
        cognome=null;
        classe=null;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public String getNome(){
        return nome;
    }
    public void setCognome(String cognome){
        this.cognome=cognome;
    }
    public String getCognome(){
        return cognome;
    }
    public void setClasse(String classe){
        this.classe=classe;
    }
    public String getClasse(){
        return classe;
    }
    public void setAnni(int anni_insegnamento){
        this.anni_insegnamento=anni_insegnamento;
    }
    public int getAnni(){
        return anni_insegnamento;
    }
     @Override
    public String toString() {
        String studente;   
        studente=nome+"-"+cognome+"-"+classe+"-"+anni_insegnamento;
        return studente;
    }
}
