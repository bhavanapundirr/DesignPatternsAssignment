package net.media.training.designpattern.composite;

 interface FileSystemComponent {
     int getSize();
     boolean exists(String name);
     Directory getParent();
     public String getName();
     public void delete();

}
