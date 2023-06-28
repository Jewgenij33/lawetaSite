package com.evakuator.lawetaSite.model;

import lombok.Data;

@Data
public class Calculator {

    private String category_type;
    private Boolean transport_into_city;
    private Boolean city;
    private Integer distance;
    private Integer blocked_wheel;
    private Boolean work_selection;
    private Boolean steering_wheel_block;

    public int category(String category_type){

return 0;
    }
}
