package ru.corruptzero;

public class Main {
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();
        NewsChannel bbc = new NewsChannel("BBC");
        NewsChannel rt = new NewsChannel("Russia Today");
        NewsChannel skyNews = new NewsChannel("Sky News");
        agency.addChannel(bbc);
        agency.addChannel(rt);
        agency.addChannel(skyNews);
        agency.setNews("Some news");
        System.out.println(
                bbc.getNews().equals("Some news")
                && rt.getNews().equals("Some news")
                && skyNews.getNews().equals("Some news")
        );
    }
}
