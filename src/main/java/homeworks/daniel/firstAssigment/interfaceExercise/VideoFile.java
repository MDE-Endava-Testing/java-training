package homeworks.daniel.firstAssigment.interfaceExercise;

public class VideoFile implements MediaSource, DynamicSource {
    private String filepath ;
    private String fileSize ;
    private String resolution ;
    private String format ;
    private String lengthTime;
    /**
     * Loads the file into the web media player
     */
    @Override
    public void loadSource() {
        System.out.println("video loaded");
    }
    /**
     * Selects the play option for the web media player, reproducing the file
     */
    @Override
    public void play() {
        System.out.println("playing video");
    }
    /**
     * Selects the stop option for the web media player, stopping the player
     */
    @Override
    public void stop() {
        System.out.println("stopping video");
    }
}
