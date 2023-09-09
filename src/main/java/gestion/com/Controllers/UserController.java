package gestion.com.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import gestion.com.Entities.User;

import gestion.com.Repositories.UserRepository;
@RestController
@RequestMapping("/Users")
public class UserController {
	@Autowired
	UserRepository userRepository;
	
	@PostMapping("/add")
	public User addProduit(@RequestBody User newUser) {
		return userRepository.save(newUser);
	}
	@GetMapping
	public List<gestion.com.Entities.User> listProduits(){
		return userRepository.findAll();
	}
	@PutMapping("/update")
	public User updateUser(@RequestBody User newqUser, @RequestParam(name="id") Long id) {
		if(userRepository.findById(id)!=null) {
			newqUser.setId(id);
			return userRepository.save(newqUser);
		}
		return null;
	}
	@DeleteMapping("/delete")
	public void deleteUser(@RequestParam(name="id") Long id) {
		userRepository.deleteById(id);
	}
	@GetMapping("/count")
	public ResponseEntity<?> countUsers(){
		return new ResponseEntity<String>("Le nombre des utilisateurs est : "+ userRepository.count(), HttpStatus.OK);
	}
	
}
