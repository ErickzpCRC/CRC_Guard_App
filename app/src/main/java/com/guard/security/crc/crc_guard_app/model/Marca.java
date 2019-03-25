package com.guard.security.crc.crc_guard_app.model;

public class Marca {
    private int dbId;
    private String imei;
    private String nfcData;
    private String horaMarca;
    private String lat;
    private String lng;
    private String estado;


    private String num_serial;

    public Marca(int pDbId, String pImei, String pNfcData, String pNumSerial, String pHoraMarca, String pLat, String pLng, String pEstado) {
        this.dbId = pDbId;
        this.imei = pImei;
        this.nfcData = pNfcData;
        this.horaMarca = pHoraMarca;
        this.lat = pLat;
        this.lng = pLng;
        this.estado = pEstado;
        this.num_serial = pNumSerial;
    }

    public Marca(String pImei, String pNfcData, String pHoraMarca, String pLat, String pLng) {
        this.imei = pImei;
        this.nfcData = pNfcData;
        this.horaMarca = pHoraMarca;
        this.lat = pLat;
        this.lng = pLng;
    }

    public Marca(String pImei, String pNfcData, String pNumSerial, String pHoraMarca, String pLat, String pLng) {
        this.imei = pImei;
        this.nfcData = pNfcData;
        this.horaMarca = pHoraMarca;
        this.lat = pLat;
        this.lng = pLng;
        this.num_serial = pNumSerial;
    }

    public String getNum_serial() {
        return num_serial;
    }

    public void setNum_serial(String num_serial) {
        this.num_serial = num_serial;
    }

    public int getDbId() {
        return dbId;
    }

    public void setDbId(int dbId) {
        this.dbId = dbId;
    }

    public String getNfcData() {
        return nfcData;
    }

    public void setNfcData(String nfcData) {
        this.nfcData = nfcData;
    }

    public String getHoraMarca() {
        return horaMarca;
    }

    public void setHoraMarca(String horaMarca) {
        this.horaMarca = horaMarca;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }
}
