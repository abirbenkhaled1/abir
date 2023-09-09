package gestion.com.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import gestion.com.Entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long>{

}
