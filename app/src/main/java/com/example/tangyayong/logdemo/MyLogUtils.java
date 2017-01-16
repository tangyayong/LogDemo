package com.example.tangyayong.logdemo;

import android.os.Environment;
import android.util.Log;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

/**
 * Created by sunfei on 2016/12/15.
 */
public class MyLogUtils {



    public static void writeLog(String msg) {{

        String logPath;
        if (Environment.getExternalStorageState().equals(
                Environment.MEDIA_MOUNTED)) {
            logPath = Environment.getExternalStorageDirectory()
                    .getAbsolutePath()
                    + File.separator
                    + File.separator
                    + "ttttt";

            File file = new File(logPath);
            if (!file.exists()) {
                file.mkdirs();
            }
            try {
                FileWriter fw = new FileWriter(logPath + File.separator
                        + "sssss.txt", true);
                fw.write(new Date() + "\n");
                fw.write(msg);
                fw.write("\n");
                fw.close();
                Log.i("123456","success");
            } catch (IOException e) {
            }
        }
    }}
}