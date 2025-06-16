public abstract class Manga {

    protected String titre;
    protected IMainCharacter mainCharacterPrincipal;

    public String getTitre() {
        return titre;
    }

    public IMainCharacter getPersonnagePrincipal() {
        return mainCharacterPrincipal;
    }

    public String getStringType(){
        return "manga";
    }
    public String getDescription(){
        return String.format("Ce %s s'appelle %s et son personnage principal est %s", getStringType(),titre, mainCharacterPrincipal.getFullName());
    }
}