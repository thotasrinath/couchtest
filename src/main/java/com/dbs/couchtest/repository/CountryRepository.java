package com.dbs.couchtest.repository;

import com.dbs.couchtest.entity.Country;
import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends CouchbaseRepository<Country, Integer> {
}
