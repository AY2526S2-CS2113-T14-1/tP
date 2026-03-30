package seedu.interntrackr.command;

import seedu.interntrackr.exception.InternTrackrException;
import seedu.interntrackr.model.ApplicationList;
import seedu.interntrackr.storage.Storage;
import seedu.interntrackr.ui.Ui;

/**
 * Lists all deadlines for a specific application.
 */
public class DeadlineListCommand extends Command {

    private final int index;

    public DeadlineListCommand(int index) {
        this.index = index;
    }

    @Override
    public void execute(ApplicationList applications, Ui ui, Storage storage) throws InternTrackrException {
        // Skeleton only; TODO: logic will be implemented in a later commit
        ui.showMessage("Listing deadlines (not yet implemented)");
    }
}