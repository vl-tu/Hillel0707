package Mentor_lection.lessons_08_24.Task_1;

public class Guitarist extends Musician {
    public Guitarist(String MusicianName) {
        super(MusicianName);
    }

    @Override
    public void play() {
        System.out.println(this.MusicianName + "Play on Guitars");
    }
}

