public class Test002 {
    class c1 {}
    class c2 extends c1 {}
    class c3 extends c2 {}
    c1 obj1 = (c1)new c2();
    c2 obj2 = (c2)new c3();
    c2 obj3 = (c2)new c1();
    c3 obj4 = (c3) obj2;
}
