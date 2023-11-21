package ecole.etudiant;

public class etudianteme {
    private String branche;

    public etudianteme(String branche) {
        this.branche = branche;
    }
    public String getBranche(){
        return branche;
    }
    public void setBranche(String branche){
        this.branche=branche;
    }
    //cree une fonction qui ajoute une absence selon le moyene -0.5 de class Etudiant
    public void ajouterAbsence(Etudiant e){
        e.setMoy(e.getMoy()-0.5f);

    }

}
