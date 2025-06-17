package src.controller;

import src.model.MainCharacter;
import src.model.MainCharacterImpl;
import src.model.Manga;
import src.model.MangaFactory;
import src.model.TwoMainCharacter;
import src.model.TypeManga;

public class Main {
    public static void main (String[] args){

        try {
            
            MangaFactory singletonMangaFactory = MangaFactory.getSingleton();

            Manga jujustsuKaisen = singletonMangaFactory.createManga(TypeManga.SHONEN, "Jujutsu Kaisen","Itadori", "Yūji");
            Manga cardcaptorSakura = singletonMangaFactory.createManga(TypeManga.SHOJO, "Cardcaptor Sakura", "Kinomoto", "Sakura");

            singletonMangaFactory.getRepository().save(jujustsuKaisen);
            singletonMangaFactory.getRepository().save(cardcaptorSakura);

            System.out.println(jujustsuKaisen.getDescription());
            System.out.println(cardcaptorSakura.getDescription());

            MainCharacter mainCharacter = new TwoMainCharacter(new MainCharacterImpl("Ōsaki","Nana"),"Komatsu","Nana");
            Manga nana = singletonMangaFactory.createManga(TypeManga.SHOJO, "Nana", mainCharacter);

            
            System.out.println(nana.getDescription());

            

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}

