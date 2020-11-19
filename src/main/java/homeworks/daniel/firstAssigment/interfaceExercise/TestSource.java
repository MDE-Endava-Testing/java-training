package homeworks.daniel.firstAssigment.interfaceExercise;

import java.util.ArrayList;
import java.util.List;

public class TestSource {
    public static void main(String[] args) {

        List<MediaSource> sources = new ArrayList();
        sources.add(new AudioFile());
        sources.add(new ImageFile());
        sources.add(new VideoFile());
        sources.add(new VideoStream());

        for (MediaSource source:sources) {
            checkMediaPlayer(source);
        }
    }

    /**
     * Executes the basic functionalities of the web media player
     * @param mediaSource contains the source that is into be loaded to the web media player
     */
    private static void checkMediaPlayer(MediaSource mediaSource){
        mediaSource.loadSource();
        if (mediaSource instanceof DynamicSource){
            ((DynamicSource) mediaSource).play();
            ((DynamicSource) mediaSource).stop();
        }
    }
}
