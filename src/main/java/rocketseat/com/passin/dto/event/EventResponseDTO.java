package rocketseat.com.passin.dto.event;

import rocketseat.com.passin.domain.event.Event;

public class EventResponseDTO {
    EventDetailsDTO event;

    public EventResponseDTO(Event event, Integer numberOfAttendees) {
        this.event = new EventDetailsDTO(
                event.getId(),
                event.getTitle(),
                event.getDetails(),
                event.getSlug(),
                event.getMaximumAttendees(),
                numberOfAttendees);
    }
}
