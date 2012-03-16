package net.buziuk.blog.web;

import net.buziuk.blog.domain.Topic;
import net.buziuk.blog.service.TopicService;
import net.buziuk.blog.validator.TopicValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: Илья
 * Date: 4.3.12
 * Time: 10.27
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class TopicController {

    private static final Logger logger = LoggerFactory.getLogger(TopicController.class);

    /*
    @InitBinder("topic")
    protected void initBinder(WebDataBinder binder){
        binder.setValidator(new TopicValidator());
    } */

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
        binder.setValidator(new TopicValidator());
    }

    @Autowired
    private TopicService topicService;


    @RequestMapping("/index")
    public String listTopics(Map<String, Object> map) {

        map.put("topic", new Topic());
        map.put("topicList", topicService.listTopic());

        return "allTopics";
    }

    @RequestMapping("/next")
    public String listTopicsAll(Map<String, Object> map) {
        map.put("topic", new Topic());
        map.put("topicList", topicService.listTopic());
        return "topic";
    }


    @RequestMapping("/author")
    public String readTopic() {
        return "author";
    }

    @RequestMapping("/")
    public String home() {
        return "redirect:/index";
    }


    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addTopic(@ModelAttribute("topic") Topic topic,
                           BindingResult result) {
        topicService.addTopic(topic);
        return "redirect:/index";
    }

    @RequestMapping("/delete/{topicId}")
    public String deleteTopic(@PathVariable("topicId") Integer topicId) {

        topicService.removeTopic(topicId);

        return "redirect:/index";
    }


    @RequestMapping(value = "/topic/edit", method = RequestMethod.GET)
    public String getEdit(@RequestParam(value = "id", required = true) Integer id,
                          Model model) {
        model.addAttribute("topicAttribute", topicService.fetchById(id));
        return "editPage";

    }

    @RequestMapping(value = "/topic/edit", method = RequestMethod.POST)
    public String saveEdit(@ModelAttribute("topicAttribute") Topic topic,
                           @RequestParam(value = "id", required = true) Integer id,
                           Model model) {
        topic.setId(id);
        topicService.editTopic(topic);
        model.addAttribute("id", id);
        return "editedPage";
    }


    @RequestMapping(value = "/topic/read", method = RequestMethod.GET)
    public String getTopic(@RequestParam(value = "id", required = true) Integer id,
                           Model model) {
        model.addAttribute("topicAttribute", topicService.fetchById(id));
        return "readPage";
    }

    /* TEST with validation */


    @RequestMapping(value = "/addT", method = RequestMethod.GET)
    public String home(Model model) {
        logger.trace("Passing through...");
        model.addAttribute("topic", new Topic());
        return "addPage";
    }

    @RequestMapping(value = "/addT", method = RequestMethod.POST)
    public String create(@Valid Topic topic, BindingResult result, Model model) {
        logger.trace("Saving action");
        model.addAttribute("topic", topic);
        if (!result.hasErrors()) {

            topicService.addTopic(topic);
            return "redirect:/index";
        }
        return "addPage";

    }

    @RequestMapping(value = "/topic/eit", method = RequestMethod.POST)
    public String saveEit(@ModelAttribute("topicAttribute") @Valid Topic topic, BindingResult result,
                          @RequestParam(value = "id", required = true) Integer id,
                          Model model) {

        if (!result.hasErrors()) {
            topic.setId(id);
            topicService.editTopic(topic);
            model.addAttribute("id", id);
            return "editedPage";
        }
        return "eitPage";
    }


    @RequestMapping(value = "/topic/eit", method = RequestMethod.GET)
    public String getEit(@RequestParam(value = "id", required = true) Integer id,
                         Model model) {
        logger.trace("Passing through...");
        model.addAttribute("topicAttribute", topicService.fetchById(id));
        return "eitPage";
    }

}
