package fr.ada.frances;

import java.util.ArrayList;
import java.util.List;

public class MemoryRepository implements IRepository{

    private List<Manga> mangaList = new ArrayList<>();

    @Override
    public void save(Manga manga) {
        System.out.println(String.format("Le manga '%s' vient d'être sauvegardé", manga.getTitre()));
        this.mangaList.add(manga);
    }

    @Override
    public void update(Manga mangaUpdated) {
        System.out.println(String.format("Le manga '%s' vient d'être modifié", mangaUpdated.getTitre()));
        // TODO
    }

    @Override
    public void delete(Manga manga) {
        // TODO
    }

    @Override
    public List<Manga> getAllMangas() {
        return this.mangaList;
    }

    @Override
    public Manga getMangaByTitle(String titre) {
        return null;
    }
}
