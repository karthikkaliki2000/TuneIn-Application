package com.example.TuneIn;

import java.util.ArrayList;
import java.util.List;

/**
  This class is an implementation of a "Playlist" Interface.This class is injected as a dependency 
  in MyUser class.You need to complete this class based on the following tasks.
    
   Tasks:
   a. Adding common attributes: 
      1. Integer count
      2. Song mySong  (Interface inject through setter injection)
      3. List<Song> songsList
   b. Override the methods of Playlist Interface.
   c. Create a method named "setMySong (Song mySong)", this method sets the value of the "mySong"
      attribute using the setter injection approach.
   d.Build the logic for all the methods based on the description mentioned in the Playlist Interface.

**/

public class MyPlaylist implements Playlist {
	Integer count=0;
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