package common.data;

import common.edu.Topic;

import java.io.*;
import java.util.ArrayList;

public class ApplicationState implements Serializable {
    public ArrayList<Topic> topics;
    public ArrayList<LevelDescription> levels;

    // File saving:
    public String exportFolder;
    public String importFolder;


    public ApplicationState(ArrayList<Topic> topics, ArrayList<LevelDescription> levels) {
        this.levels = levels;
        this.topics = topics;
        exportFolder = "";
    }

    /**
     * Saves the application state in a serialized format.
     */
    public static void serializeAppState(ApplicationState appState, String saveFileLocation) {
        try {
            FileOutputStream file = new FileOutputStream(saveFileLocation);
            ObjectOutputStream out = new ObjectOutputStream(file);

            // Method for serialization of object
            out.writeObject(appState);

            out.close();
            file.close();

            System.out.println("Application state has been serialized");
        }
        catch (IOException ex) {
            System.out.println("IOException is caught:");
            ex.printStackTrace();
        }
    }

    /**
     * Deserializes the application state.
     * @return the application state that was stored in a save file. NULL if there was no save file or an error during the process.
     */
    public static ApplicationState deserializeAppState(String saveFileLocation) {
        ApplicationState appState = null;

        // Deserialization
        try
        {
            // Reading the object from a file
            FileInputStream file = new FileInputStream(saveFileLocation);
            ObjectInputStream in = new ObjectInputStream(file);

            // Method for deserialization of object
            appState = (ApplicationState) in.readObject();

            in.close();
            file.close();

            System.out.println("Application state has been deserialized ");
        }
        catch (InvalidClassException ex)
        {
            System.out.println("Tried to load save file from a different application version.");
        }

        catch(ClassNotFoundException ex)
        {
            System.out.println("Failed to deserialize app state: saved state was from a different version of the app.");
            //ex.printStackTrace();
        }

        catch(IOException ex)
        {
            System.out.println("Failed to deserialize app state: could not read from save file.");
            //ex.printStackTrace();
        }



        return appState;
    }

    public void updateLevels() {
        this.levels = new ArrayList<>();
        this.topics.forEach(topic -> {
            topic.lessons.forEach(lesson -> this.levels.add(lesson.learningLevel));
            this.levels.add(topic.testLevel);
        });
    }
}
