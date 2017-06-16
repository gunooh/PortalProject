package kr.ac.jejunu.mapper;

import kr.ac.jejunu.model.Reply;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by park-gunwoo on 2017. 6. 16..
 */
public interface ReplyMapper  {

    public void replyInsert(Reply reply) throws Exception;

}
