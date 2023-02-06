package com.dbs.couchtest.entity;

import java.util.List;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;

@Data
@Document
public class Country {
    @Id
    private int id;
    private String name;
    private List<Timezone> timezones;

}
