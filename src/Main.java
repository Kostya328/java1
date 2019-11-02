import ru.progwards.java1.lessons.basics.Wrappers;
import ru.progwards.java1.lessons.bitsworld.CheckBit;
import ru.progwards.java1.lessons.bitsworld.EgtsDirectionAndSpeed;
import ru.progwards.java1.lessons.bitsworld.SumBits;

public class Main {

    public static void main(String[] args) {
        byte b = 55;

        short i = 0b111111111111111;
        System.out.println(Wrappers.sumInBinString("11", "11"));
        System.out.println(i);
        System.out.println(Integer.toBinaryString(i));
    }
}
