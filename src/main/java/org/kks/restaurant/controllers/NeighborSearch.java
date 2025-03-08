package org.kks.restaurant.controllers;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class NeighborSearch extends RestaurantSearch {
    private double lat;
    private double lon;
}