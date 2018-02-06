package cn.com.tontron.res.data.simple.controller;

import cn.com.tontron.res.common.component.EasyJsonComponent;
import cn.com.tontron.res.data.simple.base.jpa.JpaRepositoryImpl;
import cn.com.tontron.res.data.simple.service.IBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by yangyang on 2018/2/6.
 */
@RestController
@RequestMapping("/")
public class ResDataController {
    @Autowired
    private ApplicationContext applicationContext;
    @Autowired
    private EasyJsonComponent easyJsonComponent;

    @RequestMapping(value = "/{entity}/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Object getEntity(@PathVariable(value = "entity") String entity,
                            @PathVariable(value = "id") Long id) {
        JpaRepositoryImpl jpaRepository = (JpaRepositoryImpl) applicationContext.getBean(entity + "Repo");
        return jpaRepository.findOne(id);
    }

    @RequestMapping(value = "/{entity}", method = RequestMethod.POST)
    @ResponseBody
    public Object postEntity(@PathVariable(value = "entity") String entity, HttpServletRequest request) throws IOException {
        JpaRepositoryImpl jpaRepository = (JpaRepositoryImpl) applicationContext.getBean(entity + "Repo");
        return jpaRepository.save(easyJsonComponent.readValue(request.getInputStream(), jpaRepository.getDomainClass()));
    }

    @RequestMapping(value = "/{entity}/search", method = RequestMethod.POST)
    @ResponseBody
    public Object searchEntity(@PathVariable(value = "entity") String entity, HttpServletRequest request) throws IOException {
        IBaseService service = (IBaseService) applicationContext.getBean(entity + "Service");
        return service.findAll(request);
    }
}
