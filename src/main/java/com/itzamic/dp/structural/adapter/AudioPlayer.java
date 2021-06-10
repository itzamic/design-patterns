package com.itzamic.dp.structural.adapter;

public class AudioPlayer implements MediaPlayer {
  private MediaAdapter mediaAdapter;

  @Override
  public void play(AudioType audioType, String filename) {
    if (AudioType.MP3.equals(audioType)) {
      System.out.println("Playing mp3 file. Name: " + filename);
    } else if (audioType.equals(AudioType.VLC) || audioType.equals(AudioType.MP4)) {
      mediaAdapter = new MediaAdapter(audioType);
      mediaAdapter.play(audioType, filename);
    } else {
      System.out.println("Invalid media. " + audioType + " format not supported.");
    }
  }
}
