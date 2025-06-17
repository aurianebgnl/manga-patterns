package src.model;

public class TwoMainCharacter extends MainCharacterDecorator{

    // protected MainCharacterImpl firstCharacter;
    // protected String secondNom;
    // protected String secondPrenom;

     private MainCharacter personnage2;

    // public TwoMainCharacter(MainCharacterImpl firstCharacter, String secondNom, String secondPrenom) {
    //     this.firstCharacter = firstCharacter;
    //     this.secondNom = secondNom;
    //     this.secondPrenom = secondPrenom;
    // }

   

    public TwoMainCharacter(MainCharacter characterOne, String nomCharacterTwo, String prenomCharacterTwo){
        super(characterOne);
        this.personnage2 = new MainCharacterImpl(nomCharacterTwo, prenomCharacterTwo);
    }

    @Override
    public String getFullName() {
        return String.format("%s ainsi que %s",super.mainCharacterDecorated.getFullName(),this.personnage2.getFullName());
    }
}
