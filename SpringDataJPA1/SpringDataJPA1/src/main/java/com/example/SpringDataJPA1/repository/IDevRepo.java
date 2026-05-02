package com.example.SpringDataJPA1.repository;

import com.example.SpringDataJPA1.entity.Developers;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDevRepo extends CrudRepository<Developers,Integer>
{


}
