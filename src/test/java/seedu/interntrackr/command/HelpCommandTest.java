package seedu.interntrackr.command;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import seedu.interntrackr.model.ApplicationList;
import seedu.interntrackr.ui.Ui;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class HelpCommandTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void execute_helpCommand_printsUserGuideLink() {
        ApplicationList applications = new ApplicationList();
        Ui ui = new Ui();
        HelpCommand helpCommand = new HelpCommand();

        helpCommand.execute(applications, ui, null);

        String output = outContent.toString();

        assertTrue(output.contains("Need help? You can view the full User Guide with all commands here:"),
                "Should print the help introduction message.");
        assertTrue(output.contains("https://ay2526s2-cs2113-t14-1.github.io/tp/UserGuide.html"),
                "Should print the correct User Guide URL.");
    }
}
