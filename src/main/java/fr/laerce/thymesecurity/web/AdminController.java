package fr.laerce.thymesecurity.web;

import fr.laerce.thymesecurity.security.dao.UserDao;
import fr.laerce.thymesecurity.security.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


//@RequestMapping("/admin")
@Controller
public class AdminController {

    @Autowired
    private UserDao userDao;

        @GetMapping("/newpass")
//    @GetMapping("admin/newpass")
    public String newpass(Model model) {

        List<User> users = userDao.findAll();
        Iterable<User> users2 = userDao.findAll();
        model.addAttribute("listeUsers", users);
//        model.addAttribute("listeUsers2", users2);
        System.out.println("liste des utilisateurs: " + users);//
        return "newpass";
    }
}

