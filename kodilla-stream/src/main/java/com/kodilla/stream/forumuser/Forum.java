package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    List<ForumUser> listOfUsers = new ArrayList<>();

    public Forum() {
        listOfUsers.add(new ForumUser(1, "Eryk", 'm', LocalDate.of(1980, 5, 15), 0));
        listOfUsers.add(new ForumUser(2, "Konrad", 'm', LocalDate.of(1900, 7, 20), 20));
        listOfUsers.add(new ForumUser(3, "Krzysztof", 'm', LocalDate.of(2010, 1, 5), 30));
        listOfUsers.add(new ForumUser(3, "Ewa", 'k', LocalDate.of(1998, 1, 5), 19));
        listOfUsers.add(new ForumUser(3, "Katarzyna", 'k', LocalDate.of(1991, 1, 5), 44));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList(listOfUsers);
    }
}
