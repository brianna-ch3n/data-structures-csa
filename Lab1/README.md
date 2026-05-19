# Lab 1: Linked List Lab — Music Playlist
## Lab Overview
You will build a Song class and a Playlist class backed by your linked list. The playlist supports adding songs, removing songs, and playing through the list.
Estimated time: 45–60 minutes

## Part A — Song Class (10 min)
Create a Song class with String fields: title, artist, and album. Give it a constructor and a toString() that returns a nicely formatted string.

## Part B — SongNode Class (10 min)
Modify the Node concept to store a Song instead of an int. Create a SongNode class with a Song data field and a SongNode next field.

## Part C — Playlist Class (30 min)
Build a Playlist class with a SongNode head. Implement:
* addToFront(Song s) — adds to front
* addToEnd(Song s) — adds to end of playlist
* removeFirst() — removes and returns first song
* playAll() — prints each song in order
* size() — returns number of songs
