package br.com.uscsitau.uscsitau.Rest;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Cadastro")
public class Cadastro {

		@GetMapping
			public Integer getRandomNuber() {
				return new Random().nextInt(Integer.MAX_VALUE);
		}
		
		@GetMapping("randomString")
		public String getRandomString() {
			return PALAVRAS.get(new Random().nextInt(PALAVRAS.size()));
		}
		
		@GetMapping("/randomFloat")
			public Float getRandomFloat() {
			return new Random().nextFloat();
		}
	
}
