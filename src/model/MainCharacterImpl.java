package src.model;
public class MainCharacterImpl implements MainCharacter {

    private String nom;
    private String prenom;

    public MainCharacterImpl(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    @Override
    public String getFullName() {
        return String.format("%s %s",prenom,nom);
    }
}
