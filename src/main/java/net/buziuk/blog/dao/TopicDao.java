package net.buziuk.blog.dao;

import net.buziuk.blog.domain.Topic;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Илья
 * Date: 3.3.12
 * Time: 14.36
 * To change this template use File | Settings | File Templates.
 */
public interface TopicDao {

    public void addTopic(Topic topic);

    public List<Topic> listTopic();

    public void removeTopic(Integer id);

    public void editTopic(Topic topic);

    public Topic fetchById(Integer id);
}
