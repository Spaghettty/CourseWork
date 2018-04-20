package coursework;

import coursework.game.Game;
import coursework.lib.QuestionLib;
import coursework.rest.RESTController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.Console;
import java.util.Scanner;
import java.util.concurrent.LinkedBlockingQueue;

@SpringBootApplication
public class App {

	@Bean
	public Game game(){
		return new Game();
	}

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}