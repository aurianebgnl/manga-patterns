public class Shonen extends Manga{

    public Shonen(String titre, IMainCharacter mainCharacterPrincipal) {
        this.titre = titre;
        this.mainCharacterPrincipal = mainCharacterPrincipal;
    }

    @Override
    public String getStringType(){
        return "shonen";
    }
}