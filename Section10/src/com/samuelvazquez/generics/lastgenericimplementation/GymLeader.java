package com.samuelvazquez.generics.lastgenericimplementation;

import java.util.ArrayList;

//Not it will work for any tpe of player
public class GymLeader<T> {
	private String leaderName;
	private ArrayList<T> pokemonTeam = new ArrayList<T>();

	public GymLeader(String name) {
		this.leaderName = name;
	}

	public String getLeaderName() {
		return leaderName;
	}

	public boolean addPokemon(T pokemon) {
		if(pokemonTeam.contains(pokemon)) {
			System.out.println(((Pokemon)pokemon).getPokemonName() + "is already on this team");
			return false;
		} else {
			pokemonTeam.add(pokemon);
			System.out.println(((Pokemon)pokemon).getPokemonName() + " added to this team");
			return true;
		}
	}


}
