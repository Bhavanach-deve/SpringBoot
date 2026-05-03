package com.example.LayeredApproach.serviceLayer;

import com.example.LayeredApproach.entity.Electronics;

public interface IElectronicsService
{
    public String registerGadgetInfo(Electronics ele);

    public Iterable<Electronics> registerMultiGadgetInfo(Iterable<Electronics> gadgets);

    public Long gadgetsCount();

    public Boolean checkgadgetAvailability(Integer id);

    public Iterable<Electronics>getAllElectronicsInfo();

}
