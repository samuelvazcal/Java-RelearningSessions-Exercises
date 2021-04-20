package com.samuelvazquez.generics.lastgenericimplementation;

public abstract class Pokemon {
	private String pokemonName;

	public Pokemon(String pokemonName) {
		this.pokemonName = pokemonName;
	}

	public String getPokemonName() {
		return pokemonName;
	}

	abstract void attack();
	abstract void defend();
}
