package com.dbs.couchtest.rest;

import com.dbs.couchtest.entity.Country;
import com.dbs.couchtest.entity.User;
import com.dbs.couchtest.repository.CountryRepository;
import com.dbs.couchtest.util.SeedDataCreator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/country")
public class CountryRequest {


    @Autowired
    private CountryRepository countryRepository;

    @GetMapping("/addall")
    public Iterable<Country> addAndGetAll() {
        return countryRepository.saveAll(SeedDataCreator.getAllCountries());
    }
}
