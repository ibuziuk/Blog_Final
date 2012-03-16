package net.buziuk.blog.domain;


import org.springframework.util.StringUtils;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: Илья
 * Date: 3.3.12
 * Time: 14.27
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "Topic")
public class Topic implements Serializable {

    @Id
    @Column(name = "ID")
    @GeneratedValue
    private Integer id;

    @Column(name = "title", unique = true, length = 50)
    private String title;

    @Column(name = "date", length = 20)
    private /*String*/ Date date;

    @Column(name = "text", unique = true, length = 500)
    private String text;

    @Column(name = "brief", unique = true, length = 200)
    private String brief;


    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getTitle() {
        return this.title;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {

        /* this.text = operationsWithText(text);*/

        this.text = operationsWithText(text);

        /*int endToCut = this.text.indexOf("<cut/>");
           if  (endToCut != -1) this.brief = this.text.substring(0, endToCut);

           String deleteCut = StringUtils.delete(text, "<cut/>");
           String firstChange = StringUtils.replace(deleteCut, "/>", "&gt");
           String saveText = StringUtils.replace(firstChange, "<", "&lt");

      this.text = saveText;*/

    }

    public String operationsWithText(String text) {
        this.text = text;
        int endToCut = this.text.indexOf("<cut/>");
        if (endToCut != -1) this.brief = this.text.substring(0, endToCut);

        String deleteCut = StringUtils.delete(text, "<cut/>");
        /*String firstChange = StringUtils.replace(deleteCut, ">", "&gt");
   String saveText = StringUtils.replace(firstChange, "<", "&lt");*/

        return deleteCut;
    }


    public String getBrief() {
        return this.brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }


}
