package com.learnjava.springboot2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
@Service
public class IGreetingService implements IGreetings
{
    public IGreetingService()
    {
        System.out.println("Geetings service bean created");
    }
    @Autowired
    private LocalTime time;
    public String generateWish(String name)
    {
        LocalTime time=LocalTime.now();

        int hour=time.getHour();

        if(hour<12){
            return "Good Morning"+name;
        }else if(hour<16)
            return "Good Afternoon"+name;
        else if(hour<20)
            return "Good Evening"+name;
        else
            return "Good Night"+name;
    }
}
