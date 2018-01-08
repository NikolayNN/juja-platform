package juja.microservices.slack.archive.service;

import juja.microservices.slack.archive.model.dto.ChannelDTO;

import java.util.List;

public interface ChannelService {
    void saveChannels(List<ChannelDTO> channelsDTO);

    List<ChannelDTO> getChannels();
}
