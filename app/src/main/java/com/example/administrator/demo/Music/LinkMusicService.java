package com.example.administrator.demo.Music;

public interface LinkMusicService {
    public void StartMusic();
    public void PauseMusic();
    public void NextMusic();
    public void BackMusic();
    public int getDuration();
    public int getCurrenPosition();
    public void Seekto(int mesc);
    public void setUrl(String musicurl);
    public void Continue();
    public boolean getisOnCompletion();
}
