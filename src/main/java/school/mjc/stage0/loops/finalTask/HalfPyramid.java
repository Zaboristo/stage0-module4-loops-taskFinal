package school.mjc.stage0.loops.finalTask;

import javax.print.attribute.standard.Finishings;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        int initX = 1;
        for (int y = 1; y <= cathetusLength; y++){
            for (int x = 1; x <= cathetusLength; x++){
                while(x <= cathetusLength-initX){
                    System.out.print(" ");
                    x++;
                }
                System.out.print("*");
            }
            System.out.println();
            initX++;
        }

    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
