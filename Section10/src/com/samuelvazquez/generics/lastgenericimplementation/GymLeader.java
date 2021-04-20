package com.samuelvazquez.generics.lastgenericimplementation;

import java.util.ArrayList;


public class GymLeader {
	private String name;
	private ArrayList<Pokemon> pokemonTeam = new ArrayList<Pokemon>();

	public GymLeader(String name) {
		this.name = name;
	}

	public boolean addPokemon(Pokemon pokemon) {
		if(pokemonTeam.contains(pokemon)) {
			System.out.println(pokemon.toString() + "is already on this team");
			return false;
		} else {
			pokemonTeam.add(pokemon);
			System.out.println(pokemon.toString() + " added to this team");
			return true;
		}
	}


}
