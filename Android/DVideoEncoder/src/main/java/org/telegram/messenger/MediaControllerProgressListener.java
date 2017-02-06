package org.telegram.messenger;

/**
 * Created by danielklokov on 01/02/2017.
 */

public interface MediaControllerProgressListener {
    void onConvertVideoFailed(VideoEditedInfo videoEditedInfo);
    void onConvertVideoStarted(VideoEditedInfo videoEditedInfo);
    void onConvertVideoNewChunkAvailable(VideoEditedInfo videoEditedInfo);
    void onConvertVideoFinished(VideoEditedInfo videoEditedInfo, long totalConverted);
}
