package com.imshakthi.snippets;

import static java.time.ZonedDateTime.parse;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import lombok.Builder;

public class DoctoLibAssignment {

  private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");

  public Map<String, List<String>> getAvailableSlots(final ZonedDateTime startDate) {
    Map<String, List<String>> availableSLots = new HashMap<>();

    final var allEvents = getAllEventsBetween(startDate, startDate.plusDays(6));

    IntStream.range(0, 6)
        .mapToObj(startDate::plusDays)
        .forEach(
            date -> {
              final var todayEvents =
                  allEvents.stream()
                      .filter(event -> event.startsAt().toLocalDate().equals(date.toLocalDate()))
                      .toList();

              final var opening =
                  todayEvents.stream()
                      .filter(event -> event.type().equals("opening"))
                      .findFirst()
                      .orElse(Event.builder().type("opening").build());

              availableSLots.compute(get(date), (k, v) -> v == null ? List.of() : v);
            });

    return availableSLots;
  }

  private List<Event> getAllEventsBetween(
      final ZonedDateTime startDate, final ZonedDateTime endDate) {
    return List.of(
        Event.builder()
            .type("appointment")
            .startsAt(parse("2025-01-14T09:00:00Z"))
            .endsAt(parse("2025-01-14T17:00:00Z"))
            .build());
  }

  private String get(final ZonedDateTime date) {
    return date.format(DATE_FORMATTER);
  }
}

@Builder
record Event(String type, ZonedDateTime startsAt, ZonedDateTime endsAt) {}
