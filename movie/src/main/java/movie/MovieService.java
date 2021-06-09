package movie;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MovieService {

    private List<Movie> movies = new ArrayList<>();

    public void save(Movie movie) {
        movies.add(movie);
    }

    public Movie findNewest() {
        movies.stream()
                .max(compareTo).get();
    }

    public List<Movie> findByNamePart(String namePart) {
        return movies.stream()
                .filter(m -> m.getName().contains(namePart))
                .toList();
    }
}
