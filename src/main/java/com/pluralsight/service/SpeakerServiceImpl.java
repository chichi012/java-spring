package com.pluralsight.service;


import com.pluralsight.model.Speaker;
import com.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("speakerService")
public class SpeakerServiceImpl implements SpeakerService {
//add a finder method ... also help swap our repository tier

    private SpeakerRepository repository;
//    this is what the code looks like without spring
    public  SpeakerServiceImpl(){
        System.out.println("We are in the SpeakerServiceImpl no args constructor");
    }
    public  SpeakerServiceImpl(SpeakerRepository speakerRepository){
        System.out.println("We are in the SpeakerServiceImpl repository constructor");
//        this is a Constructor Injection method

        repository = speakerRepository;
    }

    @Override
    public List<Speaker> findAll(){
        return repository.findAll();

    }

//    create a setter here to wire up the configuration by right-clicking, generate --- setter
//    autowire the setRepository to automatically inject the speaker repository into the setter (setter injection)
    @Autowired
    public void setRepository(SpeakerRepository repository) {
        System.out.println("We are in the SpeakerServiceImpl setter");
        this.repository = repository;
    }
}
