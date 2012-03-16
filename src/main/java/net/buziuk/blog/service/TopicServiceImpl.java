package net.buziuk.blog.service;

import net.buziuk.blog.dao.TopicDao;
import net.buziuk.blog.domain.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Илья
 * Date: 4.3.12
 * Time: 9.59
 * To change this template use File | Settings | File Templates.
 */
@Service
public class TopicServiceImpl implements TopicService {

    @Autowired
    private TopicDao topicDao;

    @Transactional
    public void addTopic(Topic topic) {
        topicDao.addTopic(topic);
    }

    @Transactional
    public List<Topic> listTopic() {
        return topicDao.listTopic();
    }

    @Transactional
    public void removeTopic(Integer id) {
        topicDao.removeTopic(id);
    }

    @Transactional
    public void editTopic(Topic topic) {
        topicDao.editTopic(topic);
    }

    @Transactional
    public Topic fetchById(Integer id) {
        return topicDao.fetchById(id);
    }

}
