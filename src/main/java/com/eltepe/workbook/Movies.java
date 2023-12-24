package com.eltepe.workbook;

public class Movies {
    private String title;
    private String episode;
    private String rating;

    public Movies(String title, String episode, String rating){
        this.title = title;
        this.episode = episode;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getEpisode() {
        return episode;
    }
    
    public void setEpisode(String episode) {
        this.episode = episode;
    }
    
    public String getRating() {
        return rating;
    }
    
    public void setRating(String rating) {
        this.rating = rating;
    }
    
}
