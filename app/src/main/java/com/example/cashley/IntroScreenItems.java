package com.example.cashley;

public class IntroScreenItems {

    String text1, text2;
    int img1;

    public IntroScreenItems(String text1, String text2, int img1) {
        this.text1 = text1;
        this.text2 = text2;
        this.img1 = img1;
    }

    public String getText1() {
        return text1;
    }

    public void setText1(String text1) {
        this.text1 = text1;
    }

    public String getText2() {
        return text2;
    }

    public void setText2(String text2) {
        this.text2 = text2;
    }

    public int getImg1() {
        return img1;
    }

    public void setImg1(int img1) {
        this.img1 = img1;
    }
}
