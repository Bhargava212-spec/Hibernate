package com.pack;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="play1000")
public class Player {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
	private int playId;
	private String name;
	private int noOfMatches;
	public int getPlayId() {
		return playId;
	}
	public void setPlayId(int playId) {
		this.playId = playId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNoOfMatches() {
		return noOfMatches;
	}
	public void setNoOfMatches(int noOfMatches) {
		this.noOfMatches = noOfMatches;
	}
	public Player(int playId, String name, int noOfMatches) {
		super();
		this.playId = playId;
		this.name = name;
		this.noOfMatches = noOfMatches;
	}
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
