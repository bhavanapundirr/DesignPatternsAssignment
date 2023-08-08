public interface FileOperations {
    void writeToFile(String filePath, String content) throws IOException;
    String readFromFile(String filePath) throws IOException;
}