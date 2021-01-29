package linkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
	
	private static ArrayList<Album> albums = new ArrayList<Album>();
	
	public static void main(String[] args) {
		Album hibridTheory = new Album("Hybrid Theory", "Linkin Park");
		hibridTheory.addSong("Papercut", 5.1);
		hibridTheory.addSong("One Step Closer", 3.8);
		hibridTheory.addSong("With You", 3.4);
		hibridTheory.addSong("Points of Authority", 5.1);
		hibridTheory.addSong("Crawling", 3.6);
		hibridTheory.addSong("Runaway", 6.1);
		hibridTheory.addSong("By Myself", 3.7);
		hibridTheory.addSong("In the End", 4.1);
		hibridTheory.addSong("A Place for My Head", 4.2);
		hibridTheory.addSong("Forgotten",3.5);
		hibridTheory.addSong("Cure for the Itch", 4.3);
		hibridTheory.addSong("Pushing me Away", 2.1);
		
		albums.add(hibridTheory);
		
		Album meteora = new Album("Meteora", "Linkin Park");
		meteora.addSong("Foreword", 0.9);
		meteora.addSong("Don't Stay", 5.0);
		meteora.addSong("Somewhere I Belong", 5.0);
		meteora.addSong("Lying from You", 5.0);
		meteora.addSong("Hit the Floor", 5.0);
		meteora.addSong("Easier to Run", 5.0);
		meteora.addSong("Faint", 5.0);
		meteora.addSong("Figure.09", 5.0);
		meteora.addSong("Breaking the Habit", 5.0);
		meteora.addSong("From the Inside", 5.0);
		meteora.addSong("Nobody's Listening", 5.0);
		meteora.addSong("Session", 5.0);
		meteora.addSong("Numb", 5.0);
		
		albums.add(meteora);
		
		LinkedList<Song> playList = new LinkedList<Song>();
		
		albums.get(0).addToPlaylist("Crawling", playList);
		albums.get(0).addToPlaylist("In the End", playList);
		albums.get(0).addToPlaylist("One Step Closer", playList);
		albums.get(1).addToPlaylist("Somewhere I Belong", playList);
		albums.get(1).addToPlaylist("Breaking the Habit", playList);
		albums.get(1).addToPlaylist("Nobody's Listening", playList);
		albums.get(1).addToPlaylist(19, playList);
		
		play(playList);
	}
	
	private static void play(LinkedList<Song> playList) {
		ListIterator<Song> iterator = playList.listIterator();
		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		boolean goingForward = true;
		int trackNumber = 0;
		
		if(playList.size() == 0) {
			System.out.println("No songs in the playlist");
		} else {
			printMenu();
			System.out.println("Now playing " + iterator.next().toString());
		}
		
		while(!quit) {
			int action = scanner.nextInt();
			
			switch(action) {
			case 0:
				System.out.println("Playlist complete");
				quit = true;
				break;
			case 2:
				if(!goingForward) {
					if(iterator.hasNext()) {
						iterator.next();
					}
					goingForward = true;
				}
				if(iterator.hasNext()) {
					System.out.println("Now playing " + iterator.next().toString());
				} else {
					System.out.println("We have reached the end of the playlist");
					goingForward = false;
				}
				break;
			case 1:
				if(goingForward) {
					if(iterator.hasPrevious()) {
						iterator.previous();
					}
					goingForward = false;
				}
				if(iterator.hasPrevious()) {
					System.out.println("Now playing " + iterator.previous().toString());
				} else {
					System.out.println("We are at the start of the playlist");
					goingForward = true;
				}
				break;
			case 3:
				if(iterator.hasPrevious()) {
					iterator.previous();	
				}
				System.out.println("Repeating track " + iterator.next().toString());
				break;
			case 4:
				for (Song currentSong: playList) {
					trackNumber++;
					System.out.println(trackNumber + " - " + currentSong.toString());
				}
				break;
			case 5:
				printMenu();
				break;
			}
		}
	}
	private static void printMenu() {
		System.out.println("Available options:\n Press: ");
		System.out.println("0 - to quit\n" +
				"1 - to go to previous song\n" +
				"2 - to go to the next song\n" +
				"3 - to replay the current song\n" +
				"4 - to print playlist\n" +
				"5 - to show menu options\n");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
