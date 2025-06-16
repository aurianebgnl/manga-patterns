public class Shojo extends Manga{
    public Shojo(String titre, IMainCharacter mainCharacterPrincipal) {
        this.titre = titre;
        this.mainCharacterPrincipal = mainCharacterPrincipal;
    }

    @Override
    public String getStringType(){
        return "shojo";
    }
}