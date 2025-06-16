public class Main {
    
    public static void main (String[] args){
    MangaFactory mangaFactory = new MangaFactory();

    Manga jujustsuKaisen = mangaFactory.createManga(TypeManga.SHONEN, "Jujutsu Kaisen","Itadori", "Yūji");
    Manga cardcaptorSakura = mangaFactory.createManga(TypeManga.SHOJO, "Cardcaptor Sakura", "Kinomoto", "Sakura");

    System.out.println(jujustsuKaisen.getDescription());
    System.out.println(cardcaptorSakura.getDescription());
    }
}

