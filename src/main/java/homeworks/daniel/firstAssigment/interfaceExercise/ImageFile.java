package homeworks.daniel.firstAssigment.interfaceExercise;

/**
 * Image file specification
 */
public class ImageFile implements MediaSource{
    private String filepath ;
    private String fileSize ;
    private String resolution ;
    private String format ;

    /**
     * Loads the file into the web media player
     */
    @Override
    public void loadSource() {
        System.out.println("image loaded");
    }

}
