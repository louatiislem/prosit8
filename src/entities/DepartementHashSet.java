package entities;

import interfaces.IDepartement;

import java.util.*;

public class DepartementHashSet implements IDepartement<Depatement> {
    private Set<Depatement> depatements = new HashSet<>();

    @Override
    public void ajouterDepartement(Depatement dep) {
        this.depatements.add(dep);
    }
    @Override
    public boolean rechercherDepartement(String nomDepartement) {
        for (Depatement dep : this.depatements) {
            if (dep.getNomDepartement().equals(nomDepartement)) {
                this.ajouterDepartement(dep);
                return true;
            }

        }return false;
    }
    @Override
    public boolean rechercherDepartement(Depatement dep) {
        return depatements.contains(depatements);

    }
    @Override
    public void supprimerDepartement(Depatement dep) {
        this.depatements.remove(dep);
    }

    @Override
    public void afficherDepartements() {
        for (Depatement dep : this.depatements) {
            System.out.println(dep);
        }
    }
    @Override
    public void trierDepartementsParId(){
        List<Depatement> departements = new ArrayList<>(depatements);
        departements.sort(Comparator.comparingInt(Depatement::getId).reversed());
        departements.forEach(System.out::println);
    }
    @Override
    public void trierDepartementsParNomEtNombreEmployes(){
        List<Depatement> liste = new ArrayList<>(depatements);
        liste.sort(Comparator.comparing(Depatement::getNomDepartement)
                .thenComparingInt(Depatement::getNombreEmployes));
        liste.forEach(System.out::println);
    }

}
