package prosit10;

import java.util.*;

public class DepartementHashSet implements IDepartement<Departement>{

    Set<Departement> departementSet ;
    public DepartementHashSet(){
        departementSet = new HashSet<>();
    }
    @Override
    public void ajouterDepartement(Departement departement) {
        departementSet.add(departement);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        Iterator<Departement> it = departementSet.iterator();
        while (it.hasNext()){
            if(it.next().getNom().equals(nom)) return true;
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement departement) {
        return departementSet.contains(departement);
    }

    @Override
    public void supprimerDepartement(Departement departement) {
        departementSet.remove(departement);
    }

    @Override
    public void displayDepartement() {
        System.out.println(departementSet);
    }

    @Override
    public TreeSet<Departement> trierDepartementById() {
        TreeSet<Departement> tree = new TreeSet<>(departementSet);
        return tree;
    }
}
