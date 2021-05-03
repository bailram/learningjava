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