package OOPS;

interface Camera{
    void takePhoto();
    void recordVideo();
}

interface Internet{
    void browse();
    void download();
}

interface MusicPlayer{
    void playMusic();
    void stopMusic();
}

class SmartPhone implements Camera, Internet, MusicPlayer{
    @Override
    public void takePhoto() {
        System.out.println("Say cheese");
    }

    @Override
    public void recordVideo() {
        System.out.println("Video rolling");
    }

    @Override
    public void browse() {
        System.out.println("Browsing content");
    }

    @Override
    public void download() {
        System.out.println("Downloading content");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music");
    }

    @Override
    public void stopMusic() {
        System.out.println("Stop music");
    }
}

public class MultipleInheritance_17 {
    public static void main(String[] args) {
        Camera camera = new SmartPhone();
        Internet internet = new SmartPhone();
        MusicPlayer musicPlayer = new SmartPhone();

        camera.takePhoto();
        camera.recordVideo();
        internet.browse();
        internet.download();
        musicPlayer.playMusic();
        musicPlayer.stopMusic();
    }
}
