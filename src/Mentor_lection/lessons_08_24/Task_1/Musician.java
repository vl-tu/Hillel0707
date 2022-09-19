package Mentor_lection.lessons_08_24.Task_1;


class Musician {
    protected String MusicianName;

    public void play() {
        System.out.println(this.MusicianName + "Play on any instrument");
    }

    public Musician(String musicianName) {
        this.MusicianName = musicianName;
    }

}
