package src.model;
public class Shojo extends Manga{
    public Shojo(String titre, MainCharacter mainCharacter) {
        this.titre = titre;
        this.mainCharacter = mainCharacter;
    }

    @Override
    public String getStringType(){
        return "shojo";
    }
}