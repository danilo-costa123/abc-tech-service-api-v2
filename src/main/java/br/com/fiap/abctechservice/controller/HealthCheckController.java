package br.com.fiap.abctechservice.controller;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.apache.maven.model.Model;
import org.apache.maven.model.io.xpp3.MavenXpp3Reader;
import org.codehaus.plexus.util.xml.pull.XmlPullParserException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.fiap.abctechservice.aplication.PropertiesComponent;

@RestController
@RequestMapping("/")
public class HealthCheckController {

	private PropertiesComponent propertiesComponent;

	public HealthCheckController(@Autowired PropertiesComponent propertiesComponent) {
		this.propertiesComponent = propertiesComponent;
	}

	@GetMapping()
	public ResponseEntity<String> status() {
		return ResponseEntity.ok("Sucesso!");
	}

	@GetMapping("version")
    public ResponseEntity<String> version() {
        return ResponseEntity.ok(this.propertiesComponent.getName() + " - " + this.propertiesComponent.getVersion());
    }

}
