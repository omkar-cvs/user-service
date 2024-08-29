package com.oks.user.beans;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
   private Long userId;
   private String name;
   private String phone;
   List<Contact> contacts=new ArrayList<>();
   public User(Long userId, String name, String phone) {
	super();
	this.userId = userId;
	this.name = name;
	this.phone = phone;
}


}
