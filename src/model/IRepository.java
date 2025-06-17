package src.model;

import java.util.List;

public interface IRepository {
    public void save(Manga manga);

    public void update(Manga mangaUpdated);

    public void delete(Manga manga);

    public List<Manga> getAllMangas();

    public Manga getMangaByTitle(String titre);

}
