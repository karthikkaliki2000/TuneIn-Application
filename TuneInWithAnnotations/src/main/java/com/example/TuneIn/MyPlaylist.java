package com.example.TuneIn;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component("myPlaylist")
public class MyPlaylist implements Playlist {
	Integer count=0;
	
	@Autowired
	Song mySong;
	public void setMySong(Song mySong) {
		this.mySong = mySong;
	}
	List<Song> songsList=new ArrayList<Song>();
	@Override
	public void addSong(Song song) {
		// TODO Auto-generated method stub
		this.count++;
		songsList.add(song);
		
		
	}
	@Override
	public List<Song> getPlaylistSongs() {
		// TODO Auto-generated method stub
		return this.songsList;
	}
	@Override
	public Integer getCount() {
		// TODO Auto-generated method stub
		return this.count;
	}
	
}