package org.example;

    public class Recording {
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


