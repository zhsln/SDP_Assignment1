package Singleton;

public class CinemaConfig {
    private static CinemaConfig cinemaConfig;
    private String cinemaName;
    private Integer numOfScreens;

    private CinemaConfig() {
        // It can be left empty since the values will be set through setters.
    }

    public static CinemaConfig getInstance() {
        if (cinemaConfig == null)
            cinemaConfig = new CinemaConfig();

        return cinemaConfig;
    }

    // Getters and setters.
    public String getCinemaName() {
        return cinemaName;
    }
    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
    }
    public Integer getNumOfScreens() {
        return numOfScreens;
    }
    public void setNumOfScreens(Integer numOfScreens) {
        this.numOfScreens = numOfScreens;
    }
}
