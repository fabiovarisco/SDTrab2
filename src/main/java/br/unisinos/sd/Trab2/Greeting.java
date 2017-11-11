package br.unisinos.sd.Trab2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Greeting {

	private final long id;
	private final String greeting;
	private static final String template = "Hello, %s!";
	private final String date;

	public Greeting(long id, String name) {
		this.id = id;
		this.greeting = String.format(template, name);
		SimpleDateFormat smf = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss");
		this.date = smf.format(new Date());
	}

	public long getId() {
		return this.id;
	}
	
	public String getDate() {
		return this.date;
	}

	public String getGreeting() {
		return this.greeting;
	}
}
