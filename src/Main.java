import ru.progwards.java1.lessons.bitsworld.CheckBit;
import ru.progwards.java1.lessons.bitsworld.EgtsDirectionAndSpeed;
import ru.progwards.java1.lessons.bitsworld.SumBits;

public class Main {

    public static void main(String[] args) {
        byte b = 55;

        short i = 0b111111111111111;
        System.out.println(EgtsDirectionAndSpeed.getDirection(b, i));
        System.out.println(i);
        System.out.println(Integer.toBinaryString(i));
    }
}
