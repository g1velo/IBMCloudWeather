package org.openhab.binding.IBMCloudWeather.objects;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Observation {
    private String key;
    private String observation;
    private Date expire_time_gmt;
    private String obs_id;
    private String obs_name;
    private String valid_time_gmt;
    private String day_ind;
    private String temp;
    @JsonProperty("class")
    private String classname;
    private String wx_icon;
    private String icon_extd;
    private String wx_phrase;
    private String pressure_tend;
    private String pressure_desc;
    private String dewPt;
    private String heat_index;
    private String rh;
    private String pressure;
    private String vis;
    private String wc;
    private String wdir;
    private String wdir_cardinal;
    private String gust;
    private String wspd;
    private String max_temp;
    private String min_temp;
    private String precip_total;
    private String precip_hrly;
    private String snow_hrly;
    private String uv_desc;
    private String feels_like;
    private String uv_index;
    private String qualifier;
    private String qualifier_svrty;
    private String blunt_phrase;
    private String terse_phrase;
    private String clds;
    private String water_temp;
    private String primary_wave_period;
    private String primary_wave_height;
    private String primary_swell_period;
    private String primary_swell_height;
    private String primary_swell_direction;
    private String secondary_swell_period;
    private String secondary_swell_height;
    private String secondary_swell_direction;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public Date getExpire_time_gmt() {
        return expire_time_gmt;
    }

    public void setExpire_time_gmt(Date expire_time_gmt) {
        this.expire_time_gmt = expire_time_gmt;
    }

    public String getObs_id() {
        return obs_id;
    }

    public void setObs_id(String obs_id) {
        this.obs_id = obs_id;
    }

    public String getObs_name() {
        return obs_name;
    }

    public void setObs_name(String obs_name) {
        this.obs_name = obs_name;
    }

    public String getValid_time_gmt() {
        return valid_time_gmt;
    }

    public void setValid_time_gmt(String valid_time_gmt) {
        this.valid_time_gmt = valid_time_gmt;
    }

    public String getDay_ind() {
        return day_ind;
    }

    public void setDay_ind(String day_ind) {
        this.day_ind = day_ind;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getWx_icon() {
        return wx_icon;
    }

    public void setWx_icon(String wx_icon) {
        this.wx_icon = wx_icon;
    }

    public String getIcon_extd() {
        return icon_extd;
    }

    public void setIcon_extd(String icon_extd) {
        this.icon_extd = icon_extd;
    }

    public String getWx_phrase() {
        return wx_phrase;
    }

    public void setWx_phrase(String wx_phrase) {
        this.wx_phrase = wx_phrase;
    }

    public String getPressure_tend() {
        return pressure_tend;
    }

    public void setPressure_tend(String pressure_tend) {
        this.pressure_tend = pressure_tend;
    }

    public String getPressure_desc() {
        return pressure_desc;
    }

    public void setPressure_desc(String pressure_desc) {
        this.pressure_desc = pressure_desc;
    }

    public String getDewPt() {
        return dewPt;
    }

    public void setDewPt(String dewPt) {
        this.dewPt = dewPt;
    }

    public String getHeat_index() {
        return heat_index;
    }

    public void setHeat_index(String heat_index) {
        this.heat_index = heat_index;
    }

    public String getRh() {
        return rh;
    }

    public void setRh(String rh) {
        this.rh = rh;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public String getVis() {
        return vis;
    }

    public void setVis(String vis) {
        this.vis = vis;
    }

    public String getWc() {
        return wc;
    }

    public void setWc(String wc) {
        this.wc = wc;
    }

    public String getWdir() {
        return wdir;
    }

    public void setWdir(String wdir) {
        this.wdir = wdir;
    }

    public String getWdir_cardinal() {
        return wdir_cardinal;
    }

    public void setWdir_cardinal(String wdir_cardinal) {
        this.wdir_cardinal = wdir_cardinal;
    }

    public String getGust() {
        return gust;
    }

    public void setGust(String gust) {
        this.gust = gust;
    }

    public String getWspd() {
        return wspd;
    }

    public void setWspd(String wspd) {
        this.wspd = wspd;
    }

    public String getMax_temp() {
        return max_temp;
    }

    public void setMax_temp(String max_temp) {
        this.max_temp = max_temp;
    }

    public String getMin_temp() {
        return min_temp;
    }

    public void setMin_temp(String min_temp) {
        this.min_temp = min_temp;
    }

    public String getPrecip_total() {
        return precip_total;
    }

    public void setPrecip_total(String precip_total) {
        this.precip_total = precip_total;
    }

    public String getPrecip_hrly() {
        return precip_hrly;
    }

    public void setPrecip_hrly(String precip_hrly) {
        this.precip_hrly = precip_hrly;
    }

    public String getSnow_hrly() {
        return snow_hrly;
    }

    public void setSnow_hrly(String snow_hrly) {
        this.snow_hrly = snow_hrly;
    }

    public String getUv_desc() {
        return uv_desc;
    }

    public void setUv_desc(String uv_desc) {
        this.uv_desc = uv_desc;
    }

    public String getFeels_like() {
        return feels_like;
    }

    public void setFeels_like(String feels_like) {
        this.feels_like = feels_like;
    }

    public String getUv_index() {
        return uv_index;
    }

    public void setUv_index(String uv_index) {
        this.uv_index = uv_index;
    }

    public String getQualifier() {
        return qualifier;
    }

    public void setQualifier(String qualifier) {
        this.qualifier = qualifier;
    }

    public String getQualifier_svrty() {
        return qualifier_svrty;
    }

    public void setQualifier_svrty(String qualifier_svrty) {
        this.qualifier_svrty = qualifier_svrty;
    }

    public String getBlunt_phrase() {
        return blunt_phrase;
    }

    public void setBlunt_phrase(String blunt_phrase) {
        this.blunt_phrase = blunt_phrase;
    }

    public String getTerse_phrase() {
        return terse_phrase;
    }

    public void setTerse_phrase(String terse_phrase) {
        this.terse_phrase = terse_phrase;
    }

    public String getClds() {
        return clds;
    }

    public void setClds(String clds) {
        this.clds = clds;
    }

    public String getWater_temp() {
        return water_temp;
    }

    public void setWater_temp(String water_temp) {
        this.water_temp = water_temp;
    }

    public String getPrimary_wave_period() {
        return primary_wave_period;
    }

    public void setPrimary_wave_period(String primary_wave_period) {
        this.primary_wave_period = primary_wave_period;
    }

    public String getPrimary_wave_height() {
        return primary_wave_height;
    }

    public void setPrimary_wave_height(String primary_wave_height) {
        this.primary_wave_height = primary_wave_height;
    }

    public String getPrimary_swell_period() {
        return primary_swell_period;
    }

    public void setPrimary_swell_period(String primary_swell_period) {
        this.primary_swell_period = primary_swell_period;
    }

    public String getPrimary_swell_height() {
        return primary_swell_height;
    }

    public void setPrimary_swell_height(String primary_swell_height) {
        this.primary_swell_height = primary_swell_height;
    }

    public String getPrimary_swell_direction() {
        return primary_swell_direction;
    }

    public void setPrimary_swell_direction(String primary_swell_direction) {
        this.primary_swell_direction = primary_swell_direction;
    }

    public String getSecondary_swell_period() {
        return secondary_swell_period;
    }

    public void setSecondary_swell_period(String secondary_swell_period) {
        this.secondary_swell_period = secondary_swell_period;
    }

    public String getSecondary_swell_height() {
        return secondary_swell_height;
    }

    public void setSecondary_swell_height(String secondary_swell_height) {
        this.secondary_swell_height = secondary_swell_height;
    }

    public String getSecondary_swell_direction() {
        return secondary_swell_direction;
    }

    public void setSecondary_swell_direction(String secondary_swell_direction) {
        this.secondary_swell_direction = secondary_swell_direction;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }
}
