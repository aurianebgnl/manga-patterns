package src.model;
public class Shonen extends Manga{

    public Shonen(String titre, MainCharacter mainCharacter) {
        this.titre = titre;
        this.mainCharacter = mainCharacter;
    }

    @Override
    public String getStringType(){
        return "shonen";
    }
}