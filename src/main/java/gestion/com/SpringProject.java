package gestion.com;




import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import gestion.com.Entities.Produit;
import gestion.com.Repositories.ProduitRepository;


@SpringBootApplication
public class SpringProject implements CommandLineRunner {

	@Autowired
	ProduitRepository produitRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringProject.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		produitRepository.save(new Produit("bb", "cc", "nn", "hh"));
		produitRepository.save(new Produit("Wick", "Jhon", "hh", "50262899"));
		produitRepository.save(new Produit("Ahmed", "Jamel","hh", "50262899"));
		produitRepository.save(new Produit("Charki", "Karim","tt", "50262899"));
		
	}

}
