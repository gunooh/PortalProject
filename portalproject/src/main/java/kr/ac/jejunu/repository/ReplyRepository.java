package kr.ac.jejunu.repository;

import kr.ac.jejunu.model.Reply;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by park-gunwoo on 2017. 6. 15..
 */


@Repository
public interface ReplyRepository extends JpaRepository<Reply, Integer>
{

}
