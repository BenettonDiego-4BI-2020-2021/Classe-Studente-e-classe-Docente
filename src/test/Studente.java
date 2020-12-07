package test;

public class Studente {
    private String nome;
    private String cognome;
    private String classe;
    public Studente(){
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
     @Override
    public String toString() {
        String studente;   
        studente=nome+"-"+cognome+"-"+classe;
        return studente;
    }
}
