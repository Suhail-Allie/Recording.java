package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//Recording
        class Recording {
            private String title;
            private String artist;
            private int playingTime; // in seconds

            // Constructor
            public Recording(String title, String artist, int playingTime) {
                this.title = title;
                this.artist = artist;
                this.playingTime = playingTime;
            }

            // Getter for title
            public String getTitle() {
                return title;
            }

            // Setter for title
            public void setTitle(String title) {
                this.title = title;
            }

            // Getter for artist
            public String getArtist() {
                return artist;
            }

            // Setter for artist
            public void setArtist(String artist) {
                this.artist = artist;
            }

            // Getter for playing time
            public int getPlayingTime() {
                return playingTime;
            }

            // Setter for playing time
            public void setPlayingTime(int playingTime) {
                this.playingTime = playingTime;
            }

            // Optional: Method to display recording details
            public void displayDetails() {
                System.out.println("Title: " + title);
                System.out.println("Artist: " + artist);
                System.out.println("Playing Time: " + playingTime + " seconds");
            }
        }

        //RecordingSort
        class RecordingSort {
            public static void main(String[] args) {
                final int RECORDING_COUNT = 5;
                Scanner scanner = new Scanner(System.in);
                org.example.Recording[] recordings = new org.example.Recording[RECORDING_COUNT];

                // Prompt the user to enter details for each Recording
                for (int i = 0; i < RECORDING_COUNT; i++) {
                    System.out.println("Enter details for Recording #" + (i + 1) + ":");

                    System.out.print("Title: ");
                    String title = scanner.nextLine();

                    System.out.print("Artist: ");
                    String artist = scanner.nextLine();

                    System.out.print("Playing Time (in seconds): ");
                    int playingTime = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character

                    recordings[i] = new org.example.Recording(title, artist, playingTime);
                }

                // Prompt the user to choose the sorting field
                System.out.println("\nSort by (1) Title, (2) Artist, (3) Playing Time?");
                int choice = scanner.nextInt();

                // Perform the sorting based on user choice
                switch (choice) {
                    case 1:
                        Arrays.sort(recordings, Comparator.comparing(org.example.Recording::getTitle));
                        break;
                    case 2:
                        Arrays.sort(recordings, Comparator.comparing(org.example.Recording::getArtist));
                        break;
                    case 3:
                        Arrays.sort(recordings, Comparator.comparingInt(org.example.Recording::getPlayingTime));
                        break;
                    default:
                        System.out.println("Invalid choice. No sorting performed.");
                        break;
                }

                // Display the sorted Recording objects
                System.out.println("\nSorted Recordings:");
                for (org.example.Recording recording : recordings) {
                    recording.displayDetails();
                    System.out.println();
                }

                scanner.close();
            }
        }



    }
}