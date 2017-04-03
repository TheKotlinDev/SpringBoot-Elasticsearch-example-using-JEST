package com.example.repository;

import com.example.domain.Car;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface CarRepository extends ElasticsearchRepository<Car, String>
{
    Car findByModel(String model);
}
