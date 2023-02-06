package com.dbs.couchtest.entity;

import lombok.Data;

@Data
public class Timezone {
    private String zoneName;
    private Integer gmtOffset;
    private String gmtOffsetName;
    private String abbreviation;
    private String tzName;
}
