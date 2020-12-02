package mintic.unal.art;

import mintic.unal.art.vista.Ventana;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class ArtApplication {
    
	public static void main(String[] args) {
	    new Ventana().setVisible(true);
	}

	public static void runSpringServer(String[] args) {
        SpringApplication.run(ArtApplication.class, args);
    }
}
