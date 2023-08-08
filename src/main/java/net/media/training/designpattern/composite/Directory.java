package net.media.training.designpattern.composite;

import java.util.List;
import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: joelrosa
 * Date: Jul 19, 2011
 * Time: 9:18:51 PM
 * To change this template use pre_refactoring.File | Settings | pre_refactoring.File Templates.
 */
public class Directory implements FileSystemComponent{
    private String name;
    private List<FileSystemComponent> components = new ArrayList<>();
    private Directory parent;

    public String getName() {
        return name;
    }

    public Directory(String name, List<FileSystemComponent> components) {
        this.name = name;
        this.components = components;
    }

    public int getSize() {

        int sum = 0;
        for (FileSystemComponent component : components) {
            sum += component.getSize();
        }

        return sum;
    }

    public void setParent(Directory directory) {
        this.parent = directory;
    }

    public void delete() {
        while (components.size() > 0) {
            FileSystemComponent component = components.get(0);
            component.getParent().components.remove(component);
        }

        if (parent != null) {
            parent.components.remove(this);
        }
    }

    public void add(FileSystemComponent component) {
        components.add(component);
    }

    public boolean exists(String name) {
        for (FileSystemComponent component : components) {
            if (component instanceof File && component.exists(name)) {
                return true;
            } else if (component instanceof Directory && component.exists(name)) {
                return true;
            }
        }

        return false;
    }

    public List<FileSystemComponent> getComponents() {
        return components;
    }

    public Directory getParent() {
        return parent;
    }
}
