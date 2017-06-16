package kr.ac.jejunu.repository;

import kr.ac.jejunu.model.Reply;
import kr.ac.jejunu.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by park-gunwoo on 2017. 6. 15..
 */


@Repository
public interface UserRepository extends JpaRepository<User, Integer>
{

}
