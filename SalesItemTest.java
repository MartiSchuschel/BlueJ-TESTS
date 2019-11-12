import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalesItemTest {

    @Test
    void getName() {
        SalesItem salesIte1 = new SalesItem("Java for Dummies", 5000);
        assertEquals("Java for Dummies", salesIte1.getName());
    }

    @Test
    void getPrice() {
        SalesItem salesIte1 = new SalesItem("Java for Dummies", 5000);
        assertEquals(5000, salesIte1.getPrice());
}

    @Test
    void getNumberOfComments() {
        SalesItem salesIte1 = new SalesItem("Java for Dummies", 5000);
        assertEquals(0, salesIte1.getNumberOfComments());
    }

    @Test
    void addComment() {
        SalesItem salesIte1 = new SalesItem("Java for Dummies", 5000);
        assertEquals(true, salesIte1.addComment("Herbert", "Super Duper", 5));

    }

    @Test
    void findMostHelpfulComment() {
    }
}