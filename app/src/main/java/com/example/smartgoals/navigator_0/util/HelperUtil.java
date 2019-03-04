package com.example.smartgoals.navigator_0.util;

import android.util.Log;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class HelperUtil {
    public static void CopyDB(InputStream inputStream, OutputStream outputStream) throws IOException {
        //---copy 1K bytes at a time---
        byte[] buffer = new byte[1024];
        int length;
        while ((length = inputStream.read(buffer)) > 0) {
            outputStream.write(buffer, 0, length);
        }
        inputStream.close();
        outputStream.close();
    }

    public static boolean isEmpty(EditText txtValue) {
        return txtValue.getText().toString() == "" || txtValue.getText().toString().length() == 0;
    }

    public static boolean isEmpty(CheckBox txtValue) {
        return txtValue.getText().toString() == "" || txtValue.getText().toString().length() == 0;
    }

    public static boolean isEmpty(TextView txtValue) {
        return txtValue.getText().toString() == "" || txtValue.getText().toString().length() == 0 || txtValue.getText().toString() == "0";
    }

    public static boolean getBoolValue(int txtValue) {
        try {
            return txtValue != 0;
        } catch (Exception e) {
            Log.e("dataactivity", e.getMessage());
        }
        return false;
    }

    public static int getIntValue(CheckBox txtValue) {
        int boolValue = 0;

        try {
            if (txtValue.isChecked() == false)
                return boolValue;
            else return 1;
        } catch (Exception e) {
            Log.e("dataactivity", e.getMessage());
        }
        return boolValue;
    }

}
