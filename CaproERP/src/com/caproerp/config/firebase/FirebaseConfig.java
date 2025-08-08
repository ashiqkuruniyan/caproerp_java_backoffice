/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.caproerp.config.firebase;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import java.io.FileInputStream;
/**
 *
 * @author PNG
 */
public class FirebaseConfig {
    public static void initialize() {
        try {
            FileInputStream serviceAccount = new FileInputStream("serviceAccountKey.json");

//            FirebaseOptions options = FirebaseOptions.builder()
//                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
//                .setDatabaseUrl("https://firebase-adminsdk-rezdd@caproerp-fe846.iam.gserviceaccount.com") 
//                .build();

//            FirebaseApp.initializeApp(options);
            System.out.println("Firebase initialized successfully.");

        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Firebase initialization failed.");
        }
    }
}
