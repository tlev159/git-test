package movie;

import java.util.ArrayList;
import java.util.List;

public class MovieService {

    private List<Movie> movies = new ArrayList<>();

    public void save(Movie movie) {
        movies.add(movie);
    }

    public Movie findNewest() {
        return movies.stream()
                .max(m-> m.getReleaseDate());
    }

    public List<Movie> findByNamePart(String namePart) {
        return movies.stream()
                .filter(m -> m.getName().contains(namePart))
                .toList();
    }
}
