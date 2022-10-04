package com.pluralsight.repository;

import com.pluralsight.model.Speaker;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

//@Repository used to denote a class as a repository
@Repository("speakerRepository")
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public List<Speaker> findAll(){
//        polymorphism
        List<Speaker> speakers =  new ArrayList<Speaker>();
        Speaker speaker = new Speaker();
        speaker.setFirstName("chi");
        speaker.setLastName("afam");

        speakers.add(speaker);
        return speakers;

    }
}
