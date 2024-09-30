import AbstractFactory.*;
import BuilderPattern.TicketBooking;
import BuilderPattern.TicketBookingBuilder;
import PrototypePattern.MovieSchedule;
import PrototypePattern.StandardSchedule;
import Singleton.CinemaConfig;
import Factory.Movie;
import Factory.MovieFactory;
import Factory.RegularMovieFactory;

/*
    Main Application (from Assignment).
    I upgraded a little bit a code for better test.
*/
public class CinemaManagementApp {
    public static void main(String[] args) {
        // Singleton usage
        System.out.println("Singleton:");
        CinemaConfig config = CinemaConfig.getInstance();
        config.setCinemaName("Starlight Cinemas");
        System.out.println("Cinema Name: " + config.getCinemaName());

        System.out.println();

        // Factory Method usage
        System.out.println("Factory Method:");
        MovieFactory regularFactory = new RegularMovieFactory();
        Movie movie = regularFactory.createMovie("Inception");
        System.out.println("Movie: " + movie.getTitle() + ", Type: " + movie.getType());

        System.out.println();

        // Abstract Factory usage
        System.out.println("Abstract Factory Method:");
        UIFactory darkThemeFactory = new DarkThemeFactory();
        UIFactory lightThemeFactory = new LightThemeFactory();

        Button darkButton = darkThemeFactory.createButton();
        Button lightButton = lightThemeFactory.createButton();
        TextField lightTextField = lightThemeFactory.createTextField();
        TextField darkTextField = darkThemeFactory.createTextField();
        darkButton.render();
        lightButton.render();
        darkTextField.render();
        lightTextField.render();

        System.out.println();

        // Builder usage
        System.out.println("Builder Pattern:");
        TicketBooking booking = new TicketBookingBuilder()
                .setMovieTitle("Inception")
                .setSeatNumber("A1")
                .setSnackCombo("Popcorn and Soda")
                .build();

        System.out.println(booking);

        System.out.println();

        // Prototype usage
        StandardSchedule template = new StandardSchedule();
        template.setTime("18:00");
        MovieSchedule eveningSchedule = template.clone();
        eveningSchedule.setMovie(movie);
        System.out.println("Cinema Management System initialized.");
        System.out.println(eveningSchedule);
    }
}