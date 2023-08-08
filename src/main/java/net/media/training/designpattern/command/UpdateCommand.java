package net.media.training.designpattern.command;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class UpdateCommand implements Command {
    private final String fileName;
    private final String content;

    public UpdateCommand(String fileName, String content) {
        this.fileName = fileName;
        this.content = content;
    }

    @Override
    public void execute() {
        File file = new File(fileName);
        if (!file.exists()) {
            throw new RuntimeException("File: " + fileName + " does not exist");
        }

        try {
            PrintWriter writer = new PrintWriter(file);
            writer.write(content);
            writer.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void undo() {
        // You may want to store the original content before executing the update command
        // and use that to revert the file content during the undo operation.
    }
}
