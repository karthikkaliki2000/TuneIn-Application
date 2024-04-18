package com.example.TuneIn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;


@Component("myUser")

public class MyUser implements User {
	String name;
	Integer age;
	
	@Autowired
	@Qualifier("myPlaylist")
	Playlist playlist;
	public void setPlaylist(Playlist playlist) {
		this.playlist = playlist;
	}
	
	@PostConstruct
	public void init() {
		System.out.println("User has been instantiated");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("User has been closed");
	}
	@Override
	public void setUserDetail(String name, Integer age) {
		// TODO Auto-generated method stub
		this.name=name;
		this.age=age;
		
	}
	@Override
	public Playlist getPlaylist() {
		// TODO Auto-generated method stub
		return this.playlist;
	}
	
}
