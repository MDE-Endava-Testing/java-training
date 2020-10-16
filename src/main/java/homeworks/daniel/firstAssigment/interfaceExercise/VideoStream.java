package interfaceExercise;

public class VideoStream implements MediaSource, DynamicSource {
    private String sourceURL;
    private String resolution ;
    private String format ;
    /**
     * Loads the file into the web media player
     */
    @Override
    public void loadSource() {
        System.out.println("stream loaded");
    }
    /**
     * Selects the play option for the web media player, reproducing the file
     */
    @Override
    public void play() {
        System.out.println("playing stream");
    }
    /**
     * Selects the stop option for the web media player, stopping the player
     */
    @Override
    public void stop() {
        System.out.println("stopping stream");
    }
}
