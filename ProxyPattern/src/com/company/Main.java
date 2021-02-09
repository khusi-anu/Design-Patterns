package com.company;

public class Main {

    public static void main(String[] args) {

        Videos video1 = new Videos("Mr. Robot", Type.ACTION, 1);
        Videos video2 = new Videos("System Design", Type.ROMANTIC,2);
        Videos video3 = new Videos("Design Pattern", Type.COMEDY,3);


        YouTubeLib lib = new CachedYouTubeClass();
        YouTubeCatalog.addVideo(video1);
        YouTubeCatalog.addVideo(video2);
        YouTubeCatalog.addVideo(video3);

        lib.getVideoInfo(2);
        lib.listVideos(Type.ACTION);
        lib.downloadVideo(2);
    }
}
