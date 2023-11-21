package ecole.etudiant;

public class etudiantalternance {

    private  int salaire;
    private  String nom;
    private  String prenom;

    public etudiantalternance(int salaire ,String nom,String Prenom) {
        this.salaire = salaire;
        this.nom=nom;
        this.prenom=prenom;
    }
    public  int getSalaire(){
        return salaire;
    }
    public void setSalaire(int salaire)
    {
        this.salaire=salaire;
    }
   public String getNom(){
            return nom;
        }
        public void setNom(){
            this.nom=nom;
        }
        public void setNom(String prenom) {
            this.prenom = prenom;
        }
        public String getPrenom() {
            return prenom;
        }

    public void ajouterAbsence(){
        setSalaire(getSalaire()-50);
    }
    public String toString(){
        return "Etudiant alternance {" +
                "salaire='" + salaire + '\''+
                '}';

    }

}
