package com.example.demo;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Testcontroller {

	  @Autowired
	  EntityManager em;	
	
@RequestMapping("/hi")	
  public String getji() {
	  return "HIiiiii";
  }
	
@RequestMapping(value="/getdata/{id}/{name}/{sal}")
@Transactional
	public Employe getDemo(@PathVariable("id") long id,@PathVariable("name") String name,@PathVariable("sal") long sal) {
		System.out.println("===========");
		
		Employe e1=new Employe();
		
		e1.setId(id);
		e1.setName(name);
		e1.setSal(sal);
		em.persist(e1);
		
		
		return e1;
	}
	
	
}
