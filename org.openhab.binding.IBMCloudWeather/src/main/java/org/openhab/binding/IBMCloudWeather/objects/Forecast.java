package org.openhab.binding.IBMCloudWeather.objects;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = false)
// @JsonRootName("forecast")
public class Forecast {

    @JsonProperty("class")
    private String classname;
    @JsonProperty("expire_time_gmt")
    private Date expire_time_gmt;
    @JsonProperty("fcst_valid")
    private Date fcst_valid;
    @JsonProperty("fcst_valid_local")
    private Date fcst_valid_local;
    @JsonProperty("num")
    private float num;
    @JsonProperty("day_ind")
    private String day_ind;
    @JsonProperty("temp")
    private float temp;
    @JsonProperty("dewpt")
    private float dewpt;
    @JsonProperty("hi")
    private float hi;
    @JsonProperty("wc")
    private float wc;
    @JsonProperty("feels_like")
    private float feels_like;
    @JsonProperty("icon_extd")
    private float icon_extd;
    @JsonProperty("wxman")
    private String wxman;
    @JsonProperty("icon_code")
    private float icon_code;
    @JsonProperty("dow")
    private String dow;
    @JsonProperty("phrase_12char")
    private String phrase_12char;
    @JsonProperty("phrase_22char")
    private String phrase_22char;
    @JsonProperty("phrase_32char")
    private String phrase_32char;
    @JsonProperty("subphrase_pt1")
    private String subphrase_pt1;
    @JsonProperty("subphrase_pt2")
    private String subphrase_pt2;
    @JsonProperty("subphrase_pt3")
    private String subphrase_pt3;
    @JsonProperty("pop")
    private float pop;
    @JsonProperty("precip_type")
    private String precip_type;
    @JsonProperty("qpf")
    private float qpf;
    @JsonProperty("snow_qpf")
    private float snow_qpf;
    @JsonProperty("rh")
    private float rh;
    @JsonProperty("wspd")
    private float wspd;
    @JsonProperty("wdir")
    private float wdir;
    @JsonProperty("wdir_cardinal")
    private String wdir_cardinal;
    @JsonProperty("gust")
    private String gust;
    @JsonProperty("clds")
    private float clds;
    @JsonProperty("vis")
    private float vis;
    @JsonProperty("mslp")
    private float mslp;
    @JsonProperty("uv_index_raw")
    private float uv_index_raw;
    @JsonProperty("uv_index")
    private float uv_index;
    @JsonProperty("uv_warning")
    private float uv_warning;
    @JsonProperty("uv_desc")
    private String uv_desc;
    @JsonProperty("golf_index")
    private float golf_index;
    @JsonProperty("golf_category")
    private String golf_category;
    @JsonProperty("severity")
    private float severity;

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public Date getExpire_time_gmt() {
        return expire_time_gmt;
    }

    public void setExpire_time_gmt(Date expire_time_gmt) {
        this.expire_time_gmt = expire_time_gmt;
    }

    public float getNum() {
        return num;
    }

    public void setNum(float num) {
        this.num = num;
    }

    public String getDay_ind() {
        return day_ind;
    }

    public void setDay_ind(String day_ind) {
        this.day_ind = day_ind;
    }

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public float getDewpt() {
        return dewpt;
    }

    public void setDewpt(float dewpt) {
        this.dewpt = dewpt;
    }

    public float getHi() {
        return hi;
    }

    public void setHi(float hi) {
        this.hi = hi;
    }

    public float getWc() {
        return wc;
    }

    public void setWc(float wc) {
        this.wc = wc;
    }

    public float getFeels_like() {
        return feels_like;
    }

    public void setFeels_like(float feels_like) {
        this.feels_like = feels_like;
    }

    public float getIcon_extd() {
        return icon_extd;
    }

    public void setIcon_extd(float icon_extd) {
        this.icon_extd = icon_extd;
    }

    public String getWxman() {
        return wxman;
    }

    public void setWxman(String wxman) {
        this.wxman = wxman;
    }

    public float getIcon_code() {
        return icon_code;
    }

