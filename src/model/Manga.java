package src.model;
public abstract class Manga {

    protected String titre;
    protected MainCharacter mainCharacter;

    public String getTitre() {
        return titre;
    }

    public MainCharacter getPersonnagePrincipal() {
        return mainCharacter;
    }

    public String getStringType(){
        return "manga";
    }
    public String getDescription(){
        return String.format("Ce %s s'appelle %s et son personnage principal est %s", getStringType(),titre, mainCharacter.getFullName());
    }
}