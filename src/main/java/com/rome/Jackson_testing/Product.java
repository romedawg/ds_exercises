package com.rome.Jackson_testing;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;
import java.util.Objects;

// JSON nested object
//{
//        "id": "957c43f2-fa2e-42f9-bf75-6e3d5bb6960a",
//        "name": "The Best Product",
//        "brand": {
//        "id": "9bcd817d-0141-42e6-8f04-e5aaab0980b6",
//        "name": "ACME Products",
//        "owner": {
//        "id": "b21a80b1-0c09-4be3-9ebd-ea3653511c13",
//        "name": "Ultimate Corp, Inc."
//        }
//        }
//        }

public class Product {
    private String id;
    private String name;
    private String brandName;
    private String ownerName;


    @SuppressWarnings("unchecked")
    @JsonProperty
    private void unpackNest(Map<String, Object> brand){
        this.brandName = (String)brand.get("name");
        Map<String,String> owner = (Map<String, String>)brand.get("owner");
        this.ownerName = owner.get("name");

    }

    public Product() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
