package com.example.local.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.local.entities.Local;
import com.example.local.entities.dtos.LocalDTO;

@Repository
public interface LocalRepository extends MongoRepository<Local,Long> {
	public Local findByIdLocal(long idLocal);
	public List<Local> findAll();
}
