package com.example.demo.rest.dtos;

public class AbstractDto {
    private Long id;
    private long version;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public long getVersion() {
        return version;
    }
    public void setVersion(long version) {
        this.version = version;
    }
}
