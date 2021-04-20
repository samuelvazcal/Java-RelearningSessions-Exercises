package com.samuelvazquez.generics.lastgenericimplementation;

import java.util.ArrayList;

//Now, it will work for any type, for example Pokemon
//For this case, T stands for any type of Pokemon
//that means the type parameter is gonna be any type that extends from Pokemon or subclass of Pokemon
public class GymLeader<T extends Pokemon> {
	private String leaderName;
	// Before Pokemon || After T
	private ArrayList<T> pokemonTeam = new ArrayList<T>();

	public GymLeader(String name) {
		this.leaderName = name;
	}

	public String getLeaderName() {
		return leaderName;
	}

	// Before Pokemon || After T
	public boolean addPokemon(T pokemon) {
		if(pokemonTeam.contains(pokemon)) {
			System.out.println(pokemon.getPokemonName() + "is already on this team");
			return false;
		} else {
			pokemonTeam.add(pokemon);
			System.out.println(pokemon.getPokemonName() + " added to this team");
			return true;
		}
	}


}
