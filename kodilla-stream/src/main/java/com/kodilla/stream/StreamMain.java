package com.kodilla.stream;


import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamMain {
    public static void main(String[] args) {


        Forum forum = new Forum();
        Map<Integer, ForumUser> theResult = forum.getUserList().stream().filter(forumUser -> forumUser.getSex() == 'm').
                filter(forumUser -> LocalDate.from(forumUser.getBirthDay()).until(LocalDate.now(), ChronoUnit.YEARS) > 20).
                filter(forumUser -> forumUser.getNumberOfPosts() > 1).
                collect(Collectors.toMap(ForumUser::getId, forumUser -> forumUser));

        Iterator it = theResult.entrySet().iterator();
        while (it.hasNext()) {
            System.out.println(it.next());

        }
    }

}
