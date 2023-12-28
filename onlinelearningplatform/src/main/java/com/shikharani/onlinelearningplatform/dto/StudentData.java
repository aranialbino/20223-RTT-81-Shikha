package com.shikharani.onlinelearningplatform.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentData {
	int serialNum;
	String title;
	String department;
	String description;
	String instructor;
	String startDate;
	String progress;
}
