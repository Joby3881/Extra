//1.abstract metherod.
//abstract class shape{
//    abstract  void area();
//    abstract void volume();
//}
//class circle extends shape {
//
//
//    void area() {
//        System.out.println("area of circle");
//    }
//
//
//    void volume() {
//        System.out.println("circle volume");
//    }
//}
//class rectangle extends circle{
//    void area(){
//        System.out.println("area");
//    }
//    void volume(){
//        System.out.println("volume");
//    }
//}
//public class Main{
//    public static void main(String[] args) {
//        circle c=new circle();
//        c.area();
//        c.volume();
//        rectangle r=new rectangle();
//        r.area();
//        r.volume();
//    }
//}
//
//



//2.abstract methrod.
//abstract class bike {
//    abstract void horn();
//
//    abstract void engine();
//
//    abstract void tyre();
//
//    abstract void headlight();
//}
//
//class honda extends bike{
//        void horn(){
//        System.out.println("horn of honda");
//    }
//        void engine(){
//        System.out.println("engine of honda");
//    }
//    void tyre(){
//        System.out.println("tyre of honda");
//    }
//    void headlight(){
//        System.out.println("headlite of honda");
//    }
//}
//class hero extends bike{
//    void horn(){
//        System.out.println("horn of hero");
//    }
//    void engine(){
//        System.out.println("engine of hero");
//    }
//    void tyre(){
//        System.out.println("tyre of hero");
//    }
//    void headlight(){
//        System.out.println("headlite of hero");
//    }
//}
//class tvs extends bike{
//    void horn(){
//        System.out.println("horn of tvs");
//    }
//    void engine(){
//        System.out.println("engine of tvs");
//    }
//    void tyre(){
//        System.out.println("tyre of tvs");
//    }
//    void headlight(){
//        System.out.println("headlite of tvs");
//    }
//}
//class bullet extends bike{
//    void horn(){
//        System.out.println("horn of bullet");
//    }
//    void engine(){
//        System.out.println("engine of bullet");
//    }
//    void tyre(){
//        System.out.println("tyre of bullet");
//    }
//    void headlight(){
//        System.out.println("headlite of bullet");
//    }
//}
//public class Main{
//    public static void main(String[] args) {
//        honda h=new honda();
//        h.horn();
//        h.engine();
//        h.tyre();
//        h.headlight();
//        hero e=new hero();
//        e.horn();
//        e.engine();
//        e.tyre();
//        e.headlight();
//        tvs t=new tvs();
//        t.horn();
//        t.engine();
//        t.tyre();
//        t.headlight();
//        bullet b=new bullet();
//        b.horn();
//        b.engine();
//        b.tyre();
//        b.headlight();
//    }
//}

abstract class smartphone {
    abstract void camera();

    abstract void video();

    abstract void youtube();

    abstract void google();

    abstract void charger();

    abstract void sim();
}
class vivo extends smartphone{
    void camera(){
        System.out.println("camera of vivo");
    }
    void video(){
        System.out.println("video of vivo");
    }

    @Override
    void youtube() {
        System.out.println("youtube of vivo");
    }

    void google(){

        System.out.println("google of vivo");
    }

    @Override
    void charger() {
        System.out.println("charger of vivo");
    }

    @Override
    void sim() {
        System.out.println("sim of vivo");
    }

}
class samsung extends smartphone{
    void camera(){
        System.out.println("camera of samsung");
    }

    @Override
    void video() {
        System.out.println("video of samsung");
    }

    @Override
    void youtube() {
        System.out.println("youtube of samsung");
    }

    @Override
    void google() {
        System.out.println("google of samsung");
    }

    @Override
    void charger() {
        System.out.println("charger of samsung");
    }

    @Override
    void sim() {
        System.out.println("sim of samsung");
    }
}
class oppo extends smartphone{

    @Override
    void camera() {
        System.out.println("camera of oppo");
    }

    @Override
    void video() {
        System.out.println("video of oppo");
    }


    @Override
    void youtube() {
        System.out.println("youtube of vivo");
    }

    @Override
    void google() {
        System.out.println("google of oppo");
    }

    @Override
    void charger() {
        System.out.println("charger of oppo");
    }

    @Override
    void sim() {
        System.out.println("sim of oppo");
    }
}
class oneplus extends smartphone{

    @Override
    void camera() {
        System.out.println("camera of oneplus");
    }

    @Override
    void video() {
        System.out.println("video of one plus");
    }

    @Override
    void youtube() {
        System.out.println("youtube of oneplus");
    }

    @Override
    void google() {
        System.out.println("google of oneplus");
    }

    @Override
    void charger() {
        System.out.println("charger of oneplus");
    }

    @Override
    void sim() {
        System.out.println("sim of oneplus");
    }
}
class nokia extends smartphone{

    @Override
    void camera() {
        System.out.println("camera of one nokia");
    }

    @Override
    void video() {
        System.out.println("video of nokia");
    }

    @Override
    void youtube() {
        System.out.println("youtube of nokia");
    }

    @Override
    void google() {
        System.out.println("google of nokia");
    }

    @Override
    void charger() {
        System.out.println("charger of nokia");
    }

    @Override
    void sim() {
        System.out.println("sim of nokia");
    }
}
class infinex extends smartphone{

    @Override
    void camera() {
        System.out.println("camera of infinex");
    }

    @Override
    void video() {
        System.out.println("video of infinex");
    }

    @Override
    void youtube() {
        System.out.println("youtube of infenex");
    }

    @Override
    void google() {
        System.out.println("google of infenex");
    }

    @Override
    void charger() {
        System.out.println("charger of infenex");
    }

    @Override
    void sim() {
        System.out.println("sim of infenex");
    }
}
public class Main {

    public static void main(String[] args) {
      infinex i=new infinex();
      i.camera();
      i.video();
      i.youtube();
      i.google();
      i.charger();
      i.sim();
      nokia n=new nokia();
      n.camera();
      n.video();
      n.youtube();
      n.google();
      n.camera();
      n.google();
      n.charger();
      n.sim();
      oneplus o=new oneplus();
        o.camera();
        o.video();
        o.youtube();
        o.google();
        o.charger();
        o.sim();
        oppo p=new oppo();
        p.camera();
        p.video();
        p.youtube();
        p.google();
        p.charger();
        p.sim();
        samsung s=new samsung();
        s.camera();
        s.video();
        s.youtube();
        s.google();
        s.charger();
        s.sim();
        vivo v=new vivo();
        v.camera();
        v.video();
        v.youtube();
        v.google();
        v.charger();
        v.sim();

    }
}
