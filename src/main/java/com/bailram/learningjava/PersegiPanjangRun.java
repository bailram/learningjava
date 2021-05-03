package com.bailram.learningjava;

public class PersegiPanjangRun extends PersegiPanjang{
    public PersegiPanjangRun(int panjang, int lebar) {
        super(panjang, lebar);
    }

    public int getValuePanjang(){
        return this.getPanjang();
    }

    public void setValuePanjang(int panjang){
        this.setPanjang(panjang);
    }

    public static void main(String[] args) {
        PersegiPanjangRun main = new PersegiPanjangRun(5,5);
        main.setPanjang(10);
        System.out.println(main.getValuePanjang());
    }
}
