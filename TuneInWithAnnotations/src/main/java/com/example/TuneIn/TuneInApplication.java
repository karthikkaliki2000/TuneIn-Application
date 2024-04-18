package com.example.TuneIn;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class TuneInApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext con=new AnnotationConfigApplicationContext("com.example.TuneIn");
		Scanner s = new Scanner(System.in);
		System.out.println("Welcome to Music Playlist Application");
		System.out.println("What is your name?");
		String name = s.nextLine();
		System.out.println("What is your age?");
		Integer age = s.nextInt();
		s.nextLine();
		User user=con.getBean(MyUser.class);
		user.setUserDetail(name, age);
		while(true) {
			System.out.println("Do you want to add Songs to the playlist\n1. Yes\n2. No");
			int addOrNot = s.nextInt();
			s.nextLine();
			switch (addOrNot) {
			case 1: {
				System.out.println("Enter name of the song");
				String songName=s.nextLine();
				Song song=(Song)con.getBean(MySong.class);
				song.setName(songName);
				user.getPlaylist().addSong(song);
				break;
			}
			case 2: {
				break;
			}
			}
			if(addOrNot==2) {
				break;
			}
		}
		int le=user.getPlaylist().toString().length();
		System.out.println("Your Playlist with reference Id: "+user.getPlaylist().toString().substring(le-9)+" is Ready!!");
		Playlist playlist=(Playlist) user.getPlaylist();
		List<Song> list=playlist.getPlaylistSongs();
		for(Song song:list) {
			int l=song.toString().length();
			System.out.println("Song name: "+song.getSongName()+" Reference Id: "+song.toString().substring(l-9));
		}
	}

}
