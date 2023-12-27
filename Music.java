interface Playable {
   void play();

   void pause();

   void stop();

   void skip();
}

class Radio implements Playable {
   private String station;

   public Radio(String station) {
      this.station = station;
   }

   @Override
   public void play() {
      System.out.println("Playing station: " + station);
   }

   @Override
   public void pause() {
      System.out.println("Pausing radio playback");
   }

   @Override
   public void stop() {
      System.out.println("Stopping radio");
   }

   @Override
   public void skip() {
      System.out.println("Skipping to the next station");
   }
}

class CDPlayer implements Playable {
   private String[] tracks;
   private int currentTrack;

   public CDPlayer(String[] tracks) {
      this.tracks = tracks;
      currentTrack = 0;
   }

   @Override
   public void play() {
      System.out.println("Playing track: " + tracks[currentTrack]);
   }

   @Override
   public void pause() {
      System.out.println("Pausing CD playback");
   }

   @Override
   public void stop() {
      System.out.println("Stopping CD playback");
   }

   @Override
   public void skip() {
      if (currentTrack < tracks.length - 1) {
         currentTrack++;
         System.out.println("Skipping to the next track: " + tracks[currentTrack]);
      } else {
         System.out.println("No more tracks to skip to");
      }
   }
}

class StreamingService implements Playable {
   private String[] playlist;
   private int currentTrack;

   public StreamingService(String[] playlist) {
      this.playlist = playlist;
      currentTrack = 0;
   }

   @Override
   public void play() {
      System.out.println("Playing track from streaming service: " + playlist[currentTrack]);
   }

   @Override
   public void pause() {
      System.out.println("Pausing streaming service playback");
   }

   @Override
   public void stop() {
      System.out.println("Stopping streaming service playback");
   }

   @Override
   public void skip() {
      if (currentTrack < playlist.length - 1) {
         currentTrack++;
         System.out.println("Skipping to the next track: " + playlist[currentTrack]);
      } else {
         System.out.println("No more tracks to skip to");
      }
   }
}

// Example usage:
public class Music {
   public static void main(String[] args) {
      Radio radio = new Radio("Classic Rock FM");
      CDPlayer cdPlayer = new CDPlayer(new String[] { "Track 1", "Track 2", "Track 3" });
      StreamingService streamingService = new StreamingService(new String[] { "Song A", "Song B", "Song C" });

      radio.play();
      cdPlayer.play();
      streamingService.play();

      radio.skip();
      cdPlayer.skip();
      streamingService.skip();
   }
}