package dao;

import entity.Artwork;
import java.util.ArrayList;

import java.util.List;

public class ArtWorkImpl implements IVirtualArtGallery{

    private List<Artwork> artworks = new ArrayList<>();

    @Override
    public boolean addArtwork(Artwork artwork) {
        return artworks.add(artwork);
    }

    @Override
    public boolean updateArtwork(Artwork artwork) {
        return false;
    }

    @Override
    public boolean removeArtwork(int artwork) {
        return false;
    }

    @Override
    public Artwork getArtworkById(int artworkId) {
        return null;
    }

    @Override
    public List<Artwork> searchArtworks(String keyword) {
        return List.of();
    }

    @Override
    public boolean addArtworkToFavorite(int userId, int artworkId) {
        return false;
    }

    @Override
    public boolean removeArtworkFromFavorite(int userid, int artworkId) {
        return false;
    }

    @Override
    public List<Artwork> getUserFavoriteArtworks(int userId) {
        return List.of();
    }
}
