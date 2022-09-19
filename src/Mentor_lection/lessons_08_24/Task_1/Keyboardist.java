package Mentor_lection.lessons_08_24.Task_1;

class Keyboardist extends Musician {
    public Keyboardist(String MusicianName) {
        super(MusicianName);
    }

    @Override
    public void play() {
        System.out.println(this.MusicianName + "Play on Keyboard");
    }
}
