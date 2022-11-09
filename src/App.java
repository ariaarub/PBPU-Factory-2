
import Buttons.*;
import Checkboxes.*;
import Factories.*;
import App.*;

public class App {
    public static void main(String[] args) throws Exception {
        Application app = configureApplication();
        app.paint();
    }

/**
     * Application picks the factory type and creates it in run time (usually at
     * initialization stage), depending on the configuration or environment
     * variables.
     */
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        return app;
    }

}
