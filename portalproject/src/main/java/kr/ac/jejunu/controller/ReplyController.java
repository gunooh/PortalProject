package kr.ac.jejunu.controller;

import kr.ac.jejunu.mapper.ReplyMapper;
import kr.ac.jejunu.model.Reply;
import kr.ac.jejunu.model.User;
import kr.ac.jejunu.repository.ReplyRepository;
import kr.ac.jejunu.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

/**
 * Created by park-gunwoo on 2017. 6. 13..
 */

@Controller
public class ReplyController {

    @Autowired
    private ReplyRepository replyRepository;




    @RequestMapping(value={"/" , "/index"})
    public String index(Model model){
        List<Reply> list = replyRepository.findAll();
        model.addAttribute("list", list);
        return "index";
    }


    @RequestMapping("/write")
    public String write(Model model){
        return "write";
    }

    @RequestMapping("/login")
    public String login(Model model){
        return "login";
    }

//    @RequestMapping("/signup")
//        public String signup(Model model){
//            return "signup";
//    }

    @RequestMapping(value="/write",method=RequestMethod.GET)
    public String writepage(Model model)
    {
        return "write";
    }

    @RequestMapping(value="/update",method=RequestMethod.GET)
    public String update(@RequestParam String id, Model model) throws Exception
    {
        Reply reply = replyRepository.findOne(Integer.parseInt(id));

        model.addAttribute("id", reply);

        return "update";
    }

    @RequestMapping(value="/good",method=RequestMethod.POST)
    public String good(@RequestParam String id, @RequestParam int good, Model model) throws Exception
    {
        Reply reply = replyRepository.findOne(Integer.parseInt(id));

        reply.setGood(good+1);
        replyRepository.save(reply);

        return "redirect:/";
    }

    @RequestMapping(value="/bad",method=RequestMethod.POST)
    public String bad(@RequestParam String id, @RequestParam int bad, Model model) throws Exception
    {
        Reply reply = replyRepository.findOne(Integer.parseInt(id));

        reply.setBad(bad+1);
        replyRepository.save(reply);

        return "redirect:/";
    }


    @RequestMapping(value="/post", method=RequestMethod.POST)
    public String write(Reply reply) throws Exception{

        replyRepository.save(reply);
        return "redirect:/";
    }


    @RequestMapping(value="/delete", method=RequestMethod.POST)
    public String delete(@RequestParam String id, Model model) throws Exception{
        replyRepository.delete(Integer.parseInt(id));
        return "redirect:/";
    }

    @RequestMapping(value="/updatecomment", method=RequestMethod.POST)
    public String updatecomment(@RequestParam String id,@RequestParam String name, @RequestParam String comment,  Model model) throws Exception{

        Reply reply = replyRepository.findOne(Integer.parseInt(id));

        reply.setName(name);
        reply.setComment(comment);
        replyRepository.save(reply);

        return "redirect:/";
    }

}
