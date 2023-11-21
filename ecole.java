package ecole;

import ecole.etudiant.Etudiant;
import ecole.etudiant.etudiantalternance;
import ecole.etudiant.EtudiantExisyteException;

public class ecole {
    public String nom;
    private final Etudiant[] etudiants = new Etudiant[500];
    public ecole(String nom) {
        this.nom = nom;
    }

    public ecole() {

    }

    public void ajouterEtudiant(Etudiant e) throws EtudiantExisyteException{

        if(rechercherEtudiant(e.getId())==-1){
            for(int i=0;i<etudiants.length;i++){
                if(etudiants[i]==null){
                    etudiants[i]=e;
                    break;
                }
            }
        }
        else{
            throw new EtudiantExisyteException("L'etudiant existe deja");

        }
        System.out.println("L'etudiant "+e.getNom()+" "+e.getPrenom()+" a été ajouté");
    }
    public int rechercherEtudiant(int id){
        for(int i=0;i<etudiants.length;i++){
            if(etudiants[i]!=null && etudiants[i].getId()==id){
                return i;
            }
        }
        return -1;
    }
    public float getMoyenneDes3A(){
        float moy=0;
        int nb=0;
        for(int i=0;i<etudiants.length;i++){
            if(etudiants[i]!=null && etudiants[i].getId()>300){
                moy+=etudiants[i].getMoy();
                nb++;
            }
        }
        System.out.println("La moyenne des 3A est de :");
        return moy/nb;
    }
    public float moyenneSalaireAlternants(etudiantalternance[] etudiants){
        float moy=0;
        int nb=0;
        for(int i=0;i<etudiants.length;i++){
            if((etudiants[i] != null) && (etudiants[i] instanceof etudiantalternance)){
                moy = moy + ((etudiantalternance) etudiants[i]).getSalaire();
                nb++;
            }
        }
        System.out.println("La moyenne des salaires des alternants est de :");
        return moy/nb;
    }
    public String afficherEtudiants() {
        String str = "";
        for (int i = 0; i < etudiants.length; i++) {
            if (etudiants[i] != null) {
                str += etudiants[i].toString() + "\n";
                System.out.println("Etudiant " + etudiants[i].getNom() + " " + etudiants[i].getPrenom() + " " + etudiants[i].getMoy() + " " + etudiants[i].getAbsence() + " " + etudiants[i].getEcole());

            }
            else
                System.out.println("La moyenne des 3A est de : " + getMoyenneDes3A() + "\n");
        }

        return str;
    }


    public void changerEcole(Etudiant etd, ecole e) throws EtudiantExisyteException{
        if(rechercherEtudiant(etd.getId())!=-1){
            etd.setEcole(e.nom);
            System.out.println("L'etudiant "+etd.getNom()+" "+etd.getPrenom()+" a changé d'ecole");
        }
        else
            throw new EtudiantExisyteException("L'etudiant n'existe pas");
        {
            System.out.println("L'etudiant n'existe pas");
        }
    }

}
