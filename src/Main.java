import ru.progwards.java1.lessons.bitsworld.CheckBit;
import ru.progwards.java1.lessons.bitsworld.EgtsDirectionAndSpeed;
import ru.progwards.java1.lessons.bitsworld.SumBits;

public class Main {

    public static void main(String[] args) {
        byte b = -128;
        int i = 3;
        System.out.println(SumBits.sumBits(b));
        System.out.println(b);
        System.out.println(Integer.toBinaryString(b));
    }
}
