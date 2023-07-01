package Test;

import java.sql.SQLException;

import orm.database.connection.DatabaseConnection;
import orm.database.connection.PostgresConnection;

public class AppConnection extends PostgresConnection {

    public AppConnection() {
    }

    public AppConnection(String string, String string2, String string3) throws SQLException {
        super(string, string2, string3);
    }

    @Override
    public DatabaseConnection defaultConnection() throws SQLException {
        return new AppConnection("jdbc:postgresql://localhost:5432/harbor_flow", "walker", "w41k4z!");
    }
}
