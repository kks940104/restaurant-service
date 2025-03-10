package org.kks.restaurant.controllers;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class RestaurantSearch {
    private int page;
    private int limit;
    private List<Long> seq;
    private String sido;
    private String sigugun;
    private List<String> category;
    private String name;
    private String sort; // name_DESC, address_DESC
}