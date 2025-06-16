public class MangaFactory {
    public Manga createManga(TypeManga type, String titre, String nom, String prenom) {
        MainCharacterImpl mainCharacterPrincipal = new MainCharacterImpl(nom, prenom);
        switch (type) {
            case SHONEN:
                return 
                new Shonen(titre, mainCharacterPrincipal);
            case SHOJO:
                return 
                new Shojo(titre, mainCharacterPrincipal);
            default:
                throw new IllegalArgumentException("Type de manga inconnu: " + type);
        }
    }

}
