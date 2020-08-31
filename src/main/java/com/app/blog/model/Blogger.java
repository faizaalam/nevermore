package com.app.blog.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Blogger extends User {
    private String id;
    private List<BlogPost> blogPosts;
    private List<Blogger> followers;
    private List<Blogger> following;
}
