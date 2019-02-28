package fr.laerce.thymesecurity.web;

import fr.laerce.thymesecurity.security.dao.UserDao;
import fr.laerce.thymesecurity.security.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;



@RequestMapping("/admin")
@Controller
public class AdminController {

    @Autowired
    private UserDao userDao;

//    @GetMapping("admin/newpass")
    @GetMapping("/userlist")
    public String userlist(Model model) {
        Iterable<User> users = userDao.findAll();
        model.addAttribute("userList", users);
        System.out.println("liste des utilisateurs: " + users);//
//        return "redirect:/admin/userlist";
//        return "admin/userlist";
        return "/userlist";
    }

//    @GetMapping("/newpass/{id}")
    @GetMapping("/newpass")
    public String newpass(Model model){
        Iterable<User> users = userDao.findAll();
        model.addAttribute("userList", users);
//        return "redirect:/admin/newpass";
//        return "admin/newpass";
        return "/newpass";
    }
}

