package src.model;

public class MangaFactory {

    // On utilise le mot clé static pour pouvoir écrire dans main MangaFactory.getSingleton(), et pas forcément MF1.getSingleton()
    // static = l'instance est partagée entre toutes les classes qui utilisent MangaFactory
    private static MangaFactory singleton; // on appelle l'attribut singleton comme on aurait pu l'appeler instance

    // On appelle le constructeur en privé pour empêcher l'instanciation directe de la classe
    private MangaFactory(){
        // On initialise le repository en mémoire. comme MangaFactory est un singleton, il n'y a qu'une seule instance de repository
        
    }

    // ici, on crée la méthode statique publique qui permet de récupérer l'instance unique de MangaFactory
    public static MangaFactory getSingleton(){
        if (singleton == null){
            singleton = new MangaFactory();
        }
        return singleton;
    }

        // grâce au polymorphisme et la surcharge de méthodes, on peut avoir deux méthodes createManga différentes, avec des chaînes de paramètres différents
    public Manga createManga(TypeManga type, String titre, String nom, String prenom) {
        MainCharacter mainCharacter = new MainCharacterImpl(nom, prenom);

        return createManga(type, titre, mainCharacter);
    }

    // grâce au polymorphisme et la surcharge de méthodes, on peut avoir deux méthodes createManga différentes, avec des chaînes de paramètres différents
    public Manga createManga(TypeManga type, String titre, MainCharacter mainCharacter) {
        
        switch (type) {
            case SHONEN:
                return 
                new Shonen(titre, mainCharacter);
            case SHOJO:
                return 
                new Shojo(titre, mainCharacter);
            default:
                throw new IllegalArgumentException("Type de manga inconnu: " + type);
        }
    }



}
