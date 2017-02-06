package org.telegram.messenger;

/**
 * Created by danielklokov on 01/02/2017.
 */

public interface MediaControllerProgressListener {
    void OnConvertVideoProgress(MediaControllerProgress progress, VideoEditedInfo videoEditedInfo, long totalConverted);
}
