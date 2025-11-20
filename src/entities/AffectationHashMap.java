package entities;

import java.util.*;

public class AffectationHashMap {
    private Map<Employe,Depatement> map;
    private List<Depatement> depatements;
    public AffectationHashMap() {
        map = new HashMap<>();
    }
    public void ajouterEmployeDepartement(Employe e ,Depatement d){
        if (map.containsKey(e)) {
            System.out.println("Cet employé est déjà affecté à un département");
        } else {
            map.put(e, d);
            System.out.println(" Employé affecté avec succès au département " + d.getNomDepartement());
        }
    }
    public void afficherEmployesEtDepartement(){
        if (map.isEmpty()) {
            System.out.println("Aucune affectation trouvée");
            return;
        }

        for (Map.Entry<Employe, Depatement> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
    public void supprimerEmploye(Employe e){
        if (map.containsKey(e)) {
            map.remove(e);
            System.out.println(" Employé supprimé avec succès");
        } else {
            System.out.println("Employé introuvable");
        }
    }
    public void supprimerEmployeEtDepartement(Employe e, Depatement d) {
        if (map.containsKey(e)) {
            if (map.get(e).equals(d)) {
                map.remove(e);
                System.out.println("L'affectation de " + e.getNom() + " au département "
                        + d.getNomDepartement() + " a été supprimée.");
            } else {
                System.out.println("Cet employé est affecté à un autre département. Suppression impossible.");
            }
        } else {
            System.out.println("Employé non trouvé. Aucune affectation supprimée.");
        }
    }
    public void afficherEmployes() {
        if (map.isEmpty()) {
            System.out.println("Aucun employé n'est présent dans la collection.");
            return;
        }

        System.out.println("Liste des employés :");
        for (Employe e : map.keySet()) {
            System.out.println("*" + e);
        }
    }
    public void afficherDepartements(){
        if(map.isEmpty()){
            System.out.println("aucun departement est present");
            return;
        }
        System.out.println("Liste des departement :");
        Set<Depatement> depatements = new HashSet<>(map.values());
        for (Depatement d : depatements) {
            System.out.println("*" + d);
        }
    }
    public boolean rechercherEmploye(Employe e){
        if (map.containsKey(e)) {
            System.out.println("Employé trouvé : " + e.getNom() + " " + e.getPrenom());
            return true;
        } else {
            System.out.println("Employé introuvable ");
            return false;
        }
    }
    public boolean rechercherDepartement(Depatement d){
        return depatements.contains(d);
    }
    public TreeMap<Employe, Depatement> trierMap() {
        TreeMap<Employe, Depatement> triMap = new TreeMap<>();
        triMap.putAll(this.map);
        return triMap;
    }





}
