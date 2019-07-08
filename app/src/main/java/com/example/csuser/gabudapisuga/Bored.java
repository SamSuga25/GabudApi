package com.example.csuser.gabudapisuga;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Bored {

    @SerializedName("activity")
    @Expose
    private String activity;
    @SerializedName("accessibility")
    @Expose
    private Integer accessibility;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("participants")
    @Expose
    private Integer participants;
    @SerializedName("price")
    @Expose
    private Integer price;
    @SerializedName("key")
    @Expose
    private String key;

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public Integer getAccessibility() {
        return accessibility;
    }

    public void setAccessibility(Integer accessibility) {
        this.accessibility = accessibility;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getParticipants() {
        return participants;
    }

    public void setParticipants(Integer participants) {
        this.participants = participants;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

}

