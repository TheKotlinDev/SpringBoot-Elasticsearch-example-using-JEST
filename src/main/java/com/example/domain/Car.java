package com.example.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "car")
public class Car
{
    @Id
    private String id;

    private String model;
    private String make;

    public Car()
    {
    }

    public Car(String model, String make)
    {
        this.model = model;
        this.make = make;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public String getMake()
    {
        return make;
    }

    public void setMake(String make)
    {
        this.make = make;
    }

    @Override
    public String toString()
    {
        return String.format("Car[id=%s, model='%s', make='%s']", id, model, make);
    }
}
