package com.nothing.story.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
public class StockProp {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected String id;

    protected String code;

    protected String type;

    protected String name;

    protected String year;

    protected String month;

    protected String prop;

    protected Double value;
}
