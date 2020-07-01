package SeleniumTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PlayListTests extends BaseTest {

    @Test
    public void createPlayList_PlayListCreated() throws InterruptedException {
        String playlistId = mainPage.createPlayList("Playlist1");
        Assert.assertTrue(mainPage.checkPlayList(playlistId));
    }

    @Test
    public void renamePlayList_PlayListCreated() throws InterruptedException {
        String playlistId = mainPage.createPlayList("Playlist12");
        mainPage.renamePlayList(playlistId, "newName");
        Assert.assertTrue(mainPage.checkPlayList(playlistId), "newName");
    }
}

