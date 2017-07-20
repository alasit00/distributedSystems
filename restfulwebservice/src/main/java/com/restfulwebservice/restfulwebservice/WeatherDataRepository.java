package com.restfulwebservice.restfulwebservice;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "WeatherData", path = "WeatherData")
public interface WeatherDataRepository extends CrudRepository<WeatherData, Long> {
	List<WeatherData> findByCityname(@Param("cityname") String cityname);
}
