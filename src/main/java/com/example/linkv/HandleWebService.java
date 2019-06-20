package com.example.linkv;

public class HandleWebService {
    private final long id;
    private final String content;

    public HandleWebService(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
