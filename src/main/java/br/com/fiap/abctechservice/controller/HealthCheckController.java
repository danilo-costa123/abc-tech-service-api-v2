package br.com.fiap.abctechservice.controller;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.apache.maven.model.Model;
import org.apache.maven.model.io.xpp3.MavenXpp3Reader;
import org.codehaus.plexus.util.xml.pull.XmlPullParserException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HealthCheckController {

	@GetMapping()
	public ResponseEntity<String> status() {
		return ResponseEntity.ok("Sucesso!");
	}

	@GetMapping("version")
	public ResponseEntity<String> version() throws FileNotFoundException, IOException, XmlPullParserException {
		MavenXpp3Reader reader = new MavenXpp3Reader();
		Model model = reader.read(new FileReader("pom.xml"));
		return ResponseEntity.ok(model.getName() + " - " + model.getVersion());
	}

}
