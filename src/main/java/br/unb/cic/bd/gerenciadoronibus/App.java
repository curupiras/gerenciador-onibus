package br.unb.cic.bd.gerenciadoronibus;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.unb.cic.bd.gerenciadoronibus.marechal.Localizacao;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		
		ObjectMapper mapper = new ObjectMapper();

		try {

			// Convert JSON string to Object
			String jsonInString = "{\"DATAHORA\":\"2017-11-21T21:10\",\"ORDEM\":\"352\",\"LINHA\":\"5\",\"LATITUDE\":\"163420.59546809096\",\"LONGITUDE\":\"8252404.893869959\",\"VELOCIDADE\":\"70.5\"}";
			Localizacao localizacao = mapper.readValue(jsonInString, Localizacao.class);
			System.out.println(localizacao);

			// Pretty print
			String prettyLocalizacao = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(localizacao);
			System.out.println(prettyLocalizacao);

		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
