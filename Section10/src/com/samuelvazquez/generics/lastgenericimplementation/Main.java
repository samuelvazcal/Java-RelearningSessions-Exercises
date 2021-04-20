package com.samuelvazquez.generics.lastgenericimplementation;

public class Main {
	public static void main(String[] args) {
		WaterPokemon starmie = new WaterPokemon("starmie");
		WaterPokemon psyduck = new WaterPokemon("psyduck");
		WaterPokemon dewgong = new WaterPokemon("dewgong");
		GrassPokemon exeggutor = new GrassPokemon("exxegutor");
		GrassPokemon vileplume = new GrassPokemon("vileplume");
		GrassPokemon victreebel = new GrassPokemon("victreebel");
		FirePokemon arcanine = new FirePokemon("arcanine");
		FirePokemon magmar = new FirePokemon("magmar");
		FirePokemon ninetales = new FirePokemon("ninetales");

		//Now, we can specify what type of Pokemon our respective leader should have
		GymLeader<WaterPokemon> ceruleanLeader = new GymLeader<WaterPokemon>("Misty");
		GymLeader<GrassPokemon> celadonLeader = new GymLeader<GrassPokemon>("Erika");
		GymLeader<FirePokemon> cinnabarLeader = new GymLeader<FirePokemon>("Blaine");

		System.out.println("Adding pokemon to Cerulean Leader " + ceruleanLeader.getLeaderName());
		ceruleanLeader.addPokemon(starmie);
		ceruleanLeader.addPokemon(psyduck);
		ceruleanLeader.addPokemon(dewgong);
		//invalid type of Pokemon for Cerulean leader
		//ceruleanLeader.addPokemon(arcanine);

		System.out.println("Adding pokemon to Celadon Leader " + cinnabarLeader.getLeaderName());
		celadonLeader.addPokemon(exeggutor);
		celadonLeader.addPokemon(vileplume);

		System.out.println("Adding pokemon to Cinnabar Leader " + cinnabarLeader.getLeaderName());
		cinnabarLeader.addPokemon(arcanine);
		cinnabarLeader.addPokemon(magmar);
		cinnabarLeader.addPokemon(ninetales);
		//Misty is a water trainer, she only use water type pokemon in gym battles!
		//How I can restrict an specific type of pokemon for specific gym leaders?
		//1. I can define a new class that handles this situation, but it means repetitive code
		//2. What about implement a Generic Class?




	}
}
