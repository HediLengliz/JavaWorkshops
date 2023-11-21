package ecole.etudiant;

public class Etudiant {

    private int id;
    private String nom;
    private String prenom;
    private float moy;
    private int absence;
    private String ecole;
    public Etudiant(int id,String nom,String prenom,float moy,int absence,String ecole)
    {
        this.id=id;
        this.nom=nom;
        this.prenom=prenom;
        this.moy=moy;
        this.absence=absence;
        this.ecole=ecole;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getNom(){
        return nom;
    }
    public void setNom(){
        this.nom=nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public float getMoy() {
        return moy;
    }
    public String getEcole(){
        return ecole;
    }
public void setEcole(String ecole){
        this.ecole=ecole;
    }

    public void setMoy(float moy) {
        this.moy = moy;
    }
    public int getAbsence(){
        return absence;
    }
    public void setAbsence(int absence){
        this.absence=absence;
    }
    public boolean equals(Object o){
        if(o instanceof Etudiant){
            Etudiant e=(Etudiant)o;
            return (this.id==e.id && this.nom.equals(e.nom));
        }
        return false;
    }
    public String toString(){
        return "Etudiant {" +
                "ID='" + id + '\''+
                ",Nom='" + nom +'\''+
                ",Prenom='" + prenom +'\''+
                ",moy='" + moy +'\''+

                '}';

    }






 }
