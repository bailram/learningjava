# Learning Java
Create class with attribute
```java
public class PersegiPanjang {
    int panjang = 10;
    int lebar = 5;
}
```
Add method to the class that has been created
```java
...
    public int volume(int p, int l) {
        return p*l;
    }
...
```
Add constructor to the class that has been created
```java
    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
```
Do encapsulation to the PersegiPanjang class with changing attribute to private and add setter and getter for attribute
```java
    ...

    private int panjang;
    private int lebar;
    
    ...

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }
    
    ...
```

Do Inheritance with create new PersegiPanjangRun class
```java
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
```