package net.media.training.designpattern.command;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class CreateCommand implements Command {
    private final String fileName;
    private final String content;

    public CreateCommand(String fileName, String content) {
        this.fileName = fileName;
        this.content = content;
    }

    @Override
    public void execute() {
        File file = new File(fileName);
        if (file.exists()) {
            throw new RuntimeException("File already exists");
        }

        try {
            file.createNewFile();
            PrintWriter writer = new PrintWriter(file);
            writer.write(content);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void undo() {
        File file = new File(fileName);
        if (file.exists()) {
            file.delete();
        }
    }
}
