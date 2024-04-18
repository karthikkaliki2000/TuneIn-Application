package com.example.TuneIn;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component("mySong")
@Scope("prototype")
public class MySong implements Song {
	String name;

	@Override
	public String getSongName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name=name;
		
	}
	
}
