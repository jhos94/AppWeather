package org.example;

import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new WeatherAppGui().setVisible(true);
            /*
                System.out.println(WeatherApp.getLocationData("Tokyo"));
                 System.out.println(WeatherApp.getCurrentTime());
            */

            }
        });
    }
}