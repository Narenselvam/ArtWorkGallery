package dao;
import entity.Artwork;
import java.util.List;


public interface IVirtualArtGallery {

    //Artwork
    boolean addArtwork(Artwork artwork);
    boolean updateArtwork(Artwork artwork);
    boolean removeArtwork(int artwork);
    Artwork getArtworkById(int artworkId);
    List<Artwork> searchArtworks(String keyword);

    //User Favorites
    boolean addArtworkToFavorite(int userId , int artworkId);
    boolean removeArtworkFromFavorite(int userid , int artworkId);
    List<Artwork> getUserFavoriteArtworks(int userId);

}
