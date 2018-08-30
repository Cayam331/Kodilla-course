package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest(){
        //Given
        Book book1 = new Book("hehe", "haha", 2000, "A1");
        Book book2 = new Book("hehehe", "hahaha", 2005, "B1");
        Book book3 = new Book("hehehehe", "hahahaha", 2010, "C1");
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        int result = medianAdapter.publicationYearMedian(bookSet);
        //Then
        Assert.assertEquals(2005, result);

    }
}
