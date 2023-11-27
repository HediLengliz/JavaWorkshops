package prosit10;

import java.util.Objects;

public class Departement implements Comparable<Departement>{

    int id, nbrEmployer;
    String nom;

    public Departement() {
    }

    public Departement(int id, int nbrEmployer, String nom) {
        this.id = id;
        this.nbrEmployer = nbrEmployer;
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNbrEmployer() {
        return nbrEmployer;
    }

    public void setNbrEmployer(int nbrEmployer) {
        this.nbrEmployer = nbrEmployer;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(obj == this) return true;
        if(obj instanceof Departement departement)
            return departement.getId()== id && departement.getNom().equals(nom);
        return false;
    }

    @Override
    public int hashCode() {
        return 35*id + 22+ nom.hashCode();
    }

    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nbrEmployer=" + nbrEmployer +
                ", nom='" + nom + '\'' +
                '}';
    }

    @Override
    public int compareTo(Departement o) {
        return this.id-o.getId();
    }
}
