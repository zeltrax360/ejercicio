package com.ejercicio.Ejercicio.Model;

import java.util.Date;


public class BookRequest {

    private Integer id;

    private String title;
    private String author;

    private String ibsn;

    private Date publishedDate;

    public BookRequest(Integer id, String title, String author, String ibsn, Date publishedDate) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.ibsn = ibsn;
        this.publishedDate = publishedDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIbsn() {
        return ibsn;
    }

    public void setIbsn(String ibsn) {
        this.ibsn = ibsn;
    }

    public Date getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(Date publishedDate) {
        this.publishedDate = publishedDate;
    }
}
