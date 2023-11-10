package com.spring.implementation.controllerV2;

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
@RequestMapping("/itemsV2")
public class ItemsControllerV2 {

	@Autowired
	ItemsRepository itemsRepo;

	@PostMapping("/save")
	public Items save(@RequestBody Items items) {
		return itemsRepo.save(items);
	}

	@GetMapping("getData")
	public List<Items> getData() {
		return itemsRepo.findAll();
	}

	@PostMapping("/delete")
	public String deteleData() {
		itemsRepo.deleteAll();
		return "Data deleted successfully.";
	}
}
