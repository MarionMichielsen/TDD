import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class NameTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {

    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @Test
    public void checkIfFirstCharIsCapital(){
        Name.name ("Jonathan");
    }

    @Test
    public void checkEndsWithDot(){
       assertTrue(Name.checkLastChar("Kalle."));
    }
}