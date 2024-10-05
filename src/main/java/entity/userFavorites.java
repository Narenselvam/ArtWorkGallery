package entity;
import java.util.List;

public class userFavorites {

    private int id;
    private int userId;
    private List<Integer> artworkIds;


    public userFavorites(){}

    public userFavorites(int id, int userId, List<Integer> artworkIds) {
        this.id = id;
        this.userId = userId;
        this.artworkIds = artworkIds;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }
    public List<Integer> getArtworkIds() { return artworkIds; }
    public void setArtworkIds(List<Integer> artworkIds) { this.artworkIds = artworkIds; }
}
