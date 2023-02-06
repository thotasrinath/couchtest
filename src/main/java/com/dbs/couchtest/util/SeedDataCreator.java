package com.dbs.couchtest.util;

import com.dbs.couchtest.entity.Country;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SeedDataCreator {

    private static final ObjectMapper objectMapper = new ObjectMapper()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
            .configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);


    public static List<Country> getAllCountries() {

        try {
            URL url = new URL("file:src/main/resources/data/countries.json");
            return objectMapper.readValue(url,
                    new TypeReference<List<Country>>() {
                    });
        } catch (IOException e) {
            e.printStackTrace();
        }

        return new ArrayList<Country>();
    }

}
