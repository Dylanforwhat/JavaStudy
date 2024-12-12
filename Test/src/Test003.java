public class Test003 {
    public static void main(String[] args) {
       /* int x;
        for(x = 0;x < 100;++x){
            System.out.println(x);
        }*/
        int x;
        x = 100;
        while(x <= 100){
            x++;
            System.out.println("Welcome " + x);
        }

        int y;
        y = 100;
        do{
            ++y;
            System.out.println(y);
        }while(x < 100);

    }
}
