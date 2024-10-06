package dao;

import entity.Artwork;
import entity.User;

import java.util.ArrayList;

import java.util.List;

public class ArtWorkImpl implements IVirtualArtGallery{

    private List<Artwork> artworks = new ArrayList<>();
    private List<User> users = new ArrayList<>();

    @Override
    public boolean addArtwork(Artwork artwork) {
        return artworks.add(artwork);
    }

    @Override
    public boolean updateArtwork(Artwork artwork) {
        for(Artwork art : artworks){
            if(art.getArtworkId() == artwork.getArtworkId()){
                art.setTitle(artwork.getTitle());
                art.setArtist(artwork.getArtist());
                art.setDescription(artwork.getDescription());
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean removeArtwork(int artworkId) {
        return artworks.removeIf(a -> a.getArtworkId() == artworkId);
    }

    @Override
    public Artwork getArtworkById(int artworkId) {
        for (Artwork art : artworks){
            if (art.getArtworkId() == artworkId) {
                return art;
        }
            }
        return null;
    }

    @Override
    public List<Artwork> searchArtworks(String keyword) {
        List<Artwork> result = new ArrayList<>();
        for (Artwork art : artworks){
            if(art.getTitle().contains(keyword) || art.getArtist().contains(keyword)){
                result.add(art);
            }
        }
        return result;
    }
    private User findUserById(int userId) {
        for (User user : users) {
            if (user.getUserId() == userId) {
                return user;
            }
        }
        return null;
    }
    @Override
    public boolean addArtworkToFavorite(int userId, int artworkId) {
        User user = findUserById(userId);
        Artwork artwork = getArtworkById(artworkId);
        if (user != null && artwork != null) {
            return user.addArtworkToFavorites(artwork);
        }
        return false;
    }

    @Override
    public boolean removeArtworkFromFavorite(int userId, int artworkId) {
        User user = findUserById(userId);
        Artwork artwork = getArtworkById(artworkId);
        if (user != null && artwork != null) {
            return user.removeArtworkFromFavorites(artwork);
        }
        return false;
    }

    @Override
    public List<Artwork> getUserFavoriteArtworks(int userId) {
        User user = findUserById(userId);
        if (user != null) {
            return user.getFavoriteArtworksList();
        }
        return new ArrayList<>();
    }
}
