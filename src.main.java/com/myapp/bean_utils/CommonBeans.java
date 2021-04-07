package com.myapp.bean_utils;

import java.util.Iterator;

public abstract class CommonBeans<E> {
	 public abstract Iterator<E> iterator();
	
	  /**
	     * Returns a string representation of this collection.  The string
	     * representation consists of a list of the collection's elements in the
	     * order they are returned by its iterator, enclosed in square brackets
	     * ({@code "[]"}).  Adjacent elements are separated by the characters
	     * {@code ", "} (comma and space).  Elements are converted to strings as
	     * by {@link String#valueOf(Object)}.
	     *
	     * @return a string representation of this collection
	     */
	    public String toString() {
	        Iterator<E> it = iterator();
	        if (! it.hasNext())
	            return "[]";

	        StringBuilder sb = new StringBuilder();
	        sb.append('[');
	        for (;;) {
	            E e = it.next();
	            sb.append(e == this ? "(this Collection)" : e);
	            if (! it.hasNext())
	                return sb.append(']').toString();
	            sb.append(',').append(' ');
	        }
	    }

	}

