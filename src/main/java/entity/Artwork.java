package entity;

public class Artwork {

    private int artWorkId;
    private String title;
    private String description;
    private String artist;


    public Artwork(){}

    public Artwork(int artWorkId,String title,String description,
                   String artist){
        this.artWorkId = artWorkId;
        this.artist = artist;
        this.description = description;
        this.title = title;
    }


    // Getters and setters
    public int getArtworkId() {
        return artWorkId;
    }

    public void setArtworkId(int artworkId) {
        this.artWorkId = artworkId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }



}
