package sample.Daletou;

import javax.sound.midi.Soundbank;
import java.util.Random;

public class Daletou {
    public static void main(String[] args) {
        Random random=new Random();
        int n1=random.nextInt(35);
        int n2=random.nextInt(35);
        int n3=random.nextInt(35);
        int n4=random.nextInt(35);
        int n5=random.nextInt(35);
        int n6=random.nextInt(12);
        int n7=random.nextInt(12);
        int x1=random.nextInt(35);
        int x2=random.nextInt(35);
        int x3=random.nextInt(35);
        int x4=random.nextInt(35);
        int x5=random.nextInt(35);
        int x6=random.nextInt(12);
        int x7=random.nextInt(12);
        int q1=random.nextInt(35);
        int q2=random.nextInt(35);
        int q3=random.nextInt(35);
        int q4=random.nextInt(35);
        int q5=random.nextInt(35);
        int q6=random.nextInt(12);
        int q7=random.nextInt(12);
        int w1=random.nextInt(35);
        int w2=random.nextInt(35);
        int w3=random.nextInt(35);
        int w4=random.nextInt(35);
        int w5=random.nextInt(35);
        int w6=random.nextInt(12);
        int w7=random.nextInt(12);
        int e1=random.nextInt(35);
        int e2=random.nextInt(35);
        int e3=random.nextInt(35);
        int e4=random.nextInt(35);
        int e5=random.nextInt(35);
        int e6=random.nextInt(12);
        int e7=random.nextInt(12);

        System.out.println("您好你的中奖号码为：");

        System.out.println(n1+" "+n2+" "+n3+" "+n4+" "+n5+"     "+ n6+" "+n7);
        System.out.println(x1+" "+x2+" "+x3+" "+x4+" "+x5+"     "+ x6+" "+x7);
        System.out.println(q1+" "+q2+" "+q3+" "+q4+" "+q5+"     "+ q6+" "+q7);
        System.out.println(w1+" "+w2+" "+w3+" "+w4+" "+w5+"     "+ w6+" "+w7);
        System.out.println(e1+" "+e2+" "+e3+" "+e4+" "+e5+"     "+ e6+" "+e7);

    }
}
