package fr.ada.frances;

public abstract class MainCharacterDecorator implements MainCharacter {

    protected MainCharacter mainCharacterDecorated;

    public MainCharacterDecorator(MainCharacter mainCharacterToDecorate){
        this.mainCharacterDecorated = mainCharacterToDecorate;
    }

}
