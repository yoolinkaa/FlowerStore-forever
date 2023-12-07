package db;

import order.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Connection {
    public static Connection thisConnection;
    public List<Integer> ids;

    public Connection() {
        this.ids  = new ArrayList<>();
    }
    public static Connection getConnection() {
        if (thisConnection == null){
             thisConnection = new Connection();
        }
        return thisConnection;
    }

    public void addUserId(User user){
        ids.add(user.id);
    }

    public void removeUserId(User user){
        for (int i = 0; i < ids.size(); i++){
            if (Objects.equals(ids.get(i), user.id))
                ids.remove(i);
        }
    }
}
