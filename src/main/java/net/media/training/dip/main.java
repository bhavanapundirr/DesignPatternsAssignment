public class FileOperationsImpl implements FileOperations {
    public String readFromFile(String filePath) throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        }
        return content.toString();
    }

    public void writeToFile(String filePath, String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(content);
        }
    }
}

public class NetworkDatabaseOperationsImpl implements NetworkDatabaseOperations {
    private final MyDatabase database;

    public NetworkDatabaseOperationsImpl(MyDatabase database) {
        this.database = database;
    }

    public String fetchDataFromNetwork(String url) throws IOException {
        URLConnection connection = new URL(url).openConnection();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
            return content.toString();
        }
    }

    public void writeToDatabase(String inputString) {
        database.write(inputString);
    }
}
