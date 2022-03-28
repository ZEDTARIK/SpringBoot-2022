package app.ws.ettarak.shared;

import java.security.SecureRandom;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class utils {

	private final Random RANDOM = new SecureRandom();

	private final String ALPHABET = "abcdefghijkLNOPKRSTUVWXY0123456789";

	public String generatedUserId(int length) {

		StringBuilder returnValue = new StringBuilder(length);
		for (int i = 0; i < length; i++) {
			returnValue.append(ALPHABET.charAt(RANDOM.nextInt(ALPHABET.length())));
		}
		return new String(returnValue);
	}

}
