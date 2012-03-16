package net.buziuk.blog.service;

import net.buziuk.blog.domain.Topic;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Илья
 * Date: 4.3.12
 * Time: 9.56
 * To change this template use File | Settings | File Templates.
 */
public interface TopicService {

    public void addTopic(Topic topic);

    public List<Topic> listTopic();

    public void removeTopic(Integer id);

    public void editTopic(Topic topic);

    public Topic fetchById(Integer id);
}
