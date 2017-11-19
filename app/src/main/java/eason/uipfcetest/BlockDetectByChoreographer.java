package eason.uipfcetest;

import android.view.Choreographer;

/**
 * Created by easonzhang on 2017/11/19.
 */

public class BlockDetectByChoreographer {
    public static void start() {
        Choreographer.getInstance()
                .postFrameCallback(new Choreographer.FrameCallback() {
                    @Override
                    public void doFrame(long l) {
                        if (LogMonitor.getInstance().isMonitor()) {
                            LogMonitor.getInstance().removeMonitor();
                        }
                        LogMonitor.getInstance().startMonitor();
                        Choreographer.getInstance().postFrameCallback(this);
                    }
                });
    }
}
