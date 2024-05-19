import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    @Test
    void checkCartEveryBranchConditionTests() {
        RuntimeException ex;
        ex = assertThrows(RuntimeException.class, () -> SILab2.checkCart(null, 0));
        assertTrue(ex.getMessage().contains("allItems list can't be null!"));

        Item item = new Item(null, null, 200, 20);
        List<Item> list = new ArrayList<>();
        list.add(item);
        ex = assertThrows(RuntimeException.class, () -> SILab2.checkCart(list, 0));
        assertTrue(ex.getMessage().contains("No barcode!"));

        Item item2 = new Item("tamara", "a", 200, 20);
        List<Item> list2 = new ArrayList<>();
        list2.add(item2);
        ex = assertThrows(RuntimeException.class, () -> SILab2.checkCart(list2, 20));
        assertTrue(ex.getMessage().contains("Invalid character in item barcode!"));

        Item item3 = new Item(null, "0123456789", 301, 20);
        List<Item> list3 = new ArrayList<>();
        list3.add(item3);
        assertFalse(() -> SILab2.checkCart(list3, 20));


        Item item4 = new Item(null, "0123456789", 200, 0);
        List<Item> list4 = new ArrayList<>();
        list4.add(item4);
        assertTrue(() -> SILab2.checkCart(list4, 200));

    }

    @Test
    void checkMultipleConditionsForBigIf() {
        // T T T - All conditions are True. Initially the sum(price) is greater than the payment,
        // but then is subtracted from by entering the if statement, returning true at the end.
        Item item = new Item(null, "0123456789", 301, 1);
        List<Item> list = new ArrayList<>();
        list.add(item);
        assertTrue(() -> SILab2.checkCart(list, 300));

        // F T T - First condition is false. The sum(price) is greater than the payment by only 10.
        // If the program enters the If statement it should subtract the sum by 30 and we get a failed test,
        // but that is not the case.
        Item item2 = new Item(null, "0123456789", 200, 1);
        List<Item> list2 = new ArrayList<>();
        list2.add(item2);
        assertFalse(() -> SILab2.checkCart(list2, 190));

        // T F T - Second condition is false. The sum(price) is greater than the payment by only 10.
        // If the program enters the If statement it should subtract the sum by 30 and we get a failed test,
        // but that is not the case.
        Item item3 = new Item(null, "0123456789", 200, 0);
        List<Item> list3 = new ArrayList<>();
        list3.add(item3);
        assertFalse(() -> SILab2.checkCart(list3, 190));

        // T T F - Third condition is false. The sum(price) is greater than the payment by only 10.
        // If the program enters the If statement it should subtract the sum by 30 and we get a failed test,
        // but that is not the case.
        Item item4 = new Item(null, "2", 200, 0);
        List<Item> list4 = new ArrayList<>();
        list4.add(item4);
        assertFalse(() -> SILab2.checkCart(list4, 190));
    }

}