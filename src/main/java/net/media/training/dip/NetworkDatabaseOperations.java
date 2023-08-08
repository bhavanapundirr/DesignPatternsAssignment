public interface NetworkDatabaseOperations {
    String fetchDataFromNetwork(String url) throws IOException;
    void writeToDatabase(String inputString);
}