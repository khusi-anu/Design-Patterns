package com.company;

import java.util.ArrayList;

enum Type{
    COMEDY,
        EDUCATION,
    ACTION,
    ROMANTIC
        }

class Videos {
    String title;
    Type type;
    Integer id;

    Videos(String title, Type type, Integer id)
    {
        this.title = title;
        this.type = type;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}

interface YouTubeLib {
    public ArrayList<Videos> listVideos(Type type);
    public String getVideoInfo(Integer id);
    public void downloadVideo(Integer id);
}

class YouTubeCatalog {

    static ArrayList<Videos> videos;
    static {
        videos = new ArrayList<>();
    }
    public static void addVideo(Videos video)
    {
        videos.add(video);
    }
}
class ThirdPartyYouTubeClass implements YouTubeLib{


    @Override
    public ArrayList<Videos> listVideos(Type type) {

        ArrayList<Videos> output = new ArrayList<>();
        int size = YouTubeCatalog.videos.size();
        for(Integer i = 0; i < size; i++)
        {
            if(YouTubeCatalog.videos.get(i).type == type)
                output.add(YouTubeCatalog.videos.get(i));
        }

        return output;
    }



    @Override
    public String getVideoInfo(Integer id) {

        String outputInfo = "";

        int size = YouTubeCatalog.videos.size();
        for (Integer i = 0; i < size; i++) {
            if (YouTubeCatalog.videos.get(i).id == id)
                outputInfo += YouTubeCatalog.videos.get(i).title + " " + YouTubeCatalog.videos.get(i).type;
        }

        return outputInfo;
    }

        @Override
    public void downloadVideo(Integer id) {

        String outputInfo = "";
            int size = YouTubeCatalog.videos.size();
            for (Integer i = 0; i < size; i++) {
                if (YouTubeCatalog.videos.get(i).id == id)
                    outputInfo += YouTubeCatalog.videos.get(i).title + " " + YouTubeCatalog.videos.get(i).type;
            }

            System.out.println(outputInfo);
    }
}

class CachedYouTubeClass implements YouTubeLib{

    ThirdPartyYouTubeClass obj;

    CachedYouTubeClass()
    {
        obj = new ThirdPartyYouTubeClass();
    }
    @Override
    public ArrayList<Videos> listVideos(Type type) {
        return obj.listVideos(type);
    }

    @Override
    public String getVideoInfo(Integer id) {
        return obj.getVideoInfo(id);
    }

    @Override
    public void downloadVideo(Integer id) {
        obj.downloadVideo(id);
    }
}