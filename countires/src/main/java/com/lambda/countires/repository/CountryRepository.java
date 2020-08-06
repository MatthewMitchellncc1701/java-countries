package com.lambda.countires.repository;

import com.lambda.countires.models.Country;
import org.springframework.data.repository.CrudRepository;

public interface CountryRepository extends CrudRepository<Country, Long> {
}
