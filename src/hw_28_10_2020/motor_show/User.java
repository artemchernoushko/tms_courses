package hw_28_10_2020.motor_show;

public class User {
    void InfoAllAuto(MotorShow motorShow) {
        if (motorShow.getAuto().isEmpty()) {
            System.out.println("There are no cars at the moment");
        } else {
            int n = 1;
            for (Auto auto : motorShow.getAuto()) {
                System.out.println(n + " - " + auto.toString());
                n++;
            }
        }
    }

    void InfoAuto(MotorShow motorShow, int index) {
        try {
            System.out.println(motorShow.getAuto(index).toString());
        } catch (java.lang.IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            System.out.println("There are no cars at the moment");
        }
    }
}
