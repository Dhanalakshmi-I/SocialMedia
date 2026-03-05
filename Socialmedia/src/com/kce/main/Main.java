package com.kce.main;

import com.kce.service.MediaService;

public class Main {

    public static void main(String[] args) {

        MediaService service = new MediaService();

        service.signup("Alice", 25, "New York", "Engineer");
        service.signup("Bob", 25, "San Francisco", "Designer");

        service.addFriend(1, 2);

        service.createPost(1, "Enjoying the sunny day in New York! #blessed");

        service.viewPosts();
        service.likePost(1);
    }
}