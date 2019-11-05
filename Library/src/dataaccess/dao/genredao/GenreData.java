package dataaccess.dao.genredao;

import data.entity.Genre;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GenreData {
    public static List<Genre> genres = new ArrayList<>();
    public static Map<Long,Genre> genreMap;

    static {

        Genre genre1 = new Genre();
        genre1.setCode(45);
        genre1.setDescription("This is an active client account");
        genre1.setName("ActiveClientStatus");
        genre1.setID((long) 1);

        Genre genre2 = new Genre();
        genre2.setCode(46);
        genre2.setDescription("This is an inactive client account");
        genre2.setName("InactiveClientStatus");
        genre2.setID((long) 2);

        genres.add(genre2);
        genres.add(genre2);

        genreMap = genres
                .stream()
                .collect(Collectors.toMap(Genre::getID, item -> item));
    }
}
