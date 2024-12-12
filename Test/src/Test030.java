public class Test030 {
    int x;
    int y;
    public void doStuffy(int x, int y) {
        x = x;
        y = this.y;
    }
    public void display () {
        System.out.print(x + " " + y + " : ");
    }
    public static void main(String[] args) {
        Test030 m1 = new Test030();
        m1.x = 100;
        m1.y = 200;
        Test030 m2 = new Test030();
        m2.doStuffy(m1.x, m1.y);
        m1.display();
        m2.display();
    }
}