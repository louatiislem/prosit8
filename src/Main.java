
import entities.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //prosit8
        SocieteArrayList societe = new SocieteArrayList();

        // Création des employés
        Employe e1 = new Employe(1, "ahmed", "Ahmed", "Informatique", 3);
        Employe e2 = new Employe(2, "Tounsi", "Sami", "RH", 2);
        Employe e3 = new Employe(3, "Abdlkefi", "Nermine", "Informatique", 1);
        Employe e4 = new Employe(4, "Louati", "Islem", "Finance", 4);
        Employe e5 = new Employe(5, "Zaghdoudi ", "Roua", "Informatique", 2);

        // Ajout
        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);
        societe.ajouterEmploye(e4);
        societe.ajouterEmploye(e5);

        // Affichage
        societe.displayEmploye();

        // Recherche
        System.out.println("\n Recherche par nom (Louati) : " + societe.rechercherEmploye("Louati"));

        // Suppression
        societe.supprimerEmploye(e2);

        // Tri par ID
        societe.trierEmployeParId();

        // Tri personnalisé
        societe.trierEmployeParNomDépartementEtGrade();

        // Recherche avancée par département
        List<Employe> infoDept = societe.rechercherParDepartement("Informatique");
        System.out.println("\n  Employés du département Informatique :");
        for (Employe e : infoDept) {
            System.out.println(e);
        }

        //prosit 9
        //test
        DepartementHashSet dep =new DepartementHashSet();

        Depatement d1=new Depatement(1,"info",8);
        Depatement d2=new Depatement(2,"RH",15);
        Depatement d3=new Depatement(3,"Finance",10);
        Depatement d4=new Depatement(4,"comptabilité",4);
        dep.ajouterDepartement(d1);
        dep.ajouterDepartement(d2);
        dep.ajouterDepartement(d3);
        dep.ajouterDepartement(d4);

        System.out.println("Ajout:liste des deoartement");
        dep.afficherDepartements();

        System.out.println("recherche par nom departement 'info' :"+dep.rechercherDepartement("info"));
        System.out.println("recherche :"+dep.rechercherDepartement(d3.getNomDepartement()));

        System.out.println("trier par ID");
        dep.trierDepartementsParId();

        System.out.println("trier par nom et nombre employes");
        dep.trierDepartementsParNomEtNombreEmployes();

        System.out.println("supppression");
        dep.supprimerDepartement(d4);

    }


}
