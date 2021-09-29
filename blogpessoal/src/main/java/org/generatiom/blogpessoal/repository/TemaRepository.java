package org.generatiom.blogpessoal.repository;

import java.util.List;

import org.generatiom.blogpessoal.model.Tema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TemaRepository extends JpaRepository<Tema, Long> {

	public List<Tema> FindAllByDescricaoContainingIgnoreCase(String descricao);
}
