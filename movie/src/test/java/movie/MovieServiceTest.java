package movie;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class MovieServiceTest {

    MovieService movieService;


    @BeforeEach
    void init () {
        movieService.save(new Movie("Csillagok háborúja", 90, LocalDate.of(1980, 10, 10)));
        movieService.save(new Movie("Gyűrűk ura", 1200, LocalDate.of(2000, 10, 10)));
        movieService.save(new Movie("Majmok bolygója", 110, LocalDate.of(1985, 10, 10)));


    }

    @Test
    void findNewestTest() {
//


    }

}