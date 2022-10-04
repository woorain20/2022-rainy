package com.example.demo.dto;

public class League {

	private int idleague;
	private String league;
	private String nation;
	private int found;
	
	public int getIdleague() {
		return idleague;
	}
	public void setIdleague(int idleague) {
		this.idleague = idleague;
	}
	public String getLeague() {
		return league;
	}
	public void setLeague(String league) {
		this.league = league;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public int getFound() {
		return found;
	}
	public void setFound(int found) {
		this.found = found;
	}
	
	@Override
	public String toString() {
		return "League [idleague=" + idleague + ", league=" + league + ", nation=" + nation + ", found=" + found + "]";
	}
	
}
