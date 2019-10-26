package seedu.address.logic.commands.datamanagement;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class RenameTagCommandTest {

    @Test
    public void constructor_nullTagName_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> new ViewTaggedCommand("exchange", null));
        assertThrows(NullPointerException.class, () -> new ViewTaggedCommand(null, "exchange"));
    }



}
