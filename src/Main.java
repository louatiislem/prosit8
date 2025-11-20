
import entities.*;
import java.util.List;
import java.util.TreeMap;

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


        //prosit 10 Map
        //3 test
            AffectationHashMap hashmap = new AffectationHashMap();

            Employe e1m = new Employe(1, "Ali", "Trabelsi", "IT", 3);
            Employe e2m = new Employe(2, "Sarra", "Ben Ali", "RH", 2);
            Employe e3m = new Employe(3, "Moez", "Gharbi", "Finance", 4);

            Depatement d1m = new Depatement(10, "IT", 30);
            Depatement d2m= new Depatement(20, "RH", 20);
            Depatement d3m = new Depatement(30, "Finance", 15);

            // Ajout
            hashmap.ajouterEmployeDepartement(e1m, d1m);
            hashmap.ajouterEmployeDepartement(e2m, d2m);
            hashmap.ajouterEmployeDepartement(e3m, d3m);
            //affichage
            System.out.println("Affichage des affectations ");
            hashmap.afficherEmployesEtDepartement();

            System.out.println("Test double affectation");
            hashmap.ajouterEmployeDepartement(e1m, d3m);

            //suupression employe
        hashmap.supprimerEmploye(e2m);

        System.out.println("Après suppression");
        hashmap.afficherEmployesEtDepartement();
        //supprimer employe et departement
        hashmap.supprimerEmployeEtDepartement(e1m,d1m);

        //afficher employes
        hashmap.afficherEmployes();

        //afficher depatements
        hashmap.afficherDepartements();
        //recherche employes
        hashmap.rechercherEmploye(e3m);
        hashmap.rechercherEmploye(e1m);

        //recherche departement
        System.out.println("rech"+hashmap.rechercherDepartement(d1m));
        System.out.println("Avant tri :");
        hashmap.afficherEmployesEtDepartement();

        System.out.println("\nAprès tri par ID :");
        TreeMap<Employe, Depatement> tri = hashmap.trierMap();
        for(Employe e : tri.keySet()) {
            System.out.println(e + " -> " + tri.get(e));
        }


    }


}
