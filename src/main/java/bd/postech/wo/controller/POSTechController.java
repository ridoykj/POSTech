package bd.postech.wo.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import bd.postech.wo.dao.InitRepo;
import bd.postech.wo.model.Init;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class POSTechController {
	
	@Autowired
	InitRepo initrepo;
	
	@GetMapping(path = "/api")
	public List<Init> testRequest() {
		List<Init> list = initrepo.findAll();
		list.forEach(x -> log.info(x.toString()));
		return list.stream().collect(Collectors.toList());
	}

}
