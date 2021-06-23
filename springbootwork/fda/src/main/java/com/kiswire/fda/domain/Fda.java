package com.kiswire.fda.domain;
import java.sql.Timestamp;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Document("fda")
public class Fda {
		
	
	@Id
	private String _id; // 몽고에서 만들어지는 ObjectId		
	
	private Long id;	
	private String name; // fda001, fda002
	private String group; // 1,2

	@Field(name = "plcR0001")
	private String plcR0001;

	// UTC로 들어가기 때문에 꼭 9시간 더해서 옮기기
	@Field(name = "plcR0001Timestamp")
	private Date plcR0001Timestamp;
	//private String plcR0001Timestamp;
	

	@Field(name = "plcR0001Quality")
	private Integer plcR0001Quality;

	@Field(name = "r0035")
	private String r0035;

	@Field(name = "r0036")
	private String r0036;

	@Field(name = "r0037")
	private String r0037;

	@Field(name = "r0038")
	private String r0038;

	@Field(name = "r0039")
	private String r0039;

	@Field(name = "r0040")
	private String r0040;

	@Field(name = "r0041")
	private String r0041;

	@Field(name = "r0042")
	private String r0042;

	@Field(name = "r0043")
	private String r0043;

	@Field(name = "r0044")
	private String r0044;

	@Field(name = "r0002")
	private String r0002;

	@Field(name = "r0045")
	private String r0045;

	@Field(name = "r0046")
	private String r0046;

	@Field(name = "r0047")
	private String r0047;

	@Field(name = "r0048")
	private String r0048;

	@Field(name = "r0049")
	private String r0049;

	@Field(name = "r0050")
	private String r0050;

	@Field(name = "r0051")
	private String r0051;

	@Field(name = "r0052")
	private String r0052;

	@Field(name = "r0053")
	private String r0053;

	@Field(name = "r0054")
	private String r0054;

	@Field(name = "r0003")
	private String r0003;

	@Field(name = "r0055")
	private String r0055;

	@Field(name = "r0004")
	private String r0004;

	@Field(name = "r0005")
	private String r0005;

	@Field(name = "r0031")
	private String r0031;

	@Field(name = "r0032")
	private String r0032;

	@Field(name = "r0033")
	private String r0033;

	@Field(name = "r0034")
	private String r0034;
}
