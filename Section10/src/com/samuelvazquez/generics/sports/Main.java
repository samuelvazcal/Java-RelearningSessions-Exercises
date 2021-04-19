package com.samuelvazquez.generics.sports;

public class Main {
	public static void main(String[] args) {
		FootballPlayer joe = new FootballPlayer("Joe");
		BaseballPlayer pat = new BaseballPlayer("Pat");
		SoccerPlayer beckham = new SoccerPlayer("Beckham");

		Team adelaideCrows = new Team("Adelaide Crows");
		adelaideCrows.addPlayer(joe);
		adelaideCrows.addPlayer(pat);
		adelaideCrows.addPlayer(beckham);
		//for this implementation, it makes no sense to have a team with players from different sports

		System.out.println(adelaideCrows.numPlayers());

	}
}
