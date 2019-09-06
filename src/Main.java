import ru.progwards.java1.lessons.bitsworld.EgtsDirectionAndSpeed;

public class Main {

    public static void main(String[] args) {
        byte b = 0b01111111;
        short s = 0b00111111_11111111;
        System.out.println(EgtsDirectionAndSpeed.getDirection(b, s));
        System.out.println("Hello World!");
    }
}
