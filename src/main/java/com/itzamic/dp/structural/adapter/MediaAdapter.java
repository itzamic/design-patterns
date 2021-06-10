package com.itzamic.dp.structural.adapter;

public class MediaAdapter implements MediaPlayer {
  private AdvancedMediaPlayer advancedMediaPlayer;

  public MediaAdapter(AudioType audioType) {
    switch (audioType) {
      case MP4:
        advancedMediaPlayer = new Mp4Player();
        break;
      case VLC:
        advancedMediaPlayer = new VlcPlayer();
        break;
      default:
        throw new IllegalArgumentException("The type you requested is not valid.");
    }
  }

  @Override
  public void play(AudioType audioType, String filename) {
    switch (audioType) {
      case VLC:
        advancedMediaPlayer.playVlc(filename);
        break;
      case MP4:
        advancedMediaPlayer.playMp4(filename);
        break;
      default:
        throw new IllegalArgumentException("The type you requested is not valid.");
    }
  }
}
