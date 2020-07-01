package seleniumTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.Test;


public class PlaylistTests extends BaseTest {
    @Test
    public void playlistTests_createPlaylist_playlistCreated() {
        var playlistId = mainPage.createPlaylist("Playlist TEST");
        Assert.assertTrue(mainPage.checkByUrl(playlistId));
    }

    @Test
    public void playlistTests_renamePlaylist_playlistRenamed() {
        mainPage.renamePlaylist("Playlist TEST", "Renamed Playlist");
        Assert.assertTrue(mainPage.checkNewName("Renamed Playlist"));
    }

    @Test
    public void playlistTests_addSongToPlaylist_songAdded(){
        var playlistId = mainPage.createPlaylist("Add Song Test");
        mainPage.addSongToPlaylist("Add Song Test");
        Assert.assertTrue(mainPage.checkSongAdded(playlistId));
    }

    @Test
    public void playlistTests_createPlaylist_playlistCreated1() {
        var playlistId = mainPage.createPlaylist("Playlist TEST");
        Assert.assertTrue(mainPage.checkByUrl(playlistId));
    }

    @Test
    public void playlistTests_renamePlaylist_playlistRenamed1() {
        mainPage.renamePlaylist("Playlist TEST", "Renamed Playlist");
        Assert.assertTrue(mainPage.checkNewName("Renamed Playlist"));
    }
}