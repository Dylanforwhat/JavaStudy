class Book {int pages;}
class App{
    int count;
    private int cout;

    public void method (Book x, int k) {
        x.pages = 100;
        this.cout = k;
        k = 200;
    }
}
public class Test044 {
    public static void main(String[] args) {
        App obj = new App();
        Book objBook = new Book();
        System.out.println(objBook.pages + ":" + obj.count);
        obj.method(objBook, obj.count);
        System.out.println(objBook.pages + ":" + obj.count);
    }
}