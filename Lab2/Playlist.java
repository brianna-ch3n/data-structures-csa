import java.util.LinkedList;

public class Playlist{
  private LinkedList<Song> songs = new LinkedList<>();
}

public void addToFront(Song song) {
    songs.addFirst(song);
}

public void addToEnd(Song song){
    songs.addLast(song);
}

public Song nowPlaying(){
    return songs.peekFirst();
}

public Song skip(){
    if (songs.isEmpty())
    {
        return null;
    }

    return songs.removeFirst();
}

public int size(){
    return songs.size();
}

public void printPlaylist(){
    for (Song s : songs)
    {
        System.out.println(s);
    }
}
