package net.buziuk.blog.dao;

import net.buziuk.blog.domain.Topic;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Илья
 * Date: 3.3.12
 * Time: 14.46
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class TopicDaoImpl implements TopicDao {

    @Autowired
    private SessionFactory sessionFactory;

    public void addTopic(Topic topic) {
        sessionFactory.getCurrentSession().save(topic);
    }

    @SuppressWarnings("unchecked")
    public List<Topic> listTopic() {
        return sessionFactory.getCurrentSession().createQuery("from Topic")
                .list();
    }

    public void removeTopic(Integer id) {
        Topic topic = (Topic) sessionFactory.getCurrentSession().load(
                Topic.class, id);
        if (null != topic) {
            sessionFactory.getCurrentSession().delete(topic);
        }
    }

    public void editTopic(Topic topic) {
        Session session = sessionFactory.getCurrentSession();
        /*       Topic existingTopic = (Topic) session.get(Topic.class, topic.getId());
                existingTopic.setBrief(topic.getBrief());
                existingTopic.setDate(topic.getDate());
                existingTopic.setText(topic.getText());
                existingTopic.setTitle(topic.getTitle());
        */
        session.update(topic);
    }


    public Topic fetchById(Integer id) {
        Session session = sessionFactory.getCurrentSession();

        Topic topic = (Topic) session.get(Topic.class, id);

        return topic;
    }
}
