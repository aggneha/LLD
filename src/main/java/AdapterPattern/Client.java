package AdapterPattern;

public class Client {
    public static void main(String[] args) {
        SparkInfrastructure sparkInfrastructure = new Databricks();
        sparkInfrastructure.runQuery("");
    }
}
