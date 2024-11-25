/**
 * The main application class.
 */
public class App {
    /**
     * The main entry point of the application.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        App app = new App();
        app.start(); 1
    }

    /**
     * Initializes and starts the application.
     */
    private void start() {
        Bootstrap bootstrap = new Bootstrap();
        bootstrap.wiringStart();
    }
}