package net.buziuk.blog.validator;

import net.buziuk.blog.domain.Topic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * Created by IntelliJ IDEA.
 * User: Илья
 * Date: 12.3.12
 * Time: 9.29
 * To change this template use File | Settings | File Templates.
 */


public class TopicValidator implements Validator {


    private static final Logger logger = LoggerFactory.getLogger(TopicValidator.class);

    public boolean supports(Class<?> clazz) {
        return Topic.class.equals(clazz);

    }


    public void validate(Object obj, Errors errors) {
//        Topic topic = (Topic) obj;
        logger.trace("Validating topic object");
        ValidationUtils.rejectIfEmpty(errors, "title", "title.empty", " <-- Title can't be empty");
//      ValidationUtils.rejectIfEmpty(errors, "date", "date.empty", "Date can't be empty" );
        ValidationUtils.rejectIfEmpty(errors, "text", "text.empty", " <-- Text can't be empty");
    }
}
/*      if (/*topic.getDate().length() < 10 ||  checkString(topic.getDate().toString()) == false)
         {
             errors.rejectValue("date", "errors.need.more.than.6.characters", " <-- incorrect format  ");
         }
  }

  public boolean checkString(String string){
      if(string == null || string.length() == 0) return false;
      if(string.charAt(4) != '-') return false;
      if(string.charAt(7) != '-') return false;

      int i = 0;


      char c;
      for (; i < string.length(); i++){
          c = string.charAt(i);
          if (!((c >= '0' && c <= '9') || c=='-')){
              return false;
          }
      }
      return true;
  }


}
*/