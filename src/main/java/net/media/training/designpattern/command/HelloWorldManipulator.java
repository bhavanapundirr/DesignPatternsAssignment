package net.media.training.designpattern.command;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 20, 2011
 * Time: 4:55:07 PM
 * To change this template use File | Settings | File Templates.
 */
public class HelloWorldManipulator {

    public void manipulateWithCommandPattern(final String fileName, final String newPath) {
        Command createCommand = new CreateCommand(fileName, "hello world");
        Command updateCommand = new UpdateCommand(fileName, "new hello world");
        Command moveCommand = new MoveCommand(fileName, newPath);

        Invoker invoker = new Invoker();

        // Execute the commands
        try {
            invoker.execute(createCommand);
            invoker.execute(updateCommand);
            invoker.execute(moveCommand);
        } catch (Exception e) {
            // Handle any exception if needed
            e.printStackTrace();
        }
    }

    private void delete(String fileName) {
        // Existing delete method
    }

    private void move(String source, String destination) {
        // Existing move method
    }

    private void update(String fileName, String content) {
        // Existing update method
    }

    private void create(String fileName, String content) {
        // Existing create method
    }
}
