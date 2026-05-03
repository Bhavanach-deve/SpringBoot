package com.example.LayeredApproach.serviceLayer;

import com.example.LayeredApproach.entity.Electronics;
import com.example.LayeredApproach.repository.IElectronicsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ElectricService implements IElectronicsService
{
    private IElectronicsRepo repo;
    @Autowired
    public void setRepo(IElectronicsRepo repo) {
        this.repo = repo;
    }

    public String registerGadgetInfo(Electronics ele)
    {
        Electronics e=repo.save(ele);

        return "Electronics Info registered with id"+e.getId();

    }

    public Iterable<Electronics> registerMultiGadgetInfo(Iterable<Electronics> gadgets)
    {
        return repo.saveAll(gadgets);

    }

}
