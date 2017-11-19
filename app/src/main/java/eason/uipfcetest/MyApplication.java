package eason.uipfcetest;

import android.app.Application;

import org.acra.ACRA;
import org.acra.ReportField;
import org.acra.ReportingInteractionMode;
import org.acra.annotation.ReportsCrashes;

/**
 * Created by easonzhang on 2017/11/19.
 */
@ReportsCrashes(
        mailTo = "eason_zhang_sh@sina.com",
        customReportContent = { ReportField.APP_VERSION_CODE, ReportField.APP_VERSION_NAME, ReportField.ANDROID_VERSION, ReportField.PHONE_MODEL, ReportField.CUSTOM_DATA, ReportField.STACK_TRACE, ReportField.LOGCAT },
        mode = ReportingInteractionMode.TOAST,
        resToastText = R.string.crash_toast_text)
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
//        BlockDetectByPrinter.start();
//        BlockDetectByChoreographer.start();
        BlockDetectByLooper.start();
        ACRA.init(this);
    }
}
