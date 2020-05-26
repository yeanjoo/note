package kr.ac.jbnu.se.mobile.ganogano;

public class Note {
    String title;
    String tv1;
    String tv2;

    public Note(String title, String tv1, String tv2){
        this.title = title;
        this.tv1 = tv1;
        this.tv2 = tv2;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTv1() {
        return tv1;
    }

    public void setTv1(String tv1) {
        this.tv1 = tv1;
    }

    public String getTv2() {
        return tv2;
    }

    public void setTv2(String tv2) {
        this.tv2 = tv2;
    }
}
