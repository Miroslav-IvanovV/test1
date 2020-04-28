package pack;

import java.util.Random;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        int hits = 0;
        while (true) {

            System.out.print("movement  ");
            Scanner moveInput = new Scanner(System.in);
            int movement = moveInput.nextInt();
            if (movement == 0) System.out.print("forward \n");
            if (movement == 1) System.out.print("jump \n");
            if (movement == 2) System.out.print("go sideway \n");
            if (movement == 10) System.out.print("robot is going to sleep, GG IZI \n");
            if (movement == 10) break;

            if (mauseIsInfront() && furnituresAreSave()) {
                System.out.print("one mause less \n");
                hits++;
                for(int i = 10; i > 0; i--) {
                    if(i % 2 == 0){
                        System.out.print("I am a Robottttt " + i + "\n");
                    }
                }
            } else{
                System.out.print("there is no target for robot \n");
            }

            if(hits == 4){
                System.out.print("Robot is runnig out of battery \n");
                if(!reCharege()){
                    System.out.print("Robot is ded QQ RIP robot \n");
                    break;
                }
            }

        }
    }
         public static boolean mauseIsInfront(){
            System.out.print("pixels ");
            Scanner pixsels = new Scanner(System.in);
            int infront = pixsels.nextInt();

            if(infront % 2 == 0) return true;
            else return false;

        }
          public static boolean furnituresAreSave(){
              Random rand = new Random();
              int random = rand.nextInt(10) + 1;
              if(random == 5) return false;
              else return true;
        }
            public static boolean reCharege(){
                Random rand1 = new Random();
                int random1 = rand1.nextInt(1000) + 1;
                Random rand2 = new Random();
                int random2 = rand2.nextInt(1000) + 1;
                if(random1 == random2) reCharege();
                if(random1 > random2) return true;
                else return false;

            }
    }
