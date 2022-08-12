package com.StudioGhibli.pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Film {
    private String id;
    private String title;
    private String original_title;
    private String original_title_romanised;
    private String image;
    private String movie_banner;
    private String description;
    private String director;
    private String producer;
    private String release_date;
    private String running_time;
    private String rt_score;
    private List<String> people;
    private List<String> species;
    private List<String> locations;
    private List<String> vehicles;
    private String url;

    @Override
    public String toString() {
        return "Film{" +
                "id='" + id + '\'' +
                ",\n title='" + title + '\'' +
                ",\n original_title='" + original_title + '\'' +
                ",\n original_title_romanised='" + original_title_romanised + '\'' +
                ",\n image='" + image + '\'' +
                ",\n movie_banner='" + movie_banner + '\'' +
                ",\n description='" + description + '\'' +
                ",\n director='" + director + '\'' +
                ",\n producer='" + producer + '\'' +
                ",\n release_date='" + release_date + '\'' +
                ",\n running_time='" + running_time + '\'' +
                ",\n rt_score='" + rt_score + '\'' +
                ",\n people=" + people +
                ",\n species=" + species +
                ",\n locations=" + locations +
                ",\n vehicles=" + vehicles +
                ",\n url='" + url + '\'' +
                '}';
    }
}
