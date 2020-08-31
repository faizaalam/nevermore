package com.app.blog.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.File;
import java.util.Date;
import java.util.List;

@Document
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BlogPost {
    private Long id;
    private Long revisionId;
    private String title;
    private Blogger author;
    private Date publishDate;
    private List<String> categories;
    private List<String> tags;
    private Integer likes;
    private Integer dislikes;
    private String content;
    private String excerpt;
    private File contentHtml;
    //TODO
    // comments, pictures, cover pictures, shares
}
