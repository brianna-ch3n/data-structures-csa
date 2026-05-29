public class Playlist
{
   private SongNode head;

   public void addToFront(Song s)
   {
      SongNode newNode = new SongNode(s);
      newNode.next = head;
      head = newNode;
   }

   public void addToEnd(Song s)
   {
      SongNode newNode = new SongNode(s);
      if (head == null)
      {
         head = newNode;
      }
      else
      {
         SongNode current = head;
         while (current.next != null)
         {
            current = current.next;
         }
         current.next = newNode;
      }
   }

   public Song removeFirst()
   {
      if (head == null)
      {
         return null;
      }
      Song first = head.data;
      head = head.next;
      return first;
   }

   public void playAll()
   {
      SongNode current = head;
      while (current != null)
      {
         System.out.println(current.data);
         current = current.next;
      }
   }

   public int size()
   {
      int count = 0;
      SongNode current = head;
      while (current != null)
      {
         count++;
         current = current.next;
      }
      return count;
   }

   public void removeSong(String title)
   {
      if (head == null)
      {
         return;
      }
      if (head.data.getTitle().equals(title))
      {
         head = head.next;
         return;
      }
      SongNode current = head;
      while (current.next != null)
      {
         if (current.next.data.getTitle().equals(title))
         {
            current.next = current.next.next;
            return;
         }
         current = current.next;
      }
   }
}
