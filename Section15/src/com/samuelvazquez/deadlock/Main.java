package com.samuelvazquez.deadlock;

public class Main {
		static class Friend {
			private final String name;

			public Friend(String name) {
				this.name = name;
			}

			public String getName() {
				return this.name;
			}

			public synchronized void bow(Friend bower) {
				System.out.format("%s: %s"
								+ "  has bowed to me!%n",
						this.name, bower.getName());
				bower.bowBack(this);
			}
			public synchronized void bowBack(Friend bower) {
				System.out.format("%s: %s"
								+ " has bowed back to me!%n",
						this.name, bower.getName());
			}
		}

		public static void main(String[] args) {
			final Friend alphonse = new Friend("Alphonse");
			final Friend gaston = new Friend("Gaston");

			//two or more threads are blocked forever, waiting for each other
			new Thread(new Runnable() {
				public void run() {
					alphonse.bow(gaston);
					alphonse.bowBack(gaston);
				}
			}).start();

			new Thread(new Runnable() {
				public void run() {
					gaston.bow(alphonse);
				}
			}).start();
		}
}
