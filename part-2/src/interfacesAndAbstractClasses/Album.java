package interfacesAndAbstractClasses;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {
	private String name;
	private String artist;
	private Songlist songs;
	
	public Album(String name, String artist) {
		super();
		this.name = name;
		this.artist = artist;
		this.songs = new Songlist();
	}
	
	public boolean addSong(String title, double duration) {
		return this.songs.addSong(new Song(title, duration));
	}
	
	private Song findSong(String title) {
		return this.songs.findSong(title);
	}
	
	public boolean addToPlaylist(int trackNumber, List<Song>playList) {
		Song checkedSong = this.songs.findSong(trackNumber);
		if(!playList.contains(checkedSong) && checkedSong != null) {
			playList.add(checkedSong);
			return true;
		} else {
			System.out.println(this.name +" does not contain a track " + trackNumber);
			return false;
		}
	}
	
	public boolean addToPlaylist(String title, List<Song>playList) {
		Song checkedSong = findSong(title);
		if(checkedSong != null) {
			playList.add(checkedSong);
			return true;
		}
		System.out.println("The song " + title + " is not in " + this.name);
		return false;
	}
	
	private class Songlist {
		private ArrayList<Song> songs;
		
		public Songlist() {
			this.songs = new ArrayList<Song>();
		}


		private boolean addSong(Song song) {
			if(this.songs.contains(song)) {
				return false;
			} else {
				this.songs.add(song);
				return true;
			}
		}
		
		
		private Song findSong(String title) {
			for(Song checkedSong: this.songs) { //for each loop
				if(checkedSong.getTitle().equals(title)) {
					return checkedSong;
				}
			}
			
			return null;
		}
		
		private Song findSong(int trackNumber) {
			int index = trackNumber - 1;
			if(index >= 0 && index < this.songs.size()) {
				return this.songs.get(index);
			} else {
				return null;
			}
			
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
