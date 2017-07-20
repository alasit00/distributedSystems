package com.restfulwebservice.restfulwebservice;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "test", path = "WeatherData")
public interface WeatherDataRepository extends PagingAndSortingRepository<WeatherData, Long> {
	List<WeatherData> findByCityname(@Param("cityname") String name);

}
