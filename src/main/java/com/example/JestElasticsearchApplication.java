package com.example;

import com.example.domain.Car;
import com.example.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JestElasticsearchApplication implements CommandLineRunner
{

    public static void main(String[] args)
    {
        SpringApplication.run(JestElasticsearchApplication.class, args);
    }

	/*
            The following is to show the code is functioning correctly and should be removed.

			You will need to run an elasticsearch instance locally.
			URI of the local ES must match that of the uri in application.yml
	 */

    @Autowired
    private CarRepository carRepository;

    @Override
    public void run(String... strings) throws Exception
    {
        this.carRepository.deleteAll();
        saveCars();
        fetchAllCars();
        fetchSpecificCar();
    }

    private void saveCars()
    {
        this.carRepository.save(new Car("M1", "BMW"));
        this.carRepository.save(new Car("S3", "Audi"));
        this.carRepository.save(new Car("LaFerrari", "Ferrari"));
    }

    private void fetchAllCars()
    {
        System.out.println("Cars found using findAll()");
        System.out.println("---------------------------");
        for (Car car : this.carRepository.findAll())
        {
            System.out.println(car);
        }
        System.out.println();
    }

    private void fetchSpecificCar()
    {
        System.out.println("Cars found using findByCarModel(LaFerrari)");
        System.out.println("---------------------------");
        System.out.println(this.carRepository.findByModel("LaFerrari"));
        System.out.println();

        System.out.println("Cars found using findByCarModel(S3)");
        System.out.println("---------------------------");
        System.out.println(this.carRepository.findByModel("S3"));
    }

}
