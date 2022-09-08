package com.example.demo.rest.dtos;

public class PictureDto extends  AbstractDto {
    private String fileName;
    private String url;

    public String getFileName() {
        return fileName;
    }
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
}
