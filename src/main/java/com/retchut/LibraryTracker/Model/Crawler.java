package com.retchut.LibraryTracker.Model;

public class Crawler {
    private String url;

    public Crawler(String name, String expansion){
        UrlBuilder urlBuilder = new UrlBuilder();
        this.url = urlBuilder.buildUrl(name, expansion);
    }

    public void crawl(){
        //do the actual crawling here
    }
}