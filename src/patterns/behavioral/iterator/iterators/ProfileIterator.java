package patterns.behavioral.iterator.iterators;

import patterns.behavioral.iterator.profile.Profile;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}