package stepclass3rdsem.weekseven;
class Playlist {
    private String[] songs;
    private int count;

    Playlist(int maxSize) {
        songs = new String[maxSize];
        count = 0;
    }

    void addSong(String title) {
        if (count < songs.length) {
            songs[count++] = title;
        } else {
            System.out.println("Playlist full!");
        }
    }

    String[] getSongs() {
        String[] copy = new String[count];
        System.arraycopy(songs, 0, copy, 0, count);
        return copy;
    }

    int getSongCount() {
        return count;
    }
}

public class Playlist1 {
    public static void main(String[] args) {
        Playlist p = new Playlist(10);
        p.addSong("Song A");
        p.addSong("Song B");

        String[] copy = p.getSongs();
        copy[0] = "Hacked";

        System.out.println("Original first song: " + p.getSongs()[0]);
        System.out.println("Song count: " + p.getSongCount());
    }
}


