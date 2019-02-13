package com.cuixb.structuralpattern.adapter.mediaPlayer;

import com.cuixb.structuralpattern.adapter.mediaPlayer.advancedMediaPlayer.AdvancedMediaPlayer;
import com.cuixb.structuralpattern.adapter.mediaPlayer.MediaPlayer;
import com.cuixb.structuralpattern.adapter.mediaPlayer.advancedMediaPlayer.Mp4Player;
import com.cuixb.structuralpattern.adapter.mediaPlayer.advancedMediaPlayer.VlcPlayer;

public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("vlc") ){
            advancedMusicPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMusicPlayer.playVlc(fileName);
        }else if(audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer.playMp4(fileName);
        }
    }
}