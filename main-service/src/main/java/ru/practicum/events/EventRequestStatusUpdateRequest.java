package ru.practicum.events;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class EventRequestStatusUpdateRequest {
    private List<Integer> requestIds;
    private RequestStatus status;
}
