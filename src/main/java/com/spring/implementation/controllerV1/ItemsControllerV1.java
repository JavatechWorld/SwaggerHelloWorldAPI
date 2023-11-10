package com.spring.implementation.controllerV1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.implementation.model.Items;
import com.spring.implementation.repository.ItemsRepository;

@RestController
@RequestMapping("/itemsV1")
public class ItemsControllerV1 {

	@Autowired
	ItemsRepository itemsRepo;

	@Deprecated
	@PostMapping("/save")
	public Items save(@RequestBody Items items) {
		return itemsRepo.save(items);
	}

	@Deprecated
	@GetMapping("getData")
	public List<Items> getData() {
		return itemsRepo.findAll();
	}
	@Deprecated
	@PostMapping("/delete")
	public String deteleData() {
		itemsRepo.deleteAll();
		return "Data deleted successfully.";
	}
}
