package movie;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MovieService {

    private List<Movie> movies = new ArrayList<>();

    public void save(Movie movie) {
        movies.add(movie);
    }

    public Optional<Movie> findNewest() {
        return movies.stream().max(Comparator.comparing(Movie::getReleaseDate));
    }

    public List<Movie> findByNamePart(String namePart) {
        return movies.stream()
                .filter(m -> m.getName().contains(namePart))
                .toList();
    }
}
