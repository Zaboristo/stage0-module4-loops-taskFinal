package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        int level = 0;
        for (int y = 1; y <= cathetusLength; y++){
            for (int x = 1; x <= ((cathetusLength * 2) + 1); x++) {
                while(x < cathetusLength - level) {
                    System.out.print(" ");
                    x++;
                }
                for (int printer = cathetusLength - x + 1; x <= cathetusLength + level; x++){
                    System.out.print(printer);
                    if (x < cathetusLength)
                        printer--;
                    else printer++;
                }

            }
            System.out.println();
            level++;

        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