    public void setIcon_code(float icon_code) {
        this.icon_code = icon_code;
    }

    public String getDow() {
        return dow;
    }

    public void setDow(String dow) {
        this.dow = dow;
    }

    public String getPhrase_12char() {
        return phrase_12char;
    }

    public void setPhrase_12char(String phrase_12char) {
        this.phrase_12char = phrase_12char;
    }

    public String getPhrase_22char() {
        return phrase_22char;
    }

    public void setPhrase_22char(String phrase_22char) {
        this.phrase_22char = phrase_22char;
    }

    public String getPhrase_32char() {
        return phrase_32char;
    }

    public void setPhrase_32char(String phrase_32char) {
        this.phrase_32char = phrase_32char;
    }

    public String getSubphrase_pt1() {
        return subphrase_pt1;
    }

    public void setSubphrase_pt1(String subphrase_pt1) {
        this.subphrase_pt1 = subphrase_pt1;
    }

    public String getSubphrase_pt2() {
        return subphrase_pt2;
    }

    public void setSubphrase_pt2(String subphrase_pt2) {
        this.subphrase_pt2 = subphrase_pt2;
    }

    public String getSubphrase_pt3() {
        return subphrase_pt3;
    }

    public void setSubphrase_pt3(String subphrase_pt3) {
        this.subphrase_pt3 = subphrase_pt3;
    }

    public float getPop() {
        return pop;
    }

    public void setPop(float pop) {
        this.pop = pop;
    }

    public String getPrecip_type() {
        return precip_type;
    }

    public void setPrecip_type(String precip_type) {
        this.precip_type = precip_type;
    }

    public float getQpf() {
        return qpf;
    }

    public void setQpf(float qpf) {
        this.qpf = qpf;
    }

    public float getSnow_qpf() {
        return snow_qpf;
    }

    public void setSnow_qpf(float snow_qpf) {
        this.snow_qpf = snow_qpf;
    }

    public float getRh() {
        return rh;
    }

    public void setRh(float rh) {
        this.rh = rh;
    }

    public float getWspd() {
        return wspd;
    }

    public void setWspd(float wspd) {
        this.wspd = wspd;
    }

    public float getWdir() {
        return wdir;
    }

    public void setWdir(float wdir) {
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

    public float getClds() {
        return clds;
    }

    public void setClds(float clds) {
        this.clds = clds;
    }

    public float getVis() {
        return vis;
    }

    public void setVis(float vis) {
        this.vis = vis;
    }

    public float getMslp() {
        return mslp;
    }

    public void setMslp(float mslp) {
        this.mslp = mslp;
    }

    public float getUv_index_raw() {
        return uv_index_raw;
    }

    public void setUv_index_raw(float uv_index_raw) {
        this.uv_index_raw = uv_index_raw;
    }

    public float getUv_index() {
        return uv_index;
    }

    public void setUv_index(float uv_index) {
        this.uv_index = uv_index;
    }

    public float getUv_warning() {
        return uv_warning;
    }

    public void setUv_warning(float uv_warning) {
        this.uv_warning = uv_warning;
    }

    public String getUv_desc() {
        return uv_desc;
    }

    public void setUv_desc(String uv_desc) {
        this.uv_desc = uv_desc;
    }

    public float getGolf_index() {
        return golf_index;
    }

    public void setGolf_index(float golf_index) {
        this.golf_index = golf_index;
    }

    public String getGolf_category() {
        return golf_category;
    }

    public void setGolf_category(String golf_category) {
        this.golf_category = golf_category;
    }

    public float getSeverity() {
        return severity;
    }

    public void setSeverity(float severity) {
        this.severity = severity;
    }

    public Date getFcst_valid() {
        return fcst_valid;
    }

    public void setFcst_valid(Date fcst_valid) {
        this.fcst_valid = fcst_valid;
    }

    public Date getFcst_valid_local() {
        return fcst_valid_local;
    }

    public void setFcst_valid_local(Date fcst_valid_local) {
        this.fcst_valid_local = fcst_valid_local;
    }

}
