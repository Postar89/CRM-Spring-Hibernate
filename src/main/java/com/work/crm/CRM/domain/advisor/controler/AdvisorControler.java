package com.work.crm.CRM.domain.advisor.controler;

import com.work.crm.CRM.domain.advisor.entity.Advisor;
import com.work.crm.CRM.domain.advisor.entity.AdvisorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/advisor")
@CrossOrigin("http://localhost:3000")
public class AdvisorControler {
   
    @Autowired
    AdvisorService service;

    @GetMapping
    public List<Advisor> getAll()
    {
        return this.service.getAll();
    }

    @GetMapping("{id}")
    public Advisor getAdvisor(@PathVariable long id)
    {
        return this.service.getWithId(id);
    }

    @PostMapping
    public void createAdvisor(@RequestBody Advisor source)
    {
        this.service.createNew(source);
    }

    @PutMapping("/{id}")
    public void updateAdvisor(@PathVariable long id, @RequestBody Advisor source)
    {
        this.service.update(id, source);
    }

    @DeleteMapping("/{id}")
    public void deleteAdvisor(@PathVariable long id)
    {
        this.service.delete(id);
    }
}
