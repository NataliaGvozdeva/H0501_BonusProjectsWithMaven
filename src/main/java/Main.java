import com.sun.source.util.SourcePositions;
import ru.netology.h0501bonusprojectswithmaven.services.BonusService;
import ru.netology.h0501bonusprojectswithmaven.services.SqrtService;

public class Main {
    public static void main(String[] args) {

        int amount = 2_000;
        boolean registered = true;

        BonusService bonusService = new BonusService();

        long bonus = bonusService.calculate(amount,registered);

        System.out.println("Количество бонусов = " + bonus);

        SqrtService service = new SqrtService();
        System.out.println(service.calcSqrt(27));

    }
}