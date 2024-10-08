package ru.practicum.EndpointHit;

import org.mapstruct.Mapper;
import ru.practicum.EndpointHitDto;

@Mapper(componentModel = "spring")
public interface EndpointHitMapper {
    EndpointHit endpointHitDtoToEndpointHit(EndpointHitDto endpointHitDto);

    EndpointHitDto endpointHitToEndpointHitDto(EndpointHit endpointHit);
}

