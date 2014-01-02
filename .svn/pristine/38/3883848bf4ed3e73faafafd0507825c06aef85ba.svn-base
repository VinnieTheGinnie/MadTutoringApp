package com.umdmobile.tutoring.structures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*  @author UMD Mobile Apps Development Club
 */

public class EventCalendar { // TODO tests

/**
  *  Comparator to permit sorting by start time. If
  *  two events' start times are equal, this sorts on
  *  end time instead; if one of them is null, that
  *  item is said to be larger.
  */
  private static final Comparator<Event> SORT_BY_DATE =
    new Comparator<Event>() {
      @Override
      public int compare(final Event o1, final Event o2) {
        if (o1 == null) return 1;
        else if (o2 == null) return -1;
        else if (o1.mStart == o2.mStart)
          return Long.compare(o1.mEnd, o2.mEnd);
        else return Long.compare(o1.mStart, o2.mStart);
      }
  };

  /**
   *  List of all one-time events. Sorted according to
   *  the above comparator.
   */
  private List<Event> mOneTimeEvents = new ArrayList<Event>();

  /**
   *  List of all recurring events. This list is unsorted.
   */
  private List<RecurringEvent> mRecurringEvents = new ArrayList<RecurringEvent>();

  /**
   *  Puts a one-time event in this calendar.
   *  @param e is the Event to add.
   */
  public void addEvent(final Event e) {
    mOneTimeEvents.add(e);
    Collections.sort(mOneTimeEvents, SORT_BY_DATE);
  }

  /**
   *  Puts a recurring event in this calendar.
   *  @param e is the Event to add.
   *  @param repeatIntervalMillis is the time from the
   *    event's start time until when it should next start.
   */
   public void addEvent(final Event e, final long repeatIntervalMillis) {
    if (Collections.binarySearch(mOneTimeEvents, e, SORT_BY_DATE) >= 0) {
      return;
    }
    mRecurringEvents.add(new RecurringEvent(e, repeatIntervalMillis));
    Collections.sort(mRecurringEvents, SORT_RECURRING_BY_DATE);
  }

  /**
   *  Removes an event. If the event is recurring, this
   *  removes all instances.
   *  @param e is the event to remove.
   */
  public void removeEvent(final Event e) {
    final int otIndex = Collections.binarySearch(mOneTimeEvents, e, SORT_BY_DATE);
    if (otIndex < 0) {
      mRecurringEvents.remove(new RecurringEvent(e, 0));
    } else {
      mOneTimeEvents.remove(otIndex);
    }
  }

  /**
   *  Finds all of the events that start within the given range.
   *  @param queryStart is the start of the range query,
   *    in millis since the epoch.
   *  @param duration is the length of time of the query,
   *    in millis.
   */
  public List<Event> getEvents(final long queryStart, final long duration) {
    final List<Event> returnable = new ArrayList<Event>();
    int index = Math.abs(
        Collections.binarySearch(
            mOneTimeEvents,
        new Event(){{mStart = queryStart}}, // Don't write Java like I do
            SORT_BY_DATE));
    while(index < mOneTimeEvents.length
        && mOneTimeEvents.get(index).mStart < queryStart + duration) {
      returnable.add(index);
    }
    for (final RecurringEvent r : mRecurringEvents) {
       if (r.mInterval < duration ||
           queryStart - r.mEvent.mStart % r.mInterval < duration ||
           r.mEvent.mStart < queryStart
           && r.mEvent.mStart + r.mInterval > queryStart)
             returnable.add(index).mEvent; // TODO mod this by queryStart
    }
    return returnable;
    
  }

  private static class RecurringEvent {
    Event mEvent;
    long mInterval;

    RecurringEvent(final Event event, final long interval) {
      mEvent = event;
      mInterval = interval;
    }

    public boolean equals(final Object other) {
      if (other instanceof RecurringEvent) {
        return ((RecurringEvent) other).mEvent.equals(this);
      } else return false;
    }
  }
}
