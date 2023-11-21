import java.util.Scanner;
import ecole.etudiant.Etudiant;
import ecole.etudiant.EtudiantExisyteException;
import ecole.etudiant.etudiantalternance;
import ecole.ecole;
public class Main {
    //main function to test the program
    public static void main(String[] args) throws EtudiantExisyteException {
        Scanner sc = new Scanner(System.in);
        ecole ecole = new ecole();
        ecole.ajouterEtudiant(new Etudiant(1, "mohamed", "ali", 12, 0, "esprit"));
        ecole.ajouterEtudiant(new Etudiant(2, "mohamed", "ali", 12, 0, "esprit"));
        ecole.ajouterEtudiant(new Etudiant(3, "mohamed", "ali", 12, 0, "esprit"));
        ecole.ajouterEtudiant(new Etudiant(4, "mohamed", "ali", 12, 0, "esprit"));
        ecole.ajouterEtudiant(new Etudiant(5, "mohamed", "ali", 12, 0, "esprit"));
        ecole.ajouterEtudiant(new Etudiant(6, "mohamed", "ali", 12, 0, "esprit"));
        ecole.ajouterEtudiant(new Etudiant(7, "mohamed", "ali", 12, 0, "esprit"));
        ecole.ajouterEtudiant(new Etudiant(8, "mohamed", "ali", 12, 0, "esprit"));
        ecole.ajouterEtudiant(new Etudiant(9, "mohamed", "ali", 12, 0, "esprit"));
        ecole.ajouterEtudiant(new Etudiant(10, "mohamed", "ali", 12, 0, "esprit"));
       // ecole.ajouterEtudiant(new etudiantalternance(1000, "mohamed", "ali"));
    }
}
