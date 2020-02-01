package ip.command;

import ip.Ui;
import ip.task.TaskList;

public class InvalidCommand extends Command {
    private String msg;

    public InvalidCommand(String msg) {
        this.msg = msg;
    }

    @Override
    public void execute(TaskList tasks, Ui ui) {
        ui.displayError(msg);
    }
}
