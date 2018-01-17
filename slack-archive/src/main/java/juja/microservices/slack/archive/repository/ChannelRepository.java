package juja.microservices.slack.archive.repository;

import juja.microservices.slack.archive.model.entity.Channel;
import juja.microservices.slack.archive.model.entity.RawChannel;

import java.util.List;

public interface ChannelRepository {
    List<Channel> getChannels();

    void saveRawChannels(List<RawChannel> channels);
}