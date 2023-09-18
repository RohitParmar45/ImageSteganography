package com.example.imagesteganography.Text.AsyncTaskCallback;

import com.example.imagesteganography.Text.ImageSteganography;

/**
 * This the callback interface for TextDecoding AsyncTask.
 */

public interface TextDecodingCallback {

    void onStartTextEncoding();

    void onCompleteTextEncoding(ImageSteganography result);

//    void onCompleteTextEncoding(ImageSteganography result);
}
