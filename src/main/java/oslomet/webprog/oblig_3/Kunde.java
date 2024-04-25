package oslomet.webprog.oblig_3;

public class Kunde {
    private int id;
    private String filmValg;
    private String antall;
    private String fornavn;
    private String etternavn;
    private String telefonnr;
    private String epost;

    public Kunde(int id, String filmValg, String antall, String fornavn, String etternavn, String telefonnr, String epost) {
        this.id = id;
        this.filmValg = filmValg;
        this.antall = antall;
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.telefonnr = telefonnr;
        this.epost = epost;
    }
    public Kunde(){ }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getFilmValg() {
        return filmValg;
    }

    public void setFilmValg(String filmValg) {
        this.filmValg = filmValg;
    }

    public String getAntall() {
        return antall;
    }

    public void setAntall(String antall) {
        this.antall = antall;
    }

    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    public String getTelefonnr() {
        return telefonnr;
    }

    public void setTelefonnr(String telefonnr) {
        this.telefonnr = telefonnr;
    }

    public String getEpost() {
        return epost;
    }

    public void setEpost(String epost) {
        this.epost = epost;
    }
}
