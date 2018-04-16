package com.aijava.android_workspace.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SOAnswersResponse {
    @SerializedName("weather")
    @Expose
    private List<WeatherP> weathers = null;

    @SerializedName("main")
    @Expose
    private MainP mainP;

    public List<WeatherP> getWeathers() {
        return weathers;
    }

    public void setWeathers(List<WeatherP> weathers) {
        this.weathers = weathers;
    }

    public MainP getMainP() {
        return mainP;

    }

    public void setMainP(MainP mainP) {
        this.mainP = mainP;
    }
}

