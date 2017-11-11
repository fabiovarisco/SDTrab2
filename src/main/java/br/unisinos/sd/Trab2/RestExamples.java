package br.unisinos.sd.Trab2;

import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestExamples {

	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping(value="/greeting")
	public Greeting greeting(@RequestParam(value="name", required=false, defaultValue="World") String name) {
		return new Greeting(counter.incrementAndGet(), name);
	}
	
	@RequestMapping(value="/randomNumbers")
	public int[] random(@RequestParam(value="n", required=false, defaultValue="100") String number) {
		Integer n = 100;
		try {
			n = Integer.parseInt(number);
		} catch (Exception e) {
			
		}
		return generateRandomNumbers(n);
	}
	
	public static int[] generateRandomNumbers(Integer n) {
		int[] numbers = new int[n];
		Random rand = new Random(System.currentTimeMillis());
		for (int i = 0; i < n; i++)
			numbers[i] = rand.nextInt(n);
		return numbers;
	}
	
}
