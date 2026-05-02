package com.example.SpringDataJPA1;

import com.example.SpringDataJPA1.entity.Developers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.example.SpringDataJPA1.repository.IDevRepo;

@Component
public class DataJPARunner implements CommandLineRunner
{
    @Autowired
    private IDevRepo repo;

    @Override
    public void run(String...args)throws Exception
    {
        System.out.println(repo.getClass().getName());
        repo.save(new Developers(1,"Bhavana","Hyderabad"));

    }
}
