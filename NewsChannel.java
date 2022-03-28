package ru.corruptzero;

public class NewsChannel implements Channel {
    private String news;
    private String name;

    public NewsChannel(String name) {
        this.name = name;
    }

    @Override
    public void update(Object news) {
        this.setNews((String) news);
    }

    public void setNews(String news) {
        this.news = news;
    }

    public String getNews() {
        return news;
    }


}