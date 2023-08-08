package net.media.training.designpattern.command;

import java.io.File;

public class MoveCommand implements Command {
    private final String source;
    private final String destination;

    public MoveCommand(String source, String destination) {
        this.source = source;
        this.destination = destination;
    }

    @Override
    public void execute() {
        File file = new File(source);
        if (!file.exists()) {
            throw new RuntimeException("File does not exist");
        }

        if (!file.renameTo(new File(destination))) {
            throw new RuntimeException("Rename failed");
        }
    }

    @Override
    public void undo() {
        File file = new File(destination);
        if (!file.exists()) {
            throw new RuntimeException("File does not exist");
        }

        if (!file.renameTo(new File(source))) {
            throw new RuntimeException("Undo move failed");
        }
    }
}
