package org.example;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

    public class RecordingSort {
        public static void main(String[] args) {
            final int RECORDING_COUNT = 5;
            Scanner scanner = new Scanner(System.in);
            Recording[] recordings = new Recording[RECORDING_COUNT];

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

                recordings[i] = new Recording(title, artist, playingTime);
            }

            // Prompt the user to choose the sorting field
            System.out.println("\nSort by (1) Title, (2) Artist, (3) Playing Time?");
            int choice = scanner.nextInt();

            // Perform the sorting based on user choice
            switch (choice) {
                case 1:
                    Arrays.sort(recordings, Comparator.comparing(Recording::getTitle));
                    break;
                case 2:
                    Arrays.sort(recordings, Comparator.comparing(Recording::getArtist));
                    break;
                case 3:
                    Arrays.sort(recordings, Comparator.comparingInt(Recording::getPlayingTime));
                    break;
                default:
                    System.out.println("Invalid choice. No sorting performed.");
                    break;
            }

            // Display the sorted Recording objects
            System.out.println("\nSorted Recordings:");
            for (Recording recording : recordings) {
                recording.displayDetails();
                System.out.println();
            }

            scanner.close();
        }
    }


