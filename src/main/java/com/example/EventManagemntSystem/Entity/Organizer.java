package com.example.EventManagemntSystem.Entity;
import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Organizer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String contactInfo;

    @OneToMany(mappedBy = "organizer")
    private Set<Event> events;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public Set<Event> getEvents() {
        return events;
    }

    public void setEvents(Set<Event> events) {
        this.events = events;
    }
    public Organizer()
    {

    }

    public Organizer(Long id, String name, String contactInfo, Set<Event> events) {
        this.id = id;
        this.name = name;
        this.contactInfo = contactInfo;
        this.events = events;
    }
}
